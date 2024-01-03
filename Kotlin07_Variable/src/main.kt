// 변수 : 프로그램 실행 중에 변화되는 값을 저장하는 기억공간
// 변수의 용도와 크기는 개발자가 자료형을 이용해 결정한다.
// 변수의 위치는 VM이 알아서 정해준다.
// 변수가 생성되는 위치는 VM 알아서 정해주기 때문에 개발자는 변수가 어디에 있는지 알 수 없다.
// 이에, 변수의 접근을 위해 변수의 이름을 사용한다.
// 변수의 이름은 개발자가 정해주며 개발자는 변수의 이름을 통해 변수에 접근하여 변수에 값을 저장하거나
// 가져다 사용할 수 있다.

// 식별자
// 변수, 함수, 클래스, 메서드 등과 같이 개발자가 정의해서 사용하는 요소드릉 구분하기 위해 지어주는 이름
// 문법적으로 지켜야 하는 규칙(지키지 않으면 오류가 발생한다)
// 1. 길이의 제한은 없다.
// 2. 첫 글자는 문자, _, $만 가능하다($는 다른 곳에서 의미가 있을 수 있기 때문에 사용하는 것을 지양한다)
// 3. 두 번째 글자 부터는 문자, 숫자, _, $를 사용할 수 있다.
// 4. 자바언어에서 식별자를 한글로 지어주는 것이 허용되기 때문에 코틀린도 식별자는 한글로 해도 된다.

// 권장사항
// 1. 변수의 이름은 첫 글자를 소문자로 한다.
// 2. 함수나 메서드의 이름은 첫 글자를 소문자로 한다.
// 3. 클래스의 이름은 첫 글자를 대문자로 한다.
// 4. 상수를 의미하는 것들은 모두 대문자로 한다.


// 권장사항
// 1. 변수의 이름은 첫 글자를 소문자로 한다.
// 2. 함수나 메서드의 이름은 첫 글자를 소문자로 한다.
// 3. 클래스의 이름은 첫 글자를 대문자로 한다.
// 4. 상수를 의미하는 것들은 모두 대문자로 한다.

// 표기 기법
// 1. 잘못된 표기 예
// koreanpointaverage : 여러 단어를 조합했지만 가독성이 떨어진다.
// korean point average : 문법 오류. 이름은 띄어쓰기를 지원하지 않는다.
// 2. 파스칼 표기 기법
// 단어와 단어사이에 언더바(_)를 두는 표기 기법
// korean_point_average
// car_count
// 3. 카멜 표기 기법
// 각 단어의 첫 글자를 대문자로 작성하는 표기 기법
// koreanPointAverage
// carCount

// 자바에서는 카멜 표기 기법을 주로 사용한다.

fun main() {
    // 변수를 정의한다.
    // var/val 변수의이름:자료형
    // Int 타입(정수형, 4 byte)의 a1이라는 이름의 변수를 선언한다.
    // 변수는 선언과 동시에 메모리에 기억장소가 만들어진다.
    var a1:Int

    // 변수에 값을 저장한다.
    // 변수에는 값 하나만 저장할 수 있다.
    // 값을 다시 저장하면 기존의 저장된 값을 삭제되어 덮어씌워 진다.
    // = : 대입연산자. 우측의 값을 좌측의 변수에 저장한다.
    a1 = 100
    println("a1 : " + a1)

    // 변수에 새로운 값을 저장하면 기존에 저장되어 있는 값은 소멸된다.
    a1 = 200
    println("a1 : " + a1)

    // 변수에 선언과 동시에 변수에 값을 저장할 수 있다.
    var a2:Int = 300
    println("a2 : "+a2)

    // 변수 선언시 값을 저장할 때는 자료형을 생략해도 된다.
    // 변수에 저장하는 값을 보고 변수의 자료형이 결정된다.
    var a3 = 400
    println("a3 : " + a3)
    println("a3 type : " + a3.javaClass.name)

    var a4 = 11.11
    println("a4 : " + a4)
    println("a4 type : " + a4.javaClass.name)

    // 변수를 선언할 때 저장할 값이 없을 경우 자료형을 생략하면 오류가 발생한다.
    // var a5

    // 자료형이 결정된 변수는 자료형을 변경할 수 없다.
    // a4 = "안녕하세요"
    
    var a10:Byte = 100
    var a11:Short = 200
    var a12:Int = 300
    var a13:Long = 400
    
    var a14:Double = 11.11
    var a15:Float = 22.22F
    
    var a16:Char = '가'
    
    var a17:Boolean = true
    
    var a18:String = "문자열"

    println("a10 : " + a10)
    println("a11 : " + a11)
    println("a12 : " + a12)
    println("a13 : " + a13)
    println("a14 : " + a14)
    println("a15 : " + a15)
    println("a16 : " + a16)
    println("a17 : " + a17)
    println("a18 : " + a18)

    // 문자열 결합
    // 문자열 + 문자열 : 문자열 들을 합친 새로운 문자열을 만들어진다.
    var a20 = "안녕하세요 " + "반갑습니다"
    println("a20 : " + a20)

    // 문자열 + 문자열이 아닌 것 : 문자열이 아닌 것이 문자열로 변환된 다음 문자열 합치기를 한다.
    var a21 = "나이는 : " + 20
    println("a21 : " + a21)

    // ${ } 를 사용하면 + 연산자를 사용할 필요가 없다.
    var a22 = "나이는 : ${20}"
    println("a22 : ${a22}")

    // 만약 ${ } 안에 들어가는 것이 변수 하나라면 { }는 생략이 가능하다.
    var a23 = 20
    var a24 = "나이는 $a23"
    println("a24 : $a24")

    // val 키워드를 사용하면 변수의 값을 변경할 수 없다.
    val a30 = 100
    println("a30 : $a30")

    // a30 = 200

}