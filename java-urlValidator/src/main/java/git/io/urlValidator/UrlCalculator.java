package git.io.urlValidator;

import java.util.List;
import java.util.stream.IntStream;

public class UrlCalculator {
    private final List<Long> dataset;
    private final List<String> urlSet;

    private WebClient webClient;

    private UrlCalculator(List<Long> longSet, List<String> urlSet) {
        this.dataset = longSet;
        this.urlSet = urlSet;
    }

    public static UrlCalculator setUp(List<Long> longSet, List<String> urlSet) {
        return new UrlCalculator(longSet, urlSet);
    }

    public Long extract() {
        return dataset.stream()
                .map()
                .reduce((value, idx) -> );
    }
}
