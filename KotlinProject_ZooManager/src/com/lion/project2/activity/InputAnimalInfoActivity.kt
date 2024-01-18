package com.lion.project2.activity

import com.lion.project2.controller.MainController
import com.lion.project2.dao.AnimalInfoDAO
import com.lion.project2.model.AnimalModel
import com.lion.project2.model.ElephantModel
import com.lion.project2.model.LionModel
import com.lion.project2.model.TigerModel
import com.lion.project2.util.AnimalType
import com.lion.project2.util.ProgramState
import com.lion.project2.util.getAnimalType
import java.util.Scanner

class InputAnimalInfoActivity(var mainController: MainController) : BaseActivity() {

    // 입력된 동물의 정보를 담을 객체
    var animalList:ArrayList<AnimalModel>? = null
    // 동물의 정보를 입력받을 객체
    lateinit var animalModel:AnimalModel
    // 정보를 입력받기 위한 스캐너
    lateinit var scanner: Scanner

    override fun initActivity() {
        scanner = Scanner(System.`in`)
        // 동물 정보를 가져온다.
        animalList = AnimalInfoDAO.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {
    }

    override fun showActivity() {
        println()
        println("[ 동물 정보 입력 ]")
        // 현재 동물 수를 출력한다.
        showAnimalCnt()
        // 동물의 정보를 입력받는다.
        inputAnimalInfo()
        // 동물 정보를 파일에 쓴다.
        saveAnimalInfo()
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 현재 입력된 동물의 수를 보여주는 기능
    fun showAnimalCnt(){
        if(animalList != null){
            println("현재 입력된 동물 수 : ${animalList?.size}마리")
        } else{
            println("현재 입력된 동물 수 : 0마리")
        }

    }

    // 동물의 정보를 입력받는 기능
    fun inputAnimalInfo(){
        // 동물 종류
        var animalType = ""
        // 동물 종류 선택 번호
        var selectNumber = 0
        // 동물 이름
        var name = ""
        // 동물 나이
        var age = -1
        // 사자 털
        var hair = -1
        // 호랑이 줄무늬
        var stripe = -1
        // 코끼리 코 길이
        var noseLength = -1


        // 동물 종류 입력 받기
        do{
            try{
                print("동물 종류 (1.사자, 2.호랑이, 3.코끼리) : ")
                selectNumber = scanner.nextInt()
                if(selectNumber !in 1..3){
                    println("1 ~ 3까지의 값을 넣어주세요")
                }else{
                    animalType = getAnimalType(selectNumber)
                }
            }catch(e:Exception){
                println("동물 번호로 입력해주세요")
            }
        }while(selectNumber !in 1..3)


        // 동물 이름 입력 받기
        print("동물 이름 : ")
        name = scanner.next()

        // 동물 나이 입력 받기
        age = getAnimalProperty("동물 나이", 0, 200)

        // 동물 종류에 따라 특성 입력하고 객체 생성
        when(animalType){
            AnimalType.LION.kor -> {
                hair = getAnimalProperty("털의 개수", 0, 9999)
                animalModel = LionModel(animalType,name,age,hair)
            }
            AnimalType.TIGER.kor -> {
                stripe = getAnimalProperty("줄무늬 개수", 0, 9999)
                animalModel = TigerModel(animalType,name,age,stripe)
            }
            AnimalType.ELEPHANT.kor -> {
                noseLength = getAnimalProperty("코의 길이", 0, 100)
                animalModel = ElephantModel(animalType,name,age,noseLength)
            }
        }

    }




    fun getAnimalProperty(propertyName:String, min:Int, max:Int):Int{
        var property = -1
        do{
            try {
                print("${propertyName} : ")
                property = scanner.nextInt()
                if(property !in min..max){
                    println("${propertyName}는 ${min} ~ ${max}까지의 값을 넣어주세요")
                }
            }catch(e:Exception){
                println("${propertyName}는 숫자로 입력해주세요")
            }
        }while(property !in min..max)

        return property
    }

    // 입력받은 동물의 정보를 저장하는 기능
    fun saveAnimalInfo(){
        // ArrayList가 null이면 객체를 생성해준다.
        if(animalList == null){
            animalList = ArrayList<AnimalModel>()
        }

        // 객체를 ArrayList에 담아준다.
        animalList?.add(animalModel)
        // 파일에 저장한다.
        AnimalInfoDAO.saveStudentInfoList(animalList!!)
    }
}