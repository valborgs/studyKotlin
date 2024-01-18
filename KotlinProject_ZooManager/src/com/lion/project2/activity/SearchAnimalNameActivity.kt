package com.lion.project2.activity

import com.lion.project2.controller.MainController
import com.lion.project2.dao.AnimalInfoDAO
import com.lion.project2.model.AnimalModel
import com.lion.project2.util.ProgramState
import java.util.Scanner

class SearchAnimalNameActivity(var mainController: MainController) : BaseActivity() {
    // 동물들의 정보를 담을 ArrayList
    var animalList:ArrayList<AnimalModel>? = null

    // 검색할 동물 이름
    var searchName = ""

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
        println("[ 동물 이름 검색 ]")
        // 저장된 동물 정보가 없다면
        if(animalList==null){
            println("동물 정보가 없습니다.")
        }else{
            // 검색어를 입력받는다.
            inputSearchName()
            // 검색 결과를 출력한다.
            printSearchResult(searchName)
        }
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    fun inputSearchName(){
        print("검색할 동물의 이름을 입력해주세요 : ")
        searchName = scanner.next()
    }
    // 검색된 동물들의 정보를 출력하는 메서드
    fun printSearchResult(searchName:String){
        // 검색 결과 수
        var searchResultCounter = 0

        // 파일로 부터 모든 학생 정보를 읽어와서
        animalList?.forEach {
            // 반복문으로 돌리는 과정에서 검색한 이름과 같은 학생의 데이터만 출력
            if(it.name == searchName){
                // 학생 정보를 출력
                it.printAnimalInfo()
                searchResultCounter++
            }
        }
        // 검색된 학생이 없다면 출력
        if(searchResultCounter==0){
            println("검색 결과가 없습니다.")
        }
    }
}

