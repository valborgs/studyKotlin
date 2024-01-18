package com.lion.project2.activity

import com.lion.project2.controller.MainController
import com.lion.project2.dao.AnimalInfoDAO
import com.lion.project2.model.AnimalModel
import com.lion.project2.util.AnimalType
import com.lion.project2.util.ProgramState

class ShowAnimalInfoAllActivity(var mainController: MainController) : BaseActivity() {
    // 동물들의 정보를 담을 ArrayList
    var animalList:ArrayList<AnimalModel>? = null

    override fun initActivity() {
        // 동물 정보를 가져온다.
        animalList = AnimalInfoDAO.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {
    }

    override fun showActivity() {
        println()
        println("[ 모든 동물의 정보 출력 ]")
        // 저장된 동물 정보가 없다면
        if(animalList==null){
            println("동물 정보가 없습니다.")
        }else{
            // 모든 동물 정보 출력
            printAnimalInfoAll()
        }
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    //  전체 및 각 동물 별 마리 수 출력
    fun animalCounter(){
        var total = 0
        var lion = 0
        var tiger = 0
        var elephant = 0

        animalList?.forEach {
            total++
            when(it.type){
                AnimalType.LION.kor -> lion++
                AnimalType.TIGER.kor -> tiger++
                AnimalType.ELEPHANT.kor -> elephant++
            }
        }

        println("전체 동물의 수 : ${total}마리")
        println("사자 : ${lion}마리")
        println("호랑이 : ${tiger}마리")
        println("코끼리 : ${elephant}마리")
    }
    
    fun printAnimalInfoAll(){
        animalCounter()
        
        animalList?.forEach {
            println()
            it.printAnimalInfo()
        }
    }
}