package com.lion.project2.activity

import com.lion.project2.controller.MainController
import com.lion.project2.dao.AnimalInfoDAO
import com.lion.project2.model.AnimalModel
import com.lion.project2.util.AnimalType
import com.lion.project2.util.ProgramState
import com.lion.project2.util.getAnimalType
import java.util.*
import kotlin.collections.ArrayList

class SearchAnimalTypeActivity(var mainController: MainController):BaseActivity() {
    // 동물들의 정보를 담을 ArrayList
    var animalList:ArrayList<AnimalModel>? = null

    // 검색할 동물 종류
    var searchType = ""

    // 입력을 받기 위한 스캐너
    lateinit var scanner: Scanner

    override fun initActivity() {
        // 동물들의 정보를 가져온다.
        animalList = AnimalInfoDAO.getAnimalInfoList()

        // 스캐너 생성
        scanner = Scanner(System.`in`)
    }

    override fun beforeProcessActivity() {
    }

    override fun showActivity() {
        println()
        println("[ 동물 타입 검색 ]")
        // 저장된 동물 정보가 없다면
        if(animalList==null){
            println("동물 정보가 없습니다.")
        }else{
            // 검색어를 입력받는다.
            inputSearchType()
            // 검색 결과를 출력한다.
            printSearchResult(searchType)
        }
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    fun inputSearchType(){
        var selectNumber = 0

        do{
            println("다음 중 동물의 타입을 선택해주세요")
            println("1. 호랑이")
            println("2. 사자")
            println("3. 코끼리")
            print("동물 타입 선택 : ")

            try{
                selectNumber = scanner.nextInt()
            }catch(e:Exception){
                scanner.next()
                println("동물 번호로 입력해주세요")
                println()
                continue
            }

            if(selectNumber !in 1..3){
                println("1 ~ 3까지의 값을 넣어주세요")
                println()
            }else{
                searchType = getAnimalType(selectNumber)
            }

        }while(selectNumber !in 1..3)

    }

    // 검색된 동물들의 정보를 출력하는 메서드
    fun printSearchResult(searchName:String){
        // 검색 결과 없는 경우를 체크할 카운터
        var searchResultCounter = 0

        // 파일로 부터 모든 동물 정보를 읽어와서
        animalList?.forEach {
            // 반복문으로 돌리는 과정에서 검색한 종류와 같은 동물의 데이터만 출력
            if(it.type == searchType){
                // 동물 정보를 출력
                println()
                it.printAnimalInfo()
                searchResultCounter++
            }
        }
        // 검색된 동물이 없다면 출력
        if(searchResultCounter==0){
            println("검색 결과가 없습니다.")
        }
    }

}