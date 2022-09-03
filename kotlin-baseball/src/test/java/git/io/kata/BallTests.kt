package git.io.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class BallTests {
    @ParameterizedTest
    @CsvSource(value = ["1,2,3,4,5,6,7,8,9"])
    fun mom_death(ballNumber: Int) {
        assertDoesNotThrow { Ball(ballNumber) }
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 10])
    fun dad_death(ballNumber: Int) {
        assertThrows<IllegalArgumentException> { Ball(ballNumber) }
            .apply { assertThat(message).isEqualTo("1~9만댐") }
    }
}