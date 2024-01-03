import java.util.Scanner

// 주민등록 번호를 입력받아 다음과 같이 출력한다.
// 주민등록 번호는 - 없이 13자리의 숫자를 입력받는다.
// 처음 두자리는 생년을 의미한다.
// 세번째 네번째는 생월을 의미한다.
// 다섯번째 여섯번째는 생일을 의미한다.
// 일곱번째 숫자는 다음과 같다.
// 9 : 1800년대생 남성
// 0 : 1800년대생 여성
// 1 : 1900년대생 남성
// 2 : 1900년대생 여성
// 3 : 2000년대생 남성
// 4 : 2000년대생 여성
// 5 : 1900년대생 외국인 남성
// 6 : 1900년대생 외국인 여성
// 7 : 2000년대생 외국인 남성
// 8 : 2000년대생 외국인 여성
//
// 출력은 다음과 같이 한다
//
// 1999년 10월 21에 태어난 남성입니다

/* 내 풀이
fun main() {
    val numbers = inputNumbers()
    printOut(numbers)
}


fun inputNumbers():Long{
    val scanner = Scanner(System.`in`)
    print("주민등록번호 13자리를 - 없이 입력해주세요 : ")
    val numbers = scanner.nextLong()
    return numbers
}

fun getYearHead(numbers:Long):Int{
    var result = 0
    when (numbers) {
        9L, 0L -> {
            result = 1800
        }
        1L, 2L, 5L, 6L -> {
            result = 1900
        }
        3L, 4L, 7L, 8L -> {
            result = 2000
        }
    }
    return result
}

fun getYear(numbers:Long):Long {
    val numberHead = numbers / 10000000
    val numberTail = numbers % 10000000 / 1000000

    val yearHead = getYearHead(numberTail)
    val yearTail = numberHead / 10000

    return yearHead + yearTail
}


fun getGender(number:Long):String{
    var result = "남성"
    when(number){
        0L,2L,4L,6L,8L -> return "여성"
    }
    return result
}

fun printOut(numbers:Long){
    val numberHead = numbers / 10000000 //주민등록번호 앞자리
    val numberTail = numbers % 10000000 / 1000000 //주민등록번호 뒷자리

    val year = getYear(numbers)
    val month = numberHead / 100 % 100
    val day = numberHead % 100
    val gender = getGender(numberTail)
    println("${year}년 ${month}월 ${day}일에 태어난 ${gender}입니다")
}
 */





// 아래는 강사님 풀이

// step1) 기능 정리
// 1. 주민등록 번호를 입력받는 기능
// 2. 생년을 추출한다.
// 3. 생월을 추출한다.
// 4. 생일을 추출한다.
// 5. 일곱번째 숫자를 추출한다.
// 6. 몇년대 생인지를 파악한다.
// 7. 성별을 파악한다.
// 8. 출력한다.


// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    // inputJuminNumber 함수 테스트
    // var a1 = inputJuminNumber()
    // println("a1 : $a1")

    // getBirthYear 함수 테스트
    // val a1 = getBirthYear(1234567891234)
    // println("a1 : $a1")

    // getBirthMonth 함수 테스트
    // val a1 = getBirthMonth(1234567891234)
    // println("a1 : $a1")

    // getBirthDate 함수 테스트
    // val a1 = getBirthDate(1234567891234)
    // println("a1 : $a1")

    // getSevenNumber 함수 테스트
    // val a1 = getSevenNumber(123456_7891234)
    // println("a1 : $a1")

    // getBirthAges 함수 테스트
    // val a1 = getBirthAges(1)
    // println("a1 : $a1")

    // getGender 함수 테스트
    // val a1 = getGender(1)
    // println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(2010,10,08,"여성")

    // 주민등록 번호를 입력받는다.
    val juminNumber = inputJuminNumber()
    // 생년을 추출한다.
    val year = getBirthYear(juminNumber)
    // 생월을 추출한다.
    val month = getBirthMonth(juminNumber)
    // 생일을 추출한다.
    val date = getBirthDate(juminNumber)
    // 7번째 숫자를 추출한다.
    val sevenNumber = getSevenNumber(juminNumber)
    // 년대를 가져온다.
    val ages = getBirthAges(sevenNumber)
    // 성별을 가져온다.
    val gender = getGender(sevenNumber)

    printResult(ages+year,month,date,gender)

}

// 1. 주민등록 번호를 입력받는 기능
fun inputJuminNumber():Long{
    val scanner = Scanner(System.`in`)

    // 주민등록 번호를 입력받는다.
    print("주민번호 13자리를 입력해주세요(- 빼고..) : ")
    val juminNumber = scanner.nextLong()
    // 입력받은 주민번호를 반환한다.
    return juminNumber
}
// 2. 생년을 추출한다.
fun getBirthYear(juminNumber:Long):Long{
    val a1 = juminNumber / 100_000_000_000
    return a1
}
// 3. 생월을 추출한다.
fun getBirthMonth(juminNumber: Long):Long{
    val a1 = juminNumber / 1_000_000_000
    val a2 = a1 % 100
    return a2
}
// 4. 생일을 추출한다.
fun getBirthDate(juminNumber:Long):Long{
    val a1 = juminNumber / 10_000_000
    val a2 = a1 % 100
    return a2
}
// 5. 일곱번째 숫자를 추출한다.
fun getSevenNumber(juminNumber:Long):Long{
    val a1 = juminNumber / 1_000_000
    val a2 = a1 % 10
    return a2
}
// 6. 몇년대 생인지를 파악한다.
fun getBirthAges(sevenNumber:Long) = when(sevenNumber){
    9L, 0L -> 1800
    1L, 2L, 5L, 6L -> 1900
    3L, 4L, 7L, 8L -> 2000
    else -> 0
}
// 7. 성별을 파악한다.
fun getGender(sevenNumber: Long):String{
    // 짝수는 여자, 홀수는 남자이기 때문에
    // 2로 나눈 나머지를 구한다.
    if(sevenNumber % 2 == 0L){
        return "여성"
    }else{
        return "남성"
    }
}
// 8. 출력한다.
fun printResult(year:Long, month:Long, date:Long, gender:String){
    println("${year}년 ${month}월 ${date}에 태어난 ${gender}입니다")
}