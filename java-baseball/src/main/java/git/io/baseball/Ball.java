package git.io.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ball {
    private Long number;

    private Ball(Long number) {
        this.number = number;


    }


    protected static Ball from(Long number) {
        return new Ball(number);
    }


}

