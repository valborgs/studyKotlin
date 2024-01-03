import java.util.Scanner

// EX14) 동물원..
// 동물을 관리하는 프로그램을 작성한다.
// 동물은 총 6마리이다.
// 호랑이는 이름, 동물종류, 다리 개수로 구성된다.
// 사자는 이름, 동물종류, 털 개수로 구성된다.
// 여우는 이름, 동물종류, 꼬리 개수로 구성된다.
//
// 호랑이는 먹는다, 달린다는 행동을 할 수 있다.
// 사자는 먹는다, 염색한다라는 행동을 할 수 있다.
// 여우는 먹는다, 유혹한다라는 행동을 할 수 있다.
//
// 프로그램이 시작되면 호랑이 두마리, 사자 두마리, 여우 두마리 순서대로 입력을 받는다.
//
// 입력시 동물종류는 입력받지 않는다.
//
// 모든 동의 정보가 입력이 완료되면
// 호랑이는 먹는다와 달린다는 행동을 하게 하고
// 사자는 먹는다와 염색한다라는 행동을 하게 하고
// 여우는 먹는다와 유혹한다라는 행동을 할하게 한다
//
// 그 이후, 모든 동물들의 정보를 출력한다.

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 먹는 기능
// 2. 달리는 기능
// 3. 염색하는 기능
// 4. 유혹하는 기능
// 5. 동물들의 정보를 입력받는 기능
// 6. 동물들의 정보를 출력하는 기능

// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.
// 1. 먹는 기능 -> 호랑이, 사자, 여우
// 2. 달리는 기능 -> 호랑이
// 3. 염색하는 기능 -> 사자
// 4. 유혹하는 기능 ->  여우
// 5. 동물들의 정보를 입력받는 기능 -> 동물 관리
// 6. 동물들의 정보를 출력하는 기능 -> 동물 관리
// 7. 동물의 정보를 입력받는 기능 -> 호랑이, 사자, 여우
// 8. 동물의 정보를 출력하는 기능 -> 호랑이, 사자, 여우

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 1. 동물 이름
// 2. 동물 종류
// 3. 다리 개수
// 4. 털 개수
// 5. 꼬리 개수

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 1. 동물 이름 -> 호랑이, 사자, 여우
// 2. 동물 종류 -> 호랑이, 사자, 여우
// 3. 다리 개수 -> 호랑이
// 4. 털 개수 -> 사자
// 5. 꼬리 개수 -> 여우

// step6) 클래스를 정의한다.
// 클래스 내부에 변수를 작성해주고 메서드를 작성해준다.
// 메서드의 코드는 아직 작성하지 않는다.

// step7) 메서드 내부의 코드를 작성하고 이를 테스트 한다.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성한다.

// 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    // printTest()

    // 동물원 객체 생성
    val zoo = Zoo()
    // 모든 동물의 정보 입력
    zoo.inputAnimalsInfo()
    // 모든 동물들의 행동
    zoo.doAnimal()
    // 모든 동물들의 정보 출력
    zoo.printAnimalsInfo()
}

fun printTest(){
    println("호랑이1는 먹는다")
    println("호랑이1는 달린다")
    println()
    println("호랑이2는 먹는다")
    println("호랑이2는 달린다")
    println()
    println("사자3는 먹는다")
    println("사자3는 염색한다")
    println()
    println("사자4는 먹는다")
    println("사자4는 염색한다")
    println()
    println("여우5는 먹는다")
    println("여우5는 유혹한다")
    println()
    println("여우6는 먹는다")
    println("여우6는 유혹한다")
    println()

    println("이름 : 호랑이1")
    println("동물 종류 : 호랑이")
    println("다리 개수 : 4개")
    println()
    println("이름 : 호랑이2")
    println("동물 종류 : 호랑이")
    println("다리 개수 : 3개")
    println()
    println("이름 : 사자3")
    println("동물 종류 : 사자")
    println("털 개수 : 100개")
    println()
    println("이름 : 사자4")
    println("동물 종류 : 사자")
    println("털 개수 : 200개")
    println()
    println("이름 : 여우5")
    println("동물 종류 : 여우")
    println("꼬리 개수 : 9개")
    println()
    println("이름 : 여우6")
    println("동물 종류 : 여우")
    println("꼬리 개수 : 1개")
    println()
}






// 동물원 클래스
class Zoo{
    val scanner = Scanner(System.`in`)

    var a1 = Tiger()
    var a2 = Tiger()
    var a3 = Lion()
    var a4 = Lion()
    var a5 = Fox()
    var a6 = Fox()

    // 동물들의 정보를 입력받는 기능
    fun inputAnimalsInfo(){
        a1.inputTigerInfo(scanner)
        a2.inputTigerInfo(scanner)
        a3.inputLionInfo(scanner)
        a4.inputLionInfo(scanner)
        a5.inputFoxInfo(scanner)
        a6.inputFoxInfo(scanner)
    }

    // 동물들의 행동 메서드를 호출하는 기능
    fun doAnimal(){
        a1.eating()
        a1.running()
        a2.eating()
        a2.running()
        a3.eating()
        a3.dyeing()
        a4.eating()
        a4.dyeing()
        a5.eating()
        a5.tempt()
        a6.eating()
        a6.tempt()
    }

    // 동물들의 정보를 출력하는 기능
    fun printAnimalsInfo(){
        a1.printTigerInfo()
        a2.printTigerInfo()
        a3.printLionInfo()
        a4.printLionInfo()
        a5.printFoxInfo()
        a6.printFoxInfo()
    }
}






// 동물 클래스
open class Animal(var animalType:String){
    // 동물 이름
    var animalName = ""

    // 먹는 기능
    fun eating(){
        println("${animalName}은/는 먹는다")
    }
    // 동물의 정보를 입력받는 기능
    fun inputAnimalInfo(scanner: Scanner){
        print("이름 : ")
        animalName = scanner.next()
    }
    // 동물의 정보를 출력하는 기능
    fun printAnimalInfo(){
        println("이름 : $animalName")
        println("동물 종류 : $animalType")
    }
}

// 호랑이 클래스
class Tiger:Animal("호랑이"){
    // 다리 개수
    var legCount = 0

    // 달리는 기능
    fun running(){
        println("${animalName}은/는 달린다")
        println()
    }
    // 호랑이 정보를 입력받는 기능
    fun inputTigerInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("다리 개수 : ")
        legCount = scanner.nextInt()
    }
    // 호랑이 정보를 출력하는 기능
    fun printTigerInfo(){
        printAnimalInfo()
        println("다리 개수 : ${legCount}개")
        println()
    }
}

// 사자 클래스
class Lion:Animal("사자"){
    // 털 개수
    var furrCount = 0

    // 염색하는 기능
    fun dyeing(){
        println("${animalName}은/는 염색한다")
        println()
    }
    // 사자 정보를 입력받는 기능
    fun inputLionInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("털 개수 : ")
        furrCount = scanner.nextInt()
    }
    // 사자 정보를 출력하는 기능
    fun printLionInfo(){
        printAnimalInfo()
        println("털 개수 : ${furrCount}개")
        println()
    }
}

// 여우 클래스
class Fox:Animal("여우"){
    // 꼬리 개수
    var tailCount = 0

    // 유혹하는 기능
    fun tempt(){
        println("${animalName}은/는 유혹한다")
        println()
    }
    // 여우 정보를 입력받는 기능
    fun inputFoxInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("털 개수 : ")
        tailCount = scanner.nextInt()
    }
    // 여우 정보를 출력하는 기능
    fun printFoxInfo(){
        printAnimalInfo()
        println("털 개수 : ${tailCount}개")
        println()
    }
}