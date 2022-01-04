package demo38IOStream;

import java.io.*;

/**
 * @author : Bojack
 * @date : Created in 15:39 2022.01.03
 * 明确:
 *         数据源: c:\\1.jpg
 *         数据的目的地: d:\\1.jpg
 *     文件复制的步骤:
 *         1.创建字节缓冲输入流对象,构造方法中传递字节输入流
 *         2.创建字节缓冲输出流对象,构造方法中传递字节输出流
 *         3.使用字节缓冲输入流对象中的方法read,读取文件
 *         4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
 *         5.释放资源(会先把缓冲区中的数据,刷新到文件中)
 */
public class IOBufferedCopy {
    public static void main(String[] args) throws IOException {
        long b = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("D:\\###AAA各种文件233333\\资料\\个人简历.docx");
        FileOutputStream fos = new FileOutputStream("Block_Horse/src/demo38IOStream/text04.zip");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len=0;
        while((len=bis.read())!=-1) {
            bos.write(len);
        }
//        byte[] by = new byte[1024000000];
//        int len = bis.read(by);
//        bos.write(by, 0, len);
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
