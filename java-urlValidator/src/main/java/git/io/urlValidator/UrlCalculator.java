package git.io.urlValidator;

import java.util.ArrayList;
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

    public Long extract() throws IllegalAccessException {
        for (int i = 0; i < dataset.size() -1; i++) {
            Long result = WebClient.of(urlSet.get(i)).validate(dataset.get(i), dataset.get(i + 1));
            dataset.remove((int)i);
            dataset.set(i,result);
        }
        return null;
    }
}
