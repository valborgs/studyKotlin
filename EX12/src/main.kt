import java.util.Scanner

// EX12) 동물원에는 동물들이 여러 가지가 있다.
// 동물은 사자, 고양이, 새가 있다.
// 사자는 다리가 네개이고 어흥이라는 소리는 낸다.
// 고양이는 다리가 네개이고 야옹라는 소리는 낸다.
// 새는 다리가 두개이고 짹짹이라는 소리는 낸다.
//
// 프로그램이 실행되면 3가지 동물에 관련된 정보를 입력받는다.
// 입력받는 정보는 동물의 종료와 다리의 개수, 내는 소리이다.
// 입력이 완료되면 각 동물의 정보를 모두 출력하고
// 동물의 다리 개수 총합을 구해 출력한다.

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 동물의 이름을 입력받는 기능
// 2. 동물의 다리를 입력받는 기능
// 3. 동물의 소리를 입력받는 기능
// 4. 동물의 다리 개수 총합을 구하는 기능
// 5. 동물의 정보를 출력하는 기능
// 6. 동물의 다리 개수 총합을 출력하는 기능

// step3) step2에서 정리한 기능들을 그룹으로 묶어준다.
// 1. 동물의 이름을 입력받는 기능 -> 동물
// 2. 동물의 다리를 입력받는 기능 -> 동물
// 3. 동물의 소리를 입력받는 기능 -> 동물
// 4. 동물의 다리 개수 총합을 구하는 기능 -> 매니저
// 5. 동물의 정보를 출력하는 기능 -> 동물
// 6. 동물의 다리 개수 총합을 출력하는 기능 -> 매니저

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 동물의 이름
// 동물의 다리 개수
// 동물이 내는 소리
// 동물의 다리 개수 총합

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 동물의 이름 -> 동물
// 동물의 다리 개수 -> 동물
// 동물이 내는 소리 -> 동물
// 동물의 다리 개수 총합 -> 매니저

// step6) 클래스를 정의한다.
// 클래스 내부에 변수를 작성해주고 메서드를 작성해준다.
// 메서드의 코드는 아직 작성하지 않는다.

// step7) 메서드 내부의 코드를 작성하고 이를 테스트한다.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성한다.

fun main() {
    //val scanner = Scanner(System.`in`)
    // Animal 클래스의 animalInfo 함수 테스트
//    var a1 = Animal()
//    a1.animalInfo(scanner)
//    println("a1.name : ${a1.name}")
//    println("a1.leg : ${a1.leg}")
//    println("a1.sound : ${a1.sound}")

    // Animal 클래스의 printInfo 함수 테스트
//    var a1 = Animal()
//    a1.name = "호랑이"
//    a1.leg = 4
//    a1.sound = "어흥"
//    a1.printInfo()

    // AnimalManager 클래스의 getTotalLeg 함수 테스트
//    var manager1 = AnimalManager()
//    manager1.getTotalLeg()
//    println("totalLeg : ${manager1.totalLeg}")

    // AnimalManager 클래스의 printTotalLeg 함수 테스트
//    var manager1 = AnimalManager()
//    manager1.printTotalLeg()

    // 동물 관리 요소의 객체를 생성한다.
    // var animalManager = AnimalManager()
    // 동물 정보를 입력받는다.
    // animalManager.inputAnimalInfo()
    // 각 동물의 정보를 출력한다.
    // animalManager.printAnimalInfo()
    // 각 동물의 다리의 개수 총합을 구한다.
    // animalManager.getTotalLeg()
    // 각 동물의 다리의 개수 총합을 출력한다.
    // animalManager.printTotalLeg()


    // 강사님 풀이 main.kt
    answer()
}


class Animal{

    // 동물의 이름 -> 동물
    var leg = 0
    // 동물의 다리 개수 -> 동물
    var name = ""
    // 동물이 내는 소리 -> 동물
    var sound =""

    // 1. 동물의 이름을 입력받는 기능 -> 동물
    // 2. 동물의 다리를 입력받는 기능 -> 동물
    // 3. 동물의 소리를 입력받는 기능 -> 동물
    fun animalInfo(scanner:Scanner){
        print("동물의 이름 : ")
        name = scanner.next()
        print("동물의 다리 개수 : ")
        leg = scanner.nextInt()
        print("동물이 내는 소리 : ")
        sound = scanner.next()
        println()
    }

    // 5. 동물의 정보를 출력하는 기능 -> 동물
    fun printInfo(){
        println("이름 : $name")
        println("다리 개수 : $leg")
        println("내는 소리 : $sound")
        println()
    }
}

class AnimalManager{
    // 동물의 다리 개수 총합 -> 매니저
    var totalLeg = 0

    // 각 동물 객체의 주소값을 담을 변수
    var a1 = Animal()
    var a2 = Animal()
    var a3 = Animal()

    // 각 동물의 정보를 입력받기 위한 메서드
    fun inputAnimalInfo(){
        val scanner = Scanner(System.`in`)
        a1.animalInfo(scanner)
        a2.animalInfo(scanner)
        a3.animalInfo(scanner)
    }

    // 각 동물의 정보를 출력하기 위한 메서드
    fun printAnimalInfo(){
        a1.printInfo()
        a2.printInfo()
        a3.printInfo()
    }

    // 각 동물의 다리 개수의 총합을 구하기 위한 메서드
    fun getTotalLeg(){
        totalLeg = a1.leg + a2.leg + a3.leg
    }

    // 각 동물의 다리 개수의 총합을 출력하기 위한 메서드
    fun printTotalLeg(){
        println("동물의 다리 개수 총합 : $totalLeg")
    }

}