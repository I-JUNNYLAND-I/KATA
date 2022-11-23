package git.io.baseball;

import java.util.random.RandomGenerator;

import static java.lang.Math.*;
import static java.util.random.RandomGenerator.getDefault;

public interface Dice {
    Integer roll();

    class SixDice implements Dice {
        private final RandomGenerator randomGenerator = RandomGenerator.getDefault();
        @Override
        public Integer roll() {
            return toIntExact(randomGenerator.longs(1, 1, 7).findFirst().getAsLong());
        }
    }
}
