import java.util.Scanner

// EX07) 사용자에게 정수를 입력받고 1 부터 입력 받은 숫자까지의 총합을 구한다

// step1) 기능 정리
// 1. 사용자에게 정수 입력 받기
// 2. 1부터 입력 받은 숫자까지의 총합을 구하기
// 3. 결과 출력

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // getUserNumber 함수 테스트
    // val a1 = getUserNumber()
    // println("a1 : $a1")

    // getTotal 함수 테스트
    // val a1 = getTotal(1)
    // println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(2,3)

    // 1. 사용자에게 정수 입력 받기
    // val inputNumber = getUserNumber()
    // 2. 1부터 입력 받은 숫자까지의 총합을 구하기
    // val total = getTotal(inputNumber)
    // 3. 결과 출력
    // printResult(inputNumber,total)

    // 강사님 풀이 answer.kt
    answer()
}

// 1. 사용자에게 정수 입력 받기
fun getUserNumber():Int{
    val scanner = Scanner(System.`in`)

    print("정수를 입력해주세요 : ")
    val number = scanner.nextInt()

    return number
}

// 2. 1부터 입력 받은 숫자까지의 총합을 구하기
fun getTotal(num:Int):Int{
    var total = 0
    for(v1 in 1..num){
        total += v1
    }
    return total
}

// 3. 결과 출력
fun printResult(num:Int, total:Int){
    println("1부터 ${num}까지의 총합 : $total")
}