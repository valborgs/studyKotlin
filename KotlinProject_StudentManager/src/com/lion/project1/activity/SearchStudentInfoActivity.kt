package com.lion.project1.activity

import com.lion.project1.controller.MainController
import com.lion.project1.dao.UserInfoDAO
import com.lion.project1.model.StudentModel
import com.lion.project1.util.ProgramState
import java.util.*
import kotlin.collections.ArrayList

class SearchStudentInfoActivity(var mainController: MainController) : BaseActivity() {
    // 학생들의 정보를 담을 ArrayList
    var studentList:ArrayList<StudentModel>? = null

    // 검색할 학생 이름
    var searchName = ""

    // 입력을 받기 위한 스캐너
    lateinit var scanner: Scanner

    override fun initActivity() {
        // 학생 정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()
        // 스캐너 생성
        scanner = Scanner(System.`in`)
    }

    override fun processActivity() {
    }

    override fun showActivity() {
        println()
        println("[ 학생 정보 검색 ]")
        // 저장된 학생 정보가 없다면
        if(studentList==null){
            println("학생 정보가 없습니다.")
        }else{
            // 검색어를 입력받는다.
            inputSearchName()
            // 검색 결과를 출력한다.
            printSearchResult(searchName)
        }
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 검색할 학생의 이름을 입력받는 기능
    fun inputSearchName(){
        print("검색할 학생 이름 : ")
        searchName = scanner.next()
    }

    // 검색된 학생들의 정보를 출력하는 메서드
    fun printSearchResult(searchName:String){
        // 검색 결과 수
        var searchResultCounter = 0

        // 파일로 부터 모든 학생 정보를 읽어와서
        studentList?.forEach {
            // 반복문으로 돌리는 과정에서 검색한 이름과 같은 학생의 데이터만 출력
            if(it.name == searchName){
                println()
                // 학생 정보를 출력
                it.printStudentInfo()
                searchResultCounter++
            }
        }
        // 검색된 학생이 없다면 출력
        if(searchResultCounter==0){
            println("검색 결과가 없습니다.")
        }
    }
    
}