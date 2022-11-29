package git.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.random.RandomGenerator;

import static jdk.internal.joptsimple.internal.Strings.join;

public class Client {
    private final SocketChannel socketChannel;

    public Client() {
        System.out.println("[ TRY TO CONNECT :: "+ "localhost:8877 ]");
        try {
            this.socketChannel = SocketChannel.open();
            this.socketChannel.configureBlocking(true);
            this.socketChannel.connect(new InetSocketAddress("localhost", 8877));
        } catch (IOException e) {
            System.out.println("[ CONNECT FAILED ::: ]");
            throw new RuntimeException(e);
        }
        System.out.println("[ CONNECT COMPLETE ::: "+ socketChannel.socket().getRemoteSocketAddress() + " ]");
    }
    Integer data = 0;
    public synchronized void receive(){
        data++;
    }
}
