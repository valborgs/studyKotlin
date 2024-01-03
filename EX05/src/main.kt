// EX05) 1부터 100까지의 총합을 출력하세요

// step1) 기능 정리
// 1. 1부터 100까지의 총합 구하기
// 2. 총합 값 출력

// step2) 기능별 함수 구현

// step3) 함수의 내부 코드 구현, 테스트

// step4) main 에서 호출

/*
fun main() {
    // getTotal100 함수 테스트
    // println(getTotal100(1,100))

    // showResult 함수 테스트
    // showResult(5050)

    // 1. 1부터 100까지의 총합 구하기
    val num1 = 1
    val num2 = 100
    val number = getTotal100(num1,num2)
    // 2. 총합 값 출력
    showResult(num1,num2,number)

}

fun getTotal100(num1:Int, num2:Int):Int{
    var total = 0
    for(num in num1..num2){
        total += num
    }
    return total
}

fun showResult(num1:Int, num2:Int, result:Int){
    println("${num1}부터 ${num2}까지의 총합 : $result")
}
*/





// 강사님 풀이

// 1부터 100까지의 총합을 출력하세요

// step1) 기능 정리
// 1. 1부터 100까지의 총합을 구한다.
// 2. 총합을 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main(){
    // getTotal 함수 테스트
    // val a1 = getTotal()
    // println("a1 : $a1")

    // printTotal 함수 테스트
    // printTotal(100)

    // 1부터 100까지의 합을 구한다
    val total = getTotal()
    // 출력한다.
    printTotal(total)
}

// 1. 1 부터 100까지의 총합을 구한다.
fun getTotal():Int{

    var total = 0

    // 1부터 100까지 반복한다.
    for(v1 in 1..100){
        total += v1
    }

    return total
}
// 2. 총합을 출력한다.
fun printTotal(total:Int){
    println("1부터 100까지의 총합은 ${total}입니다")
}