package demo38IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:44 2022.01.01
 * 文件复制练习:一读一写
 * <p>
 * <p>
 * 文件复制的步骤:
 * 1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
 * 2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
 * 3.使用字节输入流对象中的方法read读取文件
 * 4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
 * 5.释放资源
 */
public class IOCopy {
    public static void main(String[] args) throws IOException {
        long b = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\###AAA各种文件233333\\资料\\个人简历.docx");
        FileOutputStream fos = new FileOutputStream("Block_Horse/src/demo38IOStream/text03.zip");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
//        byte[] by = new byte[1024000000];
//        int len = fis.read(by);
//        fos.write(by, 0, len);
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
