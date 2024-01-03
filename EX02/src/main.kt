import java.util.Scanner

// EX02
// 키보드로 부터 입력을 받아 짝수라면 "짝수입니다"를 출력하고
// 홀수라면 "홀수입니다"를 출력한다.



// 나의 풀이

/*

fun main() {
    val number = inputNumber()
    printResult(number)
}

fun inputNumber():Int{
    val scanner = Scanner(System.`in`)
    print("숫자를 입력해주세요 : ")
    val number = scanner.nextInt()

    return number
}

fun printResult(number:Int){
    if(number % 2 == 0){
        println("짝수입니다")
    }else{
        println("홀수입니다")
    }
}
*/



// 아래 강사님 풀이

// step1) 기능 정리
// 1. 키보드로 부터 입력 받는 기능
// 2. 짝수 여부를 판단하여 출력하는 기능

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드를 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // inputNumber 함수 테스트
    // val a1 = inputNumber()
    // println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(101)
    // printResult(104)

    // 키보드로 부터 입력을 받는다.
    val number:Int = inputNumber()
    // 입력받은 숫자가 짝수인지 홀수인지 판단하여 출력한다.
    printResult(number)
}


// 키보드로 부터 입력 받는 기능
fun inputNumber():Int{
    val scanner = Scanner(System.`in`)

    // 입력을 받는다.
    print("숫자를 입력해주세요 : ")
    val number = scanner.nextInt()

    // 입력받은 값을 반환한다.
    return number
}

// 짝수 여부를 판단하여 출력하는 기능
fun printResult(number:Int) {
    if(number % 2 == 0){
        println("짝수 입니다")
    }else{
        println("홀수 입니다")
    }
}