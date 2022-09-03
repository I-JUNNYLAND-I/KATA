package git.io.kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class PlayerTests {
    @Test
    fun 생성하김() {
        assertDoesNotThrow { Player(Balls(listOf(Ball(1), Ball(2), Ball(3)))) }
    }
}