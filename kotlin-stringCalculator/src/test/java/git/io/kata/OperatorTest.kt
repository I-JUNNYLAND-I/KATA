package git.io.kata

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OperatorTest{
    @Test
    fun `덧셈 테스트`() = assertEquals(3, Operator.PLUS.execute(1,2))
    @Test
    fun `뺄셈 테스트`() = assertEquals(1, Operator.MINUS.execute(3,2))
    @Test
    fun `곱셈 테스트`() = assertEquals(6, Operator.MULTIPLY.execute(3,2))
    @Test
    fun `나눗셈 테스트`() = assertEquals(2, Operator.DIVIDE.execute(6,3))
}