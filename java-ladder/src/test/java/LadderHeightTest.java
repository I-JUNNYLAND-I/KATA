import git.io.ladder.LadderHeight;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

public class LadderHeightTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,3,5,7"
    }, delimiter = ',')
    void validLadderHeightTest(Integer height){
        Assertions.assertThatCode(() -> {
            LadderHeight instance = new LadderHeight(height);
        }).doesNotThrowAnyException();
    }
    @NullSource
    @ParameterizedTest
    void unValidLadderHeightTest(Integer height){
        Assertions.assertThatThrownBy(() -> {
            LadderHeight instance = new LadderHeight(height);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
