package git.io.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class BallsTests {
    @Test
    fun 생성하김() {
        assertDoesNotThrow {
            Balls(listOf(Ball(1), Ball(2), Ball(3)))
        }
    }
    @Test
    fun `3개넣김`() {
        assertThrows<IllegalArgumentException> {
            Balls(listOf())
        }.apply { assertThat(message).isEqualTo("볼은 3개여야 합니다") }
    }
    @Test
    fun `중복넣김`() {
        assertThrows<IllegalArgumentException> {
            Balls(listOf(Ball(1), Ball(1), Ball(1)))
        }.apply { assertThat(message).isEqualTo("볼은 중복될 수 없습니다") }
    }
    @Test
    fun `값찾김`() {
        val balls = Balls(listOf(Ball(1), Ball(2), Ball(3)))
        val isContains: Pair<Boolean, Int> = balls.contains(Ball(1))

        assertThat(isContains.first).isTrue
        assertThat(isContains.second).isEqualTo(0)
    }
}