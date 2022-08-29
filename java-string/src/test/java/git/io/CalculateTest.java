package git.io;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @ParameterizedTest
    @CsvSource(
            value = "3+4-2*4"

    )
    void 값을_계산한다(){


    }


}