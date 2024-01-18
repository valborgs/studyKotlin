package com.lion.project2.activity

import kotlin.system.exitProcess

class FinishProgramActivity : BaseActivity() {
    override fun initActivity() {
    }

    override fun beforeProcessActivity() {
    }

    override fun showActivity() {
        println()
        println("프로그램이 종료되었습니다.")
        // 프로그램을 종료한다.
        exitProcess(0)
        // status = 0 정상 종료
    }

    override fun afterProcessActivity() {
    }

    override fun finishActivity() {
    }
}