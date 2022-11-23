package git.io.kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class ComputerTests {
    @Test
    fun 추첨하김() {
        var i = 1
        assertDoesNotThrow { Computer { i++ } }
    }

    @Test
    fun ac() {
        var i = 1
        val computer = Computer { i++ }
        val player = Player(Balls(listOf(Ball(1), Ball(2), Ball(3))))

        val result: Triple<Int, Int, Int> = computer.matches(player)
        assertThat(result.first).isEqualTo(3)
        assertThat(result.second).isEqualTo(0)
        assertThat(result.third).isEqualTo(0)
    }
    @Test
    fun ac2() {
        var i = 1
        val computer = Computer { i++ }
        val player = Player(Balls(listOf(Ball(3), Ball(1), Ball(2))))

        val result: Triple<Int, Int, Int> = computer.matches(player)
        assertThat(result.first).isEqualTo(0)
        assertThat(result.second).isEqualTo(3)
        assertThat(result.third).isEqualTo(0)
    }
    @Test
    fun ac3() {
        var i = 1
        val computer = Computer { i++ }
        val player = Player(Balls(listOf(Ball(4), Ball(5), Ball(6))))

        val result: Triple<Int, Int, Int> = computer.matches(player)
        assertThat(result.first).isEqualTo(0)
        assertThat(result.second).isEqualTo(0)
        assertThat(result.third).isEqualTo(3)
    }

    @Test
    fun afsdf(){

    }
}