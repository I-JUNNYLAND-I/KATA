import git.io.ladder.line.Line;
import org.junit.jupiter.api.Test;

public class LineTest {
    
    @Test
    void LineTest(){
        Line instance = Line.line(5);

        System.out.println("instance.line() = " + instance.line());
    }
}
