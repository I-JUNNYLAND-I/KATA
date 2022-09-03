package git.io.kata

class Balls(val ballList: List<Ball>) {
    init {
        require(ballList.size == 3) { "볼은 3개여야 합니다" }
        require(ballList.distinct().size == 3) { "볼은 중복될 수 없습니다" }
    }

    fun contains(ball: Ball): Pair<Boolean, Int> = ballList
        .indexOfFirst { it == ball }
        .let {
            if (it == -1) Pair(false, -1)
            else Pair(true, it)
        }


}