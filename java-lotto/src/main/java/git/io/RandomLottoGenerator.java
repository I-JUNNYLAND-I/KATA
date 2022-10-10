package git.io;

import java.util.List;
import java.util.random.RandomGenerator;

public interface RandomLottoGenerator {
    List<Integer> generate();

    class RandomLottoGeneratorLottoNum implements RandomLottoGenerator {
        private final RandomGenerator randomGenerator;

        public RandomLottoGeneratorLottoNum(RandomGenerator randomGenerator) {
            this.randomGenerator = randomGenerator;
        }

        @Override
        public List<Integer> generate() {
            return randomGenerator.ints(1, 46)
                    .distinct()
                    .limit(6)
                    .boxed()
                    .toList();
        }
    }
}
