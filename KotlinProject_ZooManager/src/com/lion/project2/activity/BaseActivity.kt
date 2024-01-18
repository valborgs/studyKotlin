package com.lion.project2.activity

abstract class BaseActivity {

    // 초기화 메서드
    abstract fun initActivity()

    // 데이터 전처리 메서드
    abstract fun beforeProcessActivity()

    // 화면에 그리는 처리
    abstract fun showActivity()

    // 데이터 후처리 메서드
    abstract fun afterProcessActivity()

    // 수행이 끝났을 때 호출되는 메서드
    abstract fun finishActivity()
}