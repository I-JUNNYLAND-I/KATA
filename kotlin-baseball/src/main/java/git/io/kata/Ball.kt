package git.io.kata

class Ball(val ballNumber: Int) {
    init {
        require(ballNumber in 1..9) { "1~9만댐" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ball

        if (ballNumber != other.ballNumber) return false

        return true
    }

    override fun hashCode(): Int {
        return ballNumber
    }

}