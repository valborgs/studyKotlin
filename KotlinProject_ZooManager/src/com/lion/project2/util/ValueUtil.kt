package com.lion.project2.util

// 프로그램 전체 상태를 정의한다.
enum class ProgramState {
    // 메뉴를 보여주는 상태
    PROGRAM_STATE_SHOW_MENU,
    // 동물 정보를 입력하는 상태
    PROGRAM_STATE_INPUT_ANIMAL_INFO,
    // 동물 이름 검색하는 상태
    PROGRAM_STATE_SEARCH_ANIMAL_NAME_INFO,
    // 동물 타입 검색하는 상태
    PROGRAM_STATE_SEARCH_ANIMAL_TYPE_INFO,
    // 모든 동물의 정보 출력하는 상태
    PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL,
    // 동물 삭제하는 상태
    PROGRAM_STATE_DELETE_ANIMAL_INFO,
    // 종료 상태
    PROGRAM_STATE_FINISH
}

// 각 메뉴
enum class MenuNumber(var num:Int) {
    // 동물 정보를 입력
    PROGRAM_STATE_INPUT_ANIMAL_INFO(1),
    // 동물 이름 검색
    PROGRAM_STATE_SEARCH_ANIMAL_NAME_INFO(2),
    // 동물 타입 검색
    PROGRAM_STATE_SEARCH_ANIMAL_TYPE_INFO(3),
    // 모든 동물의 정보 출력
    PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL(4),
    // 동물 삭제
    PROGRAM_STATE_DELETE_ANIMAL_INFO(5),
    // 프로그램 종료
    PROGRAM_STATE_FINISH(6)
}

// 동물 번호
enum class AnimalType(var num:Int, var kor:String){
    // 사자
    LION(1,"사자"),
    // 호랑이
    TIGER(2,"호랑이"),
    // 코끼리
    ELEPHANT(3,"코끼리")
}

// 입력받은 숫자를 동물 종류로 반환
fun getAnimalType(num:Int) = when(num){
    AnimalType.LION.num -> AnimalType.LION.kor
    AnimalType.TIGER.num -> AnimalType.TIGER.kor
    AnimalType.ELEPHANT.num -> AnimalType.ELEPHANT.kor
    else -> ""
}