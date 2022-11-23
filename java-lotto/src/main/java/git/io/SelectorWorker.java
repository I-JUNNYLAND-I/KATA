package git.io;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class SelectorWorker extends Thread {
    private final Selector selector;

    public SelectorWorker(Selector selector) {
        this.selector = selector;
    }

    @Override
    public void run() {
        while (true) {
                if (isSelectActive()) continue;
                findOption();
        }
    }

    private boolean isSelectActive(){
        try {
            if (selector.select() == 0) {
                return true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    private void findOption() {
        selector.selectedKeys().forEach(selectionKey -> {
            Attached attached = (Attached) selectionKey.attachment();
            switch (selectionKey.readyOps()) {
                case SelectionKey.OP_ACCEPT -> System.out.println("OPTION = OP_ACCEPT");
                case SelectionKey.OP_CONNECT -> System.out.println("OPTION = OP_CONNECT");
                case SelectionKey.OP_READ -> System.out.println("OPTION = OP_READ");
                case SelectionKey.OP_WRITE -> System.out.println("OPTION = OP_WRITE");
                default -> System.out.println("OPTION = UNKNOWN");
            }
            ServerSocketChannel channel = (ServerSocketChannel) selectionKey.channel();
        });

    }
}

