package git.io.kata

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ExpressionsTest{
    @Test
    fun `식이 올바르지 않으면 예외를 던진다`() = assertThrows<IllegalArgumentException> { Expressions("1 & 2 ^ 3") }

    @Test
    fun `올바른 식은 통과 한다`() = assertDoesNotThrow { Expressions("1 - 2 + 3") }
}