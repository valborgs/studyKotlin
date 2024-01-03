import java.util.Scanner

// 사용자에게 정수를 입력받아 누적한다. 사용자가 0을 입력하면 입력을 중단하고
// 그때까지의 총합을 출력한다.

// step1) 기능 정리
// 1. 사용자에게 정수를 입력받아 누적한다.
// 2. 총합을 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun answer() {
    // getTotal 함수 테스트
    // val a1 = getTotal()
    // println("a1 : $a1")

    // printResult2 함수 테스트
    // printResult2(100)

    // 숫자를 입력받아 누적한다.
    val total = getTotal()
    // 출력한다.
    printResult2(total)
}

// 1. 사용자에게 정수를 입력받아 누적한다.
fun getTotal():Int{
    val scanner = Scanner(System.`in`)

    // 누적값을 담을 변수
    var total = 0

    // 입력받은 숫자를 담을 변수
    var inputNumber:Int

    do{
        // 정수를 입력받는다.
        print("숫자를 입력해주세요 : ")
        inputNumber = scanner.nextInt()
        // 누적한다.
        total += inputNumber
    }while(inputNumber != 0)

    return total
}
// 2. 총합을 출력한다.
fun printResult2(total:Int){
    println("총합은 ${total}입니다")
}