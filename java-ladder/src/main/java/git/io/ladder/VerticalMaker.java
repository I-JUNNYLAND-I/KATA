package git.io.ladder;

import static git.io.ladder.VerticalMaker.Vertical.OFF;
import static git.io.ladder.VerticalMaker.Vertical.ON;
import static java.util.random.RandomGenerator.getDefault;

@FunctionalInterface
public interface VerticalMaker {

    Vertical make(Vertical vertical);

    VerticalMaker RANDOM = (BEFORE) -> {
        if (BEFORE == ON) {
            return OFF;
        }
        return getDefault().nextLong() % 2 == 0 ? ON : OFF;
    };

    enum Vertical {
        ON("-----"),
        OFF("     ");

        private final String value;

        Vertical(String value) {
            this.value = value;
        }

        public static Vertical with(Boolean next){
            if(next){
                return ON;
            }
            return OFF;
        }

        public String value() {
            return value;
        }
    }
}
