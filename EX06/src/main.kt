// EX06) 1부터 100까지의 홀수의 합을 출력하세요

// step1) 기능 정리
// 1. 1부터 100까지의 홀수의 합 구하기
// 2. 총합 값 출력

// step2) 기능별 함수 구현

// step3) 함수의 내부 코드 구현, 테스트

// step4) main 에서 호출
/*
fun main() {
    // isOdd 함수 테스트
    // val odd = isOdd(1)
    // println(odd)

    // getTotal 함수 테스트
    // val number = getTotal(1,100)
    // println(number)

    // showResult 함수 테스트
    // showResult(2500)

    // 1. 1부터 100까지의 홀수의 합 구하기
    val number = getTotal(1,100)
    // 2. 총합 값 출력
    showResult(number)
}

fun isOdd(number:Int):Int{
    return if(number % 2 != 0){
        number
    }else{
        0
    }
}

fun getTotal(num1:Int, num2:Int):Int{
    var total = 0
    for(num in num1..num2){
        total += isOdd(num)
    }
    return total
}

fun showResult(number:Int){
    println("1부터 100까지의 홀수의 합 : $number")
}
*/



// 강사님 풀이

// 1부터 100까지의 홀수의 합을 출력하세요

// step1) 기능 정리
// 1부터 100까지의 홀수 합을 구한다.
// 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // getTotal 함수 테스트
    // val a1 = getTotal()
    // println("a1 : $a1")

    // printTotal 함수 테스트
    // printTotal(100)

    // 1부터 100까지의 홀수의 총합을 구한다.
    val total = getTotal()
    // 출력한다.
    printTotal(total)

}

// 1부터 100까지의 홀수 합을 구한다.
fun getTotal():Int{
    var total = 0

    // 1부터 100까지 반복한다.
    for(v1 in 1..100){
        if(v1%2==1){
            total += v1
        }
    }

    /* 아래와 같이 step을 사용해서 간단히 할 수 있다.
    // 홀수만 누적해야 하기 때문에 1부터 2씩 증가시키며 반복한다.
    for(v1 in 1..100 step 2){
        total += v1
    }
    */
    return total
}

// 출력한다.
fun printTotal(total:Int){
    println("1부터 100까지의 홀수 총합은 ${total}입니다")
}