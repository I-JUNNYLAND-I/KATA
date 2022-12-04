package git.io.name;

import java.util.Arrays;
import java.util.List;

public record Names(List<Name> names) {
    public Names(String names) {
        this(Arrays.stream(names.split(",")).map(Name::new).toList());
    }

    public int size() {
        return this.names.size();
    }
}
