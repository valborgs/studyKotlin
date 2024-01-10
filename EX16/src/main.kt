import java.util.*

// EX16
// EX14를 변경해보기

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


fun main() {
    // 동물원 객체를 생성한다.
    val zoo = Zoo()
    // 입력을 받는다.
    zoo.inputAnimalsInfo()
    // 각 동물이 행동을 한다.
    zoo.doAnimal()
    // 각 동물들의 정보를 출력한다.
    zoo.printAnimalsInfo()
}

// 동물원
class Zoo{
    lateinit var scanner: Scanner

    // 동물들
    lateinit var animal1: Tiger
    lateinit var animal2: Tiger
    lateinit var animal3: Lion
    lateinit var animal4: Lion
    lateinit var animal5: Fox
    lateinit var animal6: Fox

    init{
        scanner = Scanner(System.`in`)

        // 동물들
        animal1 = Tiger()
        animal2 = Tiger()
        animal3 = Lion()
        animal4 = Lion()
        animal5 = Fox()
        animal6 = Fox()
    }

    // 동물들의 정보를 입력받는다
    fun inputAnimalsInfo(){
        animal1.inputAnimalInfo(scanner)
        animal2.inputAnimalInfo(scanner)
        animal3.inputAnimalInfo(scanner)
        animal4.inputAnimalInfo(scanner)
        animal5.inputAnimalInfo(scanner)
        animal6.inputAnimalInfo(scanner)
    }
    // 동물들의 정보를 출력한다.
    fun printAnimalsInfo(){
        animal1.printAnimalInfo()
        animal2.printAnimalInfo()
        animal3.printAnimalInfo()
        animal4.printAnimalInfo()
        animal5.printAnimalInfo()
        animal6.printAnimalInfo()
    }

    // 동물들이 행동한다.
    fun doAnimal(){
        animal1.doEat()
        animal1.doRun()
        println()
        animal2.doEat()
        animal2.doRun()
        println()
        animal3.doEat()
        animal3.doDyed()
        println()
        animal4.doEat()
        animal4.doDyed()
        println()
        animal5.doEat()
        animal5.doTempted()
        println()
        animal6.doEat()
        animal6.doTempted()
        println()
    }
}

// 동물들이 상속받을 부모 클래스
// animalType : 동물 종류
open class Animal(val animalType:String){
    // 동물 이름
    lateinit var animalName:String

    // 먹는다
    fun doEat(){
        println("${animalType} ${animalName}이/가 먹는다")
    }

    // 동물의 정보를 입력받는다.
    open fun inputAnimalInfo(scanner: Scanner){
        print("동물 이름 : ")
        animalName = scanner.next()
    }

    // 동물의 정보를 출력한다.
    open fun printAnimalInfo(){
        println("동물 이름 : $animalName")
        println("동물 종류 : $animalType")
    }
}

// 호랑이
class Tiger : Animal("호랑이"){
    // 다리 개수
    var legCount = 0

    // 달린다
    fun doRun(){
        println("${animalType} ${animalName}이/가 달린다")
    }

    // 입력받는다
    override fun inputAnimalInfo(scanner: Scanner){
        super.inputAnimalInfo(scanner)
        print("다리 개수 : ")
        legCount = scanner.nextInt()
    }

    // 출력한다
    override fun printAnimalInfo(){
        super.printAnimalInfo()
        println("다리 개수 : ${legCount}개")
        println()
    }
}

// 사자
class Lion : Animal("사자"){
    // 털 개수
    var hairCount = 0

    // 염색한다
    fun doDyed(){
        println("${animalType} ${animalName}이/가 염색한다")
    }

    // 입력받는다
    override fun inputAnimalInfo(scanner: Scanner){
        super.inputAnimalInfo(scanner)
        print("털 개수 : ")
        hairCount = scanner.nextInt()
    }

    // 출력한다
    override fun printAnimalInfo(){
        super.printAnimalInfo()
        println("털 개수 : ${hairCount}개")
        println()
    }
}

// 여우
class Fox : Animal("여우"){
    // 꼬리 개수
    var tailCount = 0

    // 유혹 한다
    fun doTempted(){
        println("${animalType} ${animalName}이/가 유혹한다")
    }

    // 입력받는다
    override fun inputAnimalInfo(scanner: Scanner){
        super.inputAnimalInfo(scanner)
        print("꼬리 개수 : ")
        tailCount = scanner.nextInt()
    }

    // 출력한다
    override fun printAnimalInfo(){
        super.printAnimalInfo()
        println("꼬리 개수 : ${tailCount}개")
        println()
    }
}