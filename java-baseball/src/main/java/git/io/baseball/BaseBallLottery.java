package git.io.baseball;

import java.util.List;
import java.util.random.RandomGenerator;

public interface BaseBallLottery {
    List<Integer> extract();

    BaseBallLottery RANDOM = () -> RandomGenerator.getDefault()
            .ints(1, 10)
            .distinct()
            .limit(3)
            .boxed().toList();
}

