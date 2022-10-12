package git.io.lottery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

class LottoGeneratorTest {

    RandomValueGenerate randomValueGenerate = (A,B,C) -> List.of(1, 2, 3, 4, 5, 6);
    @ParameterizedTest
    @ValueSource(ints = {1000})
    void 로또_구매(Integer money) {
        LottoGenerator lottoGenerator = new LottoGenerator(randomValueGenerate);

        List<Lotto> result = lottoGenerator.issue(money);

        Assertions.assertThat(result.size()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {1500, 2700, 3300, 11700, 2147500})
    void 로또_못구매(Integer money) {
        Assertions.assertThatThrownBy(() -> {
            LottoGenerator lottoGenerator = new LottoGenerator(randomValueGenerate);
            lottoGenerator.issue(money);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}