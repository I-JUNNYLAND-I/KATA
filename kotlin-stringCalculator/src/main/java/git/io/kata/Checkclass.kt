package git.io.kata

import java.time.LocalDateTime

// 필드 선언
sealed class Checkclass (
    private var a: String,
    private val b: Int,
    private val c: LocalDateTime = LocalDateTime.now()
){
    init {
        require(a.isNotBlank()) { "a는 필수값입니다." }
    }
}

sealed class Check2class (
    private val a: String?,
) {
    private val d: String = a+"b"
}

data class calls21(private val a: String)
object calls22 : Checkclass("a", 1)
enum class call23(private val a: String) {
    DATA_1("a")
}

