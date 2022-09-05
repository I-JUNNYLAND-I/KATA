package git.io.baseball;

import java.util.List;
import java.util.random.RandomGenerator;

public interface BaseBallLottery {
    List<Ball> extract();

    BaseBallLottery RANDOM = () -> RandomGenerator.getDefault()
            .longs(1, 10)
            .distinct()
            .limit(3)
            .mapToObj(Ball::from)
            .toList();
}

