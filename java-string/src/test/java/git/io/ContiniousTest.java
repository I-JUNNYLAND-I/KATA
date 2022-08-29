package git.io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ContiniousTest {

    @ParameterizedTest
    @CsvSource(value = {
            "3 + 4 - 2 :5",
            "3 * 4 - 2:10",
            "2 + 3 * 4 / 2:10"
    },
    delimiter = ':')
    void 계산(String expression, Long result){
        Long compare =Continious.of(expression);

        Assertions.assertThat(compare).isEqualTo(result);

    }
}