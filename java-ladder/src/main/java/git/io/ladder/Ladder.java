package git.io.ladder;

import git.io.ladder.line.Lines;
import git.io.name.Names;
import git.io.result.Results;

public record Ladder(LadderHeight height, Names names, Results results) {
    public Ladder {
        if (names.size() != results.size()) {
            throw new IllegalArgumentException("git.ladder.Ladder names and results size must be same");
        }
    }

    public Lines extract() {
        return new Lines(height.height(), names.size());
    }
}
