package com.lion.project2.activity

import com.lion.project2.controller.MainController
import com.lion.project2.dao.AnimalInfoDAO
import com.lion.project2.model.AnimalModel
import com.lion.project2.util.ProgramState
import java.util.*
import kotlin.collections.ArrayList

class DeleteAnimalInfoActivity(var mainController: MainController) : BaseActivity() {
    // 동물들의 정보를 담을 ArrayList
    var animalList:ArrayList<AnimalModel>? = null

    // 정보를 입력받기 위한 스캐너
    lateinit var scanner: Scanner

    // 삭제할 동물의 리스트 번호
    var deleteNumber = 0

    override fun initActivity() {
        scanner = Scanner(System.`in`)
        // 동물 정보를 가져온다.
        animalList = AnimalInfoDAO.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        println()
        println("[ 동물 삭제 ]")
        if(animalList == null){
            println("동물 정보가 없습니다.")
        }else{
            // 동물 정보 출력
            printAnimalInfoAll()
            // 삭제 번호 입력
            inputDeleteNumber()
            // 동물 삭제
            deleteAnimal(deleteNumber)
        }
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 모든 동물 정보를 출력해주는 메서드
    fun printAnimalInfoAll(){
        animalList?.forEachIndexed { index, animal ->
            println()
            println("${index+1}번 동물")
            println("동물 종류 : ${animal.type}")
            println("동물 이름 : ${animal.name}")
        }
    }

    // 삭제할 동물 번호를 입력받는 메서드
    fun inputDeleteNumber(){
        println()
        print("삭제할 동물의 번호를 입력해주세요 : ")
        deleteNumber = scanner.nextInt()
    }

    // 전달받은 번호의 동물을 리스트에서 삭제하는 메서드
    fun deleteAnimal(deleteNumber:Int){
        // 동물 리스트 삭제
        animalList?.removeAt(deleteNumber-1)
        // 동물 리스트 저장
        AnimalInfoDAO.saveStudentInfoList(animalList!!)
        println("동물의 정보가 삭제되었습니다.")
    }
}