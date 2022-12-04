import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import git.io.result.Results;

public class ResultsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "GG,3000,GG,5000"
    })
    void validName(String results){
        Assertions.assertThatCode(() -> {
            Results instance = new Results(results);
        }).doesNotThrowAnyException();
    }
}
