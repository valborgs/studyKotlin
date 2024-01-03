import java.util.*

// EX08) 사용자에게 정수를 입력받아 누적한다. 사용자가 0을 입력하면 입력을 중단하고 그때까지의 총합을 출력한다.

// step1) 기능 정리
// 1. 사용자에게 정수 입력받기
// 2. 반복적으로 입력받은 정수를 누적시키기(0 입력시 입력 중단)
// 3. 누적된 결과 출력

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // getUserNumber 함수 테스트
    // val a1 = getUserNumber()
    // println("a1 : $a1")

    // numberLoop 함수 테스트
    // val a1 = numberLoop()
    // println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(5)

    // 반복적으로 입력받은 정수를 누적시키기(0 입력시 입력 중단)
    // val total = numberLoop()
    // 누적된 결과 출력
    // printResult(total)

    // 강사님 풀이 answer.kt
    answer()
}


// 1. 사용자에게 정수 입력받기
fun getUserNumber():Int{
    val scanner = Scanner(System.`in`)

    print("정수를 입력해주세요 : ")
    val number = scanner.nextInt()

    return number
}

// 2. 반복적으로 입력받은 정수를 누적시키기(0 입력시 입력 중단)
fun numberLoop():Int{
    var total = 0
    do{
        val inputNumber = getUserNumber()
        total += inputNumber
    }while(inputNumber!=0)

    return total
}

// 3. 누적된 결과 출력
fun printResult(total:Int){
    println("총합 : $total")
}