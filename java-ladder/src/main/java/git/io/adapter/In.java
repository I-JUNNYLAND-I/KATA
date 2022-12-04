package git.io.adapter;

import git.io.ladder.LadderHeight;
import git.io.name.Names;
import git.io.result.Results;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public record In() {

    public Names readName() {
        return new Names(read());
    }


    public Results readResult(){
        return new Results(read());
    }

    public LadderHeight readHeight(){
        return new LadderHeight(read());
    }
    private static String read() throws IOException {
        InputStream in = System.in;
        // "in" to String
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put((byte) in.read());
        byteBuffer.flip();
        CharBuffer charBuffer = Charset.defaultCharset().decode(byteBuffer);
        return charBuffer.toString();
    }

}
