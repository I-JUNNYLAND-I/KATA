import git.io.ladder.VerticalMaker;
import git.io.ladder.VerticalMaker.Vertical;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static git.io.ladder.VerticalMaker.Vertical.*;

public class VerticalLadderTest {
    @Test
    void OnNextOFF() {
        VerticalMaker instance = VerticalMaker.RANDOM;

        Vertical make = instance.make(ON);
        Assertions.assertThat(make).isEqualTo(OFF);
    }
}
