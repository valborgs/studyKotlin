// null을 허용하는 변수에 null이 아닌 객체의 주소값이 들어가 있음을 확신 시켜주면
// 스마트 캐스팅이 발생하여 null을 허용하지 않는 타입으로 변환해준다.
// 강사님은 ?연산자 등 대신 이 방법을 권장함
fun main() {
    val t1:TestClass1? = TestClass1()
    val t2:TestClass1? = null

    // !! : null을 허용하는 변수의 값을 null을 허용하지 않는 변수에 담을 때 사용한다
    // 만약 null이 들어가 있으면 오류가 발생한다.
    val t3 = t1!!
    // val t4 = t2!! // 에러

    // ?: : null일 경우 새로운 객체를 생성하고자 할 때 사용한다.
    val t5 = t1 ?: TestClass1()
    val t6 = t2 ?: TestClass1()

    // ? : 객체가 가지고 있는 프로퍼티나 메서드를 사용하고자 할 때 사용한다.
    // 프로퍼티인 경우 null이 반환되고 메서드인 경우 호출이 취소된다.
    t1?.testMethod1()
    t2?.testMethod1()

    // if문으로 null 여부를 검사해주면 null을 허용하지 않는 타입으로 스마트 캐스팅이 발생한다.
    if(t1 != null){
        t1.testMethod1()
    }

    if(t1 is TestClass1){
        t1.testMethod1()
    }
}

class TestClass1{
    fun testMethod1(){
        println("TestClass1의 testMethod1 입니다")
    }
}