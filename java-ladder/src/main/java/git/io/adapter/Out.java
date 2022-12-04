package git.io.adapter;

import java.io.PrintStream;
import java.io.Writer;

public record Out() {


    public Out(){
        PrintStream out = System.out;
    }
}
