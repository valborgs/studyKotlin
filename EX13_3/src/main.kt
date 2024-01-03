import java.util.Scanner

fun main() {
    // 입력을 위한 스캐너 객체 생성
    val scanner = Scanner(System.`in`)

    // 아빠 객체 생성
    val father = Father(scanner)

    //Family 메서드 호출
    father.printFamilyMoney()
    father.printRegion()

    //Father 메서드 호출
    father.printEmergencyMoney()
    father.printFullName()
    father.printJob()
}

open class Family{
    var familyMoney = 0
    var familyName = ""
    var region = ""

    init {
        println("가족 생성")
    }

    constructor(scanner: Scanner){
        print("자산 입력 : ")
        familyMoney = scanner.nextInt()
        print("성씨 입력 : ")
        familyName = scanner.next()
        print("고향 입력 : ")
        region = scanner.next()
    }

    fun printFamilyMoney(){
        println("자산 : $familyMoney")
    }
    fun printRegion(){
        println("출신 지역 : $region")
    }
}

class Father : Family{
    var emergencyMoney = 0
    var firstName = ""
    var job = ""
    
    init{
        println("아빠 생성")
    }

    constructor(scanner: Scanner):super(scanner){
        print("비상금 입력 : ")
        emergencyMoney = scanner.nextInt()
        print("이름 입력 : ")
        firstName = scanner.next()
        print("직업 입력 : ")
        job = scanner.next()
    }

    fun printEmergencyMoney(){
        println("비상금 : $emergencyMoney")
    }
    fun printFullName(){
        println("제 이름은 ${familyName}${firstName} 입니다.")
    }
    fun printJob(){
        println("직업 : $job")
    }
}