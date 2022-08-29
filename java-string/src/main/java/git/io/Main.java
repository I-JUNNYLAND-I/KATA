package git.io;

import static git.io.InAdaptor.scanner;

public class Main {
    public static void main(String[] args) {
        scanner();
        OutPort.end(123L);
    }
}
