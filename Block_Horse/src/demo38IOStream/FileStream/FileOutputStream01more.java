package demo38IOStream.FileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:06 2022.01.01
 * <p>
 * 一次写多个字节的方法:
 * - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
 * - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 */
public class FileOutputStream01more {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("Block_Horse/src/demo38IOStream/FileStream/text02.txt"));
//        public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        byte[] by = {68, 69, 80, 65};
        fos.write(by);
//        public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
        fos.write(by, 2, 2);

        /*
            写入字符的方法:可以使用String类中的方法把字符串,转换为字节数组
                byte[] getBytes()  把字符串转换为字节数组
         */
        byte[] by1 = "___Hello,World!".getBytes();
        fos.write(by1);
        fos.close();
    }
}
