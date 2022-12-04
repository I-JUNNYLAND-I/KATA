package git.io.ladder.line;

import java.util.List;
import java.util.stream.IntStream;

import static git.io.ladder.line.Line.line;

public record Lines(List<Line> lines) {
    public Lines(Integer height, Integer VerticalSize) {
        this(IntStream
                .range(0, height)
                .mapToObj(__ -> line(VerticalSize))
                .toList());
    }
}
