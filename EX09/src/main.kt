// EX09) 1부터 1씩 증가시키는 값 중 3의 배수이거나 7의 배수인 숫자를 누적한다.
// 누적값이 10000이상이 됬을 때의 숫자가 몇인지 출력한다.

// step1) 기능 정리
// 1. 3의 배수이거나 7의 배수인 숫자를 찾기
// 2. 1부터 1씩 증가시켜 조건에 해당되는 숫자 누적하기
// 3. 결과 출력

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // find37 함수 테스트
    // val a1 = find37(3)
    // val a2 = find37(7)
    // val a3 = find37(8)
    // println("a1 : $a1")
    // println("a2 : $a2")
    // println("a3 : $a3")

    // numberLoop 함수 테스트
    // val a1 = numberLoop()
    // println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(5)

    // 1부터 1씩 증가시켜 조건에 해당되는 숫자 누적하기
    // val total = numberLoop()
    // 결과 출력
    // printResult(total)

    // 강사님 풀이 answer.kt
     answer()
}

// 1. 3의 배수이거나 7의 배수인 숫자를 찾기
fun find37(number:Int):Int{
    return if((number % 3 == 0) || (number % 7 == 0)){
        number
    } else {
        0
    }
}

// 2. 1부터 1씩 증가시켜 조건에 해당되는 숫자 누적하기
fun numberLoop():Int{
    var total = 0
    var count = 1

    while(true){
        // count 3의 배수이거나 7의 배수인 경우에만 누적한다
        total += find37(count)
        if(total>=10000){
            return count
        }
        count ++
    }
}

// 3. 결과 출력
fun printResult(number:Int){
    println(number)
}