import jdk.incubator.vector.VectorOperators.Test

// 코틀린 범위 지정 함수
// let, apply, run, with, also
// 생성되어 있는 객체의 프로퍼티나 메서드를 사용할 경우
// 혹은 클래스로부터 객체를 생성할 때 사용한다.


fun main() {

    val t1 = TestClass1(100,200)
    t1.a3 = 300
    t1.a4 = 400
    t1.testMethod1()

    println("-----------------------------------------------")

    // 이미 생성되어 있는 객체에 코틀린 범위 지정함수를 사용한다.

    // let
    val t2 = TestClass1(100, 200)
    // 첫 번째 매개변수로 객체의 주소값이 들어온다.
    // it을 통해 객체의 프로퍼티나 메서드를 사용하면 된다.
    t2.let{
        it.a3 = 300
        it.a4 = 400
        it.testMethod1()
    }

    println("-----------------------------------------------")

    // apply
    val t3 = TestClass1(100,200)
    // apply에 작성한 코드는 apply를 호출한 객체의 메서드로 포함된다.
    // this나 아무것도 통하지 않고 프로퍼티나 메서드를 사용하는 것이 가능하다.
    t3.apply{
        a3 = 300
        a4 = 400
        testMethod1()
    }

    // run
    val t4 = TestClass1(100, 200)
    t4.run{
        a3 = 300
        a4 = 400
        testMethod1()
    }

    // also
    val t5 = TestClass1(100, 200)
    t5.also{
        it.a3 = 300
        it.a4 = 400
        it.testMethod1()
    }

    // with
    val t6 = TestClass1(100, 200)
    with(t6){
        a3 = 300
        a4 = 400
        testMethod1()
    }

    println("-----------------------------------------------")
    // 객체를 생성할 때 사용

    // let : 객체에 접근할 때 it 변수를 사용한다.
    // 코드 블럭 마지막에 작성된 값, 객체의 주소값, 수식의 값을 반환해준다.
    // t7 변수에는 TestClass1(100, 200) 를 통해 생성된 객체의 주소값이 아니라
    // let 이 반환하는 것이 담긴다.
    // let 마지막에 it을 작성하여 객체의 주소값이 반환될 수 있도록 해줘야 한다.
    val t7 = TestClass1(100,100).let{
        it.a3 = 300
        it.a4 = 400
        it
    }

    println("-----------------------------------------------")
    // apply : 생성된 객체의 주소값이 apply 쪽으로 전달되어 this(혹은 생략)을 통해
    // 객체의 프로퍼티나 메서드에 접근할 수 있다.
    // 람다식 내부의 코드가 수행이 끝나면 생성된 객체의 주소값이 변수에 담긴다.
    // 이에 람다식 내부에 객체의 주소값을 반환하기 위한 코드를 작성하지 않는다.
    val t8 = TestClass1(100, 200).apply{
        a3 = 300
        a4 = 400
    }
    println(t8)
    t8.testMethod1()

    println("-----------------------------------------------")

    // run : 객체를 생성한 후에 run 람다식 내부로 객체의 주소값이 전달되기 때문에
    // this(혹은 생략)을 통해 프로퍼티나 메서드에 접근할 수 있다.
    // 람다식의 수행이 끝나면 제일 마지막에 작성한 값이 반환되어 변수에 담긴다.
    // 이에 생성된 객체의 주소값이 변수(t9)에 담기게 하기 위해서는
    // 람다식 마지막에 this를 명시하여 객체의 주소값을 반환하게 해야 한다.
    val t9 = TestClass1(100, 200).run{
        a3 = 300
        a4 = 400
        this
    }
    println(t9)
    t9.testMethod1()

    println("-----------------------------------------------")

    // also : 생성된 객체의 주소값이 람다식의 it 변수에 담기게 된다.
    // 따라서 it을 통해 프로퍼티나 메서드에 접근할 수 있다.
    // also 람다식이 끝나면 변수(t10)에 객체의 주소값이 담기게 된다.
    // 마지막에 객체의 주소값을 반환하는 코드는 작성하지 않는다.
    val t10 = TestClass1(100, 200).also{
        it.a3 = 300
        it.a4 = 400
    }
    println(t10)
    t10.testMethod1()

    println("-----------------------------------------------")

    // 람다식 코드가 생성된 객체의 일부분 처럼 동작하기 때문에 this(생략가능)을 통해
    // 프로퍼티나 메서드에 접근한다.
    // 람다식 마지막에 객체의 주소값을 반환하는 코드를 작성해야지만 변수(t11)에
    // 객체의 주소값이 담긴다.
    val t11 = with(TestClass1(100,200)){
        a3 = 300
        a4 = 400
        this
    }
    println(t11)
    t11.testMethod1()

}

class TestClass1(var a1:Int, var a2:Int){
    var a3:Int = 0
    var a4:Int = 0

    fun testMethod1(){
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}