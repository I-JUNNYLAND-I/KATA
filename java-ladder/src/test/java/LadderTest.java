import git.io.ladder.Ladder;
import git.io.ladder.LadderHeight;
import git.io.ladder.line.Line;
import git.io.ladder.line.Lines;
import git.io.name.Names;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import git.io.result.Results;

import java.util.List;

public class LadderTest {
    private static final LadderHeight HEIGHT = new LadderHeight(5);
    private static final Names NAMES = new Names("pobi,honux,crong,jk");
    private static final Results RESULTS = new Results("GG,5000,GG,3000");

    @Test
    void LadderTest() {
        Assertions.assertThatCode(() -> {
            Ladder instance = new Ladder(HEIGHT, NAMES, RESULTS);
        }).doesNotThrowAnyException();
    }

    @Test
    void getLines() {
        Assertions.assertThatCode(() -> {
            Lines instance = new Ladder(HEIGHT, NAMES, RESULTS).extract();
        }).doesNotThrowAnyException();
    }
}
