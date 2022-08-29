package git.io;

import java.util.Scanner;

import static java.lang.System.in;

public class InAdaptor {
    private final String expressions;
    private Scanner scanner = new Scanner(in);

    private InAdaptor() {
        System.out.print("값 입력 :: ");
        this.expressions = scanner.next();
    }

    public static String scanner() {
        return new InAdaptor().getExpressions();
    }

    private String getExpressions() {
        return expressions;
    }
}
