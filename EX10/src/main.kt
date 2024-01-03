import java.math.BigInteger

// EX10) 철수가 저금을 한다. 첫날 100원을 저금한다. 두번째 날 부터는 전날 잔고액의 3배를
// 저금한다. 1일차 부터 30일차까지의 통장 잔고액을 모두 출력한다.
// 1일차 : 100원
// 2일차 : 400원
// 3일차 : 1600원
// ..
// 30일차 : 0000원
//
// 조건 : 변수는 Int 타입의 변수만 사용한다.

// 10번 문제 힌트하나 드리겠습니다.ㅎㅎㅎ
//
// 이상한 값이 계산되는 이유는 Int 변수에 저장할 수 있는 값이 범위를 넣어서기
// 때문입니다.
//
// 그럼 변수에 저장되는 값을 제한하시면 됩니다.
//
// 예를 들어 0 ~ 9 까지로 제한한다고 한다면
//
// 13인 경우 Int 타입 변수 두개에 각각 담아 하나는 1 하나는 3 이렇게
// 다음으면 0 ~ 9까지 범위를 벗어나지 못하게 됩니다..

// step1) 기능 정리
// 1. 1일차 부터 30일차 까지 반복
// 2. 통장 잔고액 출력
// 3. 100원부터 3배씩 누적 합계

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.
fun main() {
//    var total = 100
//    var numHead = 0
//    var numTail = 0
//    for(i in 1..30){
//        if(total < 0){
//            println("초과")
//            print("${i}일 : ")
//            print(((numHead * 10000 + numTail) + (numHead * 10000 + numTail) * 3) / 10000)
//            print(((numHead * 10000 + numTail) + (numHead * 10000 + numTail) * 3) % 10000)
//            println()
//            numHead = ((numHead * 10000 + numTail) + (numHead * 10000 + numTail) * 3) / 10000
//            numTail = ((numHead * 10000 + numTail) + (numHead * 10000 + numTail) * 3) % 10000
//
//        }else{
//            if(total+total*3 < 0){
//                numHead = (total) / 10000
//                numTail = (total) % 10000
//            }
//            println("${i}일 : ${total}")
//            total += total*3
//        }
//    }

    // 강사님 풀이 answer.kt
    answer()
}
