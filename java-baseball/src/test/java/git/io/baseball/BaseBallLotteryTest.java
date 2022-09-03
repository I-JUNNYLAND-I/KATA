package git.io.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.random.RandomGenerator;

import static git.io.baseball.BaseBallLottery.RANDOM;

class BaseBallLotteryTest {

    RandomGenerator randomGenerator = RandomGenerator.getDefault();

    @Test
    void 숫자_추출하김() {
        List<Integer> baseBallLottery = RANDOM.extract();
        Assertions.assertThat(baseBallLottery).hasSize(3);
    }
}