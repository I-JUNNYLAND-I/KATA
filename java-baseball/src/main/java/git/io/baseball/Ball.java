package git.io.baseball;

public class Ball {
    private Long number;

    private Ball(Long number) {
        this.number = number;
    }

    protected static Ball from(Long number) {
        return new Ball(number);
    }
}
