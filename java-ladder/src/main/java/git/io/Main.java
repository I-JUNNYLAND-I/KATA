package git.io;

import git.io.Runner.ConsoleRunner;
import git.io.adapter.In;
import git.io.adapter.Out;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        ConsoleRunner.runner(new In(), new Out(new PrintStream(System.out)));
    }
}