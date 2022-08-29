package git.io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static git.io.Operate.findByCode;
import static org.junit.jupiter.api.Assertions.*;

class OperateTest {

    @ParameterizedTest
    @CsvSource(value = {
                    "3:+:4:7",
                    "3:-:1:2",
                    "4:/:2:2",
                    "2:*:3:6"
            },delimiter = ':')
    void 연산식_계산(Long left, String code, Long right, Long result){
        Assertions.assertThat(findByCode(code).execute(left,right)).isEqualTo(result);
    }

}