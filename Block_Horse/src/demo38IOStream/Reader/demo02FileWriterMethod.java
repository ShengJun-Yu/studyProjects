package demo38IOStream.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:41 2022.01.02
 *  字符输出流写数据的其他方法
 *         - void write(char[] cbuf)写入字符数组。
 *         - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *         - void write(String str)写入字符串。
 *         - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class demo02FileWriterMethod {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt");
//        void write(char[] cbuf)写入字符数组。
        char[] ch={'a','b','c','d'};
        fw.write(ch);
//        void write(String str)写入字符串。
        fw.write("余盛军你好");
//        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("余盛军你好",3,2);

        fw.close();
    }
}
