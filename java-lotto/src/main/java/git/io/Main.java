package git.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);
        datagramChannel.configureBlocking(false);

        datagramChannel.bind(new InetSocketAddress(7788));

        new Thread(() -> {
            System.out.println("Start Server");

            System.out.println("Waiting Client");
            while (true) {
                try {
                    ByteBuffer byteBuffer = ByteBuffer.allocate(10000);
                    SocketAddress receive = datagramChannel.receive(byteBuffer);
                    System.out.println("Client Message: " + UTF_8.decode(byteBuffer));
                } catch (IOException e) {
                    System.out.println("Close Server");
                    throw new RuntimeException(e);
                }
            }
        }).start();


        Thread.sleep(1000000L);
        datagramChannel.close();
    }
}
