import git.io.LottoPack;
import git.io.RandomLottoGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LottoPackTest {
    private static final LottoPack LOTTO_PACK = new LottoPack(() -> List.of(1, 2, 3, 4, 5, 6), new ArrayList<>());

    @Test
    void test() {
        Assertions.assertThatCode(() -> {
            LOTTO_PACK.buy(5);
            Assertions.assertThat(LOTTO_PACK.size()).isEqualTo(5);
        }).doesNotThrowAnyException();
    }

    @Test
    void test2() {
        RandomLottoGenerator randomLottoGenerator = () -> List.of(1, 2, 3, 4, 5, 6);

        List<Integer> generate = randomLottoGenerator.generate();
        List<Integer> generate1 = randomLottoGenerator.generate();

        generate.stream().flatMapToInt(e -> generate1.stream().mapToInt(e1 -> e1)).forEach(System.out::println);
    }
}
