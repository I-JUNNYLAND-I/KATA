package git.io.kata

class Player(val balls: Balls) {
    fun contains(ball: Ball): Pair<Boolean, Int> = balls.contains(ball)
}