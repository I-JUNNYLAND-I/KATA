import git.io.RandomLottoGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RandomLottoGeneratorTest {
    private final RandomLottoGenerator randomLottoGenerator = () -> List.of(1, 2, 3, 4, 5, 6);

    @Test
    void test() {
        Assertions.assertThatCode(() -> {
            Assertions.assertThat(randomLottoGenerator.generate().size()).isEqualTo(6);
        }).doesNotThrowAnyException();
    }

}
