package git.io.ladder;

import java.util.stream.IntStream;

public record LadderHeight(Integer height) {
    public LadderHeight{
        if(height == null || height < 1){
            throw new IllegalArgumentException("git.ladder.Ladder height must be a positive integer");
        }
    }
}
