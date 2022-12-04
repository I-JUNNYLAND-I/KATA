import git.io.name.Name;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NameValidationTest {

    @ParameterizedTest
    @CsvSource(value = {
            "pobi,honux,crong,jk"
    },delimiter = ',')
    void validNameTest(String name){
        Assertions.assertThatCode(() -> {
            Name instance = new Name(name);
        }).doesNotThrowAnyException();
    }
    @ParameterizedTest
    @CsvSource(value = {
            "pobddddi"
    },
    nullValues = "null",
    emptyValue = ""
    )
    void unValidNameTest(String name){
        Assertions.assertThatThrownBy(() -> {
            Name instance = new Name(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
