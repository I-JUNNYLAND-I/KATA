package git.io.in;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

public class Testdaf {
    @Test
    void adfa() {
        List<Rank> ranks = EnumSet.allOf(Rank.class).stream().toList();

        HashMap<Rank, Integer> hashMap = ranks
                .stream()
                .collect(HashMap::new, (map, rank) -> map.put(rank, map.getOrDefault(rank, 0) + 1), HashMap::putAll);

    }


    enum Rank {

        FIRST(6, 2_000_000_000),
        SECOND(5, 1_500_000),
        THIRD(4, 50_000),
        FOURTH(3, 5_000),
        NOTHING(0, 0),
        ;

        private final long numberOfMatchingNumbers;
        private final double prizeAmount;

        Rank(long numberOfMatchingNumbers, double prizeAmount) {
            this.numberOfMatchingNumbers = numberOfMatchingNumbers;
            this.prizeAmount = prizeAmount;
        }

        public static Rank rank(long numberOfMatchingNumbers) {
            return EnumSet.allOf(Rank.class)
                    .stream()
                    .filter(rank -> rank.numberOfMatchingNumbers == numberOfMatchingNumbers)
                    .findFirst()
                    .orElse(Rank.NOTHING);
        }

        public double prizeAmount() {
            return prizeAmount;
        }

    }
}
