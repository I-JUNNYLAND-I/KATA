package git.io.kata

class Computer(
    function: () -> Int,
) {
    private val balls: Balls

    init {
        balls = Balls(generateSequence { function() }
            .distinct()
            .take(3)
            .map(::Ball)
            .toList())
    }

    fun matches(player: Player): Triple<Int, Int, Int> {
        var first = 0;
        var second = 0;
        var third = 0;

        for (ele in balls.ballList) {
            val (isContains, idx) = player.contains(ele)
            if (isContains) {
                if (player.balls.ballList[idx] == balls.ballList[idx]) {
                    first++
                } else {
                    second++
                }
            } else {
                third++;
            }
        }

        return Triple(first, second, third)
    }
}