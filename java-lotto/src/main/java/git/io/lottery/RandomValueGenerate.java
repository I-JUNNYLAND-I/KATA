package git.io.lottery;

import java.util.List;
import java.util.random.RandomGenerator;

@FunctionalInterface
public interface RandomValueGenerate {
    List<Integer> generate(int origin, int bound, int count);


    class RandomValueGenerateImpl implements RandomValueGenerate {
        private final RandomGenerator randomGenerator;

        public RandomValueGenerateImpl(RandomGenerator randomGenerator) {
            this.randomGenerator = randomGenerator;
        }

        public List<Integer> generate(int origin, int bound, int count) {
            return randomGenerator.ints(origin, bound)
                    .distinct()
                    .limit(count)
                    .boxed()
                    .toList();
        }
    }
}
