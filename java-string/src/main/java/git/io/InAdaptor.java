package git.io;

import java.util.Scanner;

import static java.lang.System.in;

public class InAdaptor {
    private final String expressions;
    private Scanner scanner= new Scanner(in);

    private InAdaptor() {
        this.expressions = scanner.next();
    }

    public static String scanner(){
        return new InAdaptor().expressions;
    }
}
