package git.io.adapter;

import java.io.Writer;

public class Out {

    private final Writer writer;

    private final Ladder ladder;

    public Out(Writer writer, Ladder ladder) {
        this.writer = writer;
        this.ladder = ladder;
    }
}
