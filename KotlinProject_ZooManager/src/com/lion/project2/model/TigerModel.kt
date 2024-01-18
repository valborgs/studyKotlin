package com.lion.project2.model

class TigerModel(override var type: String, override var name: String, override var age: Int, var stripe:Int) : AnimalModel() {

    override fun printAnimalInfo() {
        println("동물 종류 : $type")
        println("동물의 이름 : $name")
        println("동물의 나이 $age")
        println("줄무늬의 개수 $stripe")
    }
}