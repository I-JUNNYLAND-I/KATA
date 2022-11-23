package git.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

import static java.net.StandardProtocolFamily.INET;

public class Main {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open(INET);
        socketChannel.configureBlocking(true);

        socketChannel.connect(new InetSocketAddress("localhost", 8877));
        socketChannel.write(Charset.defaultCharset().encode("This is junny land"));

        ByteBuffer buffer = ByteBuffer.allocate(100000);
        while (true) {
            socketChannel.read(buffer);
            buffer.flip();
            String s = UTF_8.decode(buffer).toString();
            System.out.println("READ ="+ s);
        }
    }
}
