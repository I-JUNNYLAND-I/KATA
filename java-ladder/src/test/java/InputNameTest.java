import git.io.name.Names;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InputNameTest {

    @ParameterizedTest
    @CsvSource(value = {
            "pobi,honux,crong,jk"
    })
    void validName(String names){
        Assertions.assertThatCode(() -> {
            Names instance = new Names(names);
        }).doesNotThrowAnyException();
    }
}
