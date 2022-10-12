package git.io.lottery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LottoTest {

    RandomValueGenerate generateWith6 = (Origin,Bound,Count) -> List.of(1, 2, 3, 4, 5, 6);

    @Test
    void createLottoNotError() {
        Assertions.assertThatCode(() -> {
            Lotto lotto = new Lotto(generateWith6);
            Assertions.assertThat(lotto.size()).isEqualTo(6);
        }).doesNotThrowAnyException();
    }

    RandomValueGenerate generateWith5 = (Origin,Bound,Count) -> List.of(1, 2, 3, 4, 5);
    @Test
    void createLotto() {
        Assertions.assertThatThrownBy(() -> {
            Lotto lotto = new Lotto(generateWith5);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
