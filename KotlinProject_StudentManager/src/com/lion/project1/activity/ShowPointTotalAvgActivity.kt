package com.lion.project1.activity

import com.lion.project1.controller.MainController
import com.lion.project1.dao.UserInfoDAO
import com.lion.project1.model.StudentModel
import com.lion.project1.util.ProgramState

class ShowPointTotalAvgActivity(var mainController: MainController) : BaseActivity() {
    // 학생들의 정보를 담을 ArrayList
    var studentList:ArrayList<StudentModel>? = null

    // 평균과 총점을 담을 프로퍼티
    var korTotal = 0
    var engTotal = 0
    var mathTotal = 0
    var korAvg = 0.0
    var engAvg = 0.0
    var mathAvg = 0.0

    override fun initActivity() {
        // 학생 정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {
        if(studentList != null) {
            getPointTotal()
            getPointAvg()
        }
    }

    override fun showActivity() {
        println("[ 점수 통계 ]")
        if(studentList == null){
            println("저장된 학생 정보가 없습니다")
        }else{
            printPointTotalAvg()
        }
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 과목별 총점을 구하는 메서드
    fun getPointTotal(){
        studentList?.forEach {
            // 과목 별 총점을 구한다.
            korTotal += it.kor
            engTotal += it.eng
            mathTotal += it.math
        }
    }
    // 과목별 평균을 구하는 메서드
    fun getPointAvg(){
        var totalStudent = studentList!!.size
        korAvg = korTotal.toDouble() / totalStudent
        engAvg = engTotal.toDouble() / totalStudent
        mathAvg = mathTotal.toDouble() / totalStudent
    }
    // 모든 과목의 총점과 평균을 출력하는 메서드
    fun printPointTotalAvg(){
        println("국어 총점 : $korTotal")
        println("영어 총점 : $engTotal")
        println("수학 총점 : $mathTotal")
        println("국어 평균 : $korAvg")
        println("영어 평균 : $engAvg")
        println("수학 평균 : $mathAvg")
    }
}