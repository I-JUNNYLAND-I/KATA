import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import git.io.result.Result;

public class ResultTest {

    @ParameterizedTest
    @CsvSource(value = {
            "3000,GG,5000,GG"
    }, delimiter = ',')
    void validResultTest(String name){
        Assertions.assertThatCode(() -> {
            Result instance = new Result(name);
        }).doesNotThrowAnyException();
    }
    @ParameterizedTest
    @CsvSource(value = {
            "asdfasdf"
    },
            nullValues = "null",
            emptyValue = ""
    )
    void unValidResultTest(String result){
        Assertions.assertThatThrownBy(() -> {
            Result instance = new Result(result);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
