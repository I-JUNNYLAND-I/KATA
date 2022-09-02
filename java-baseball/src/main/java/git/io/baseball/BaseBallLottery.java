package git.io.baseball;

import java.util.List;
import java.util.random.RandomGenerator;

public class BaseBallLottery {
    private final List<Integer> list;

    private BaseBallLottery(RandomGenerator randomGenerator) {
        this.list = randomGenerator
                .ints(1, 10)
                .distinct()
                .limit(3)
                .boxed().toList();
    }

    public static List<Integer> extract(RandomGenerator randomGenerator) {
        return new BaseBallLottery(randomGenerator).list;
    }
}
