package git.io;

import static git.io.Continious.of;
import static git.io.InAdaptor.scanner;
import static git.io.OutPort.end;

public class Main {
    public static void main(String[] args) {
        end(of(scanner()));
    }
}
