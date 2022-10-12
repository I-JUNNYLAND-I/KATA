package git.io.lottery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.random.RandomGenerator;

public class RandomValueGenerateTest {
    private final RandomGenerator randomGenerator = RandomGenerator.getDefault();

    @ParameterizedTest
    @CsvSource(value = {
            "1:45:6:6",
            "1:90:8:8",
            "1:15:10:10",
    },delimiter = ':')
    void 랜덤_값_출력(int orgin, int bound, int count, int size){
        RandomValueGenerate randomValueGenerate = new RandomValueGenerate.RandomValueGenerateImpl(randomGenerator);
        List<Integer> result =  randomValueGenerate.generate(orgin, bound, count);

        List<Integer> distinctSize = result.stream().distinct().toList();
        Assertions.assertThat(distinctSize.size()).isEqualTo(size);
    }

}
