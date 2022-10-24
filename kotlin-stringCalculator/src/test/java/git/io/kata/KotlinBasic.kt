package git.io.kata

import org.junit.jupiter.api.Test

class KotlinBasic {
    @Test
    fun `변수 선언`() {
        val a: Int = if(true) 1 else 2
    }

    @Test
    fun `반복문`() {


    }

    @Test
    fun `if문`() {
        val data: Unit = print("보이드 반환")

        if (2 > 1) {
            println("2가 1보다 크다")
        }
        if (2 > 1) {
            println("2가 1보다 크다")
        } else {
            println("2가 1보다 크지 않다")
        }
    }

    @Test
    fun `내장 함수`() {
        var names: String = "junny"
        with(names) {
            println("이름은 $this 입니다.")
        }

        names.run { println("이름은 $this 입니다.") }
        names
            .let { println("이름은 $it 입니다.") }
    }

    @Test
    fun `function`() {
        val func: (Int, Int) -> Int = { a, b -> a + b }
        println(func(1, 2))

        // 이걸 토대로 "abc"를 입력 받으면 "def" 를 추가해서 반환하는 함수를 만들어 보세요요
        val func2: (String) -> String = { a -> a + "def" }
        print(func2("abc"))

    }

    @Test
    fun `선언형 코틀린`() {
        Pair(1, 2)
            .let { (a, b) -> a + b }
            .to(3)
            .copy(second = 4)
            .takeIf { it.first == 3 }
            .run { println(this) }
            .runCatching { 1 / 0 }
            .onFailure { println(it) }
            .onSuccess { println(it) }
            .recover { 0 }
            .let { println(it) }
    }

    @Test
    fun `잘배웠는지 검증하기`() {

        val data: Int? = validate("abc") //  빨간줄 뜨잔아요
        val data2: Int? = validate(null)

        // null이면 "에러입니다" 를 출력하고 아니면 입력값의 가장 첫번째 문자를 아스키 코드로 반환하는 함수를 만들

    }
    fun validate(input : String?) : Int = input
            ?.let { it.slice(0..0).toInt() }
            ?: throw IllegalArgumentException("에러입니다")
}