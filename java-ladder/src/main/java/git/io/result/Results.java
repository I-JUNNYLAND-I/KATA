package git.io.result;

import java.util.Arrays;
import java.util.List;

public record Results(List<Result> results) {

    public Results(String results) {
        this(Arrays.stream(results.split(",")).map(Result::new).toList());
    }

    public int size() {
        return this.results.size();
    }

}
