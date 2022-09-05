package git.io.urlValidator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;

public class UrlCalculatorTest {
    @ParameterizedTest
    @MethodSource(value = "url")
    void test1(List<Long> longSet, List<String> urlSet, Long result) {
        Long set = UrlCalculator.setUp(longSet, urlSet).extract();

        assertThat(set).isEqualTo(result);
    }

    public static Stream<Arguments> url() {
        return Stream.of(
                Arguments.of(of(1L, 2L, 3L, 4L), of("http://naver.com", "http://nate.pkt", "http://daum.net"), 7L)
        );
    }

    @ParameterizedTest
    @CsvSource(value = {
            "http://naver.com&7", "http://nate.pkt&3", "http://daum.net&7"},
            delimiter = '&'
    )
    void 외부_URL으로_검증한다(String url, Long result) throws IllegalAccessException {
        Long left = 3L;
        Long right = 4L;
        assertThat(WebClient.of(url).validate(left, right)).isEqualTo(result);
    }

}
