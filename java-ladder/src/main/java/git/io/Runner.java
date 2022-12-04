package git.io;

import git.io.adapter.In;
import git.io.adapter.Out;
import git.io.ladder.LadderHeight;
import git.io.ladder.line.Lines;
import git.io.name.Names;
import git.io.result.Results;

public interface Runner {

    class ConsoleRunner implements Runner {
        public static void runner(In in, Out out) {
            out.setJoiner();
            Names names = in.readName();
            out.setResult();
            Results results = in.readResult();
            out.setHeight();
            LadderHeight ladderHeight = in.readHeight();

            Ladder ladder = new Ladder(names, results, ladderHeight);
            Lines lines = ladder.extract();

            out.getResult(names, results, lines);
        }
    }
}
