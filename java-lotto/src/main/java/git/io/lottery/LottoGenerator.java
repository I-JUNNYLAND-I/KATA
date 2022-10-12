package git.io.lottery;

import java.util.List;
import java.util.stream.IntStream;

public class LottoGenerator {
    RandomValueGenerate randomValueGenerate;
    private static final Integer PRICE = 1_000;

    public LottoGenerator(RandomValueGenerate randomValueGenerate) {
        this.randomValueGenerate = randomValueGenerate;
    }

    public List<Lotto> issue(Integer moneyAmount) {
        if (moneyAmount % PRICE != 0) throw new IllegalArgumentException("");

        return IntStream
                .of(moneyAmount / PRICE)
                .mapToObj(__ -> new Lotto(randomValueGenerate))
                .toList();
    }
}
