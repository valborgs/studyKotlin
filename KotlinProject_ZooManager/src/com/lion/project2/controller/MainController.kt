package com.lion.project2.controller

import com.lion.project2.activity.*
import com.lion.project2.util.ProgramState

class MainController {
    // 상태값을 담을 변수
    var programStateValue = ProgramState.PROGRAM_STATE_SHOW_MENU

    // Activity 객체의 주소값을 담을 변수
    lateinit var activity:BaseActivity

    // main 함수가 호출할 메서드
    fun run(){
        while(true){
            // 상태에 따른 객체를 생성
            activity = getStateClass()

            // 초기화 메서드를 호출
            activity.initActivity()

            // 전처리 메서드를 호출
            activity.beforeProcessActivity()

            // 화면 출력 메서드를 호출
            activity.showActivity()

            // 후처리 메서드를 호출
            activity.afterProcessActivity()

            // 현재 상태를 종료하는 메서드를 호출
            activity.finishActivity()
        }
    }

    // 상태값에 따라 객체를 생성해서 반환하는 메서드
    fun getStateClass() = when(programStateValue){
        ProgramState.PROGRAM_STATE_SHOW_MENU -> ShowMenuActivity(this)
        ProgramState.PROGRAM_STATE_INPUT_ANIMAL_INFO -> InputAnimalInfoActivity(this)
        ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_NAME_INFO -> SearchAnimalNameActivity(this)
        ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_TYPE_INFO -> SearchAnimalTypeActivity(this)
        ProgramState.PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL -> ShowAnimalInfoAllActivity(this)
        ProgramState.PROGRAM_STATE_DELETE_ANIMAL_INFO -> DeleteAnimalInfoActivity(this)
        ProgramState.PROGRAM_STATE_FINISH -> FinishProgramActivity()
    }

    // 상태 값을 변경하는 메서드
    fun setProgramState(programState: ProgramState){
        programStateValue = programState
    }
}
