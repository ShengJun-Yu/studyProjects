package demo38OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:46 2022.01.01
 * 字节输入流一次读取多个字节的方法:
 * int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 * 明确两件事情:
 * 1.方法的参数byte[]的作用?
 * 起到缓冲作用,存储每次读取到的多个字节
 * 数组的长度一把定义为1024(1kb)或者1024的整数倍
 * 2.方法的返回值int是什么?
 * 每次读取的有效字节个数
 * <p>
 * String类的构造方法
 * String(byte[] bytes) :把字节数组转换为字符串
 * String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
 */
public class FileInputStream01Add {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt");
//        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
//        byte[] by=new byte[2];
//        int len = fis.read(by);
//        System.out.println(len);//读取的长度
////        String(byte[] bytes) :把字节数组转换为字符串
//        System.out.println(new String(by));

        byte[] by = new byte[1024];
        int len = 0;//len:有效字节个数
        while ((len = fis.read(by)) != -1) {
//   String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
            System.out.println(new String(by, 0, len));
        }


//        int lenth=0;
//        int len1=0;
//        while((len1=fis.read())!=-1){
//            lenth++;
//        }
//        FileInputStream fis1=new FileInputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt");
//        byte[] all=new byte[lenth];
//        fis1.read(all);
//        System.out.println(new String(all));
        fis.close();
    }
}
