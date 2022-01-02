package demo38IOStream.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:57 2022.01.02
 * java.io.Reader:字符输入流,是字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类
 * <p>
 * 共性的成员方法:
 * int read() 读取单个字符并返回。
 * int read(char[] cbuf)一次读取多个字符,将字符读入数组。
 * void close() 关闭该流并释放与之关联的所有资源。
 * <p>
 * java.io.FileReader extends InputStreamReader extends Reader
 * FileReader:文件字符输入流
 * 作用:把硬盘文件中的数据以字符的方式读取到内存中
 * <p>
 * 构造方法:
 * FileReader(String fileName)
 * FileReader(File file)
 * 参数:读取文件的数据源
 * String fileName:文件的路径
 * File file:一个文件
 * FileReader构造方法的作用:
 * 1.创建一个FileReader对象
 * 2.会把FileReader对象指向要读取的文件
 * 字符输入流的使用步骤:
 * 1.创建FileReader对象,构造方法中绑定要读取的数据源
 * 2.使用FileReader对象中的方法read读取文件
 * 3.释放资源
 *
 * 1个中文
 * GBK:占用两个字节
 * UTF-8:占用3个字节
 */
public class demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Block_Horse\\src\\demo38IOStream\\Reader\\read.txt");
        int len=0;
//        int read() 读取单个字符并返回。
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
//        int read(char[] cbuf)一次读取多个字符,将字符读入数组。
        char[] chars=new char[1024];
        int lenth=0;
        while ((lenth=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,lenth));
        }
//        void close() 关闭该流并释放与之关联的所有资源。
        fr.close();


    }
}
