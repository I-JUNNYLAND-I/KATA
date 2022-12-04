package git.io.ladder.line;

import git.io.ladder.VerticalMaker;
import git.io.ladder.VerticalMaker.Vertical;

import static git.io.ladder.VerticalMaker.RANDOM;
import static git.io.ladder.VerticalMaker.Vertical.OFF;

public record Line(String line){
    public static Line line(int verticalSize) {
        LineSeparator first = new LineSeparator("|", OFF);
        for (int i = 0; i < verticalSize; i++) {
            first = first.addValue();
        }
        return new Line(first.value());
    }
    private static VerticalMaker maker  = RANDOM;

    private record LineSeparator(String value, Vertical position) {
            private LineSeparator addValue() {
                Vertical make = maker.make(position);
                return new LineSeparator(this.value + make.value() + "|", make);
            }
    }
}
