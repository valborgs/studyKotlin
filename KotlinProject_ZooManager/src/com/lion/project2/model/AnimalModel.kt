package com.lion.project2.model

import java.io.Serializable

/*
동물 종류
동물의 이름
동물의 나이
(사자) 털의 개수
(호랑이) 줄무늬 개수
(코끼리) 코의 길이
*/

abstract class AnimalModel : Serializable{
    abstract var type:String
    abstract var name:String
    abstract var age:Int

    // 동물의 정보를 출력하는 메서드
    abstract fun printAnimalInfo()
}
