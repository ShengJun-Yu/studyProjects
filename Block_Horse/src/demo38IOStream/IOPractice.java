package demo38IOStream;

import java.io.*;
import java.util.HashMap;

/**
 * @author : Bojack
 * @date : Created in 16:20 2022.01.03
 * 练习:
 * 对文本的内容进行排序
 * 按照(1,2,3....)顺序排序
 * 分析:
 * 1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
 * 2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
 * 3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
 * 4.使用字符缓冲输入流中的方法readline,逐行读取文本
 * 5.对读取到的文本进行切割,获取行中的序号和文本内容
 * 6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
 * 7.遍历HashMap集合,获取每一个键值对
 * 8.把每一个键值对,拼接为一个文本行
 * 9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
 * 10.释放资源
 */
public class IOPractice {
    public static void main(String[] args) throws IOException {
//        创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
        HashMap<String,String> hashmap=new HashMap<>();
//        创建字符缓冲输入流对象,构造方法中绑定字符输入流
        BufferedReader br=new BufferedReader(new FileReader("Block_Horse/src/demo38IOStream/Practice.txt"));
//        创建字符缓冲输出流对象,构造方法中绑定字符输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("Block_Horse/src/demo38IOStream/Practice01.txt"));
        String len;
//        使用字符缓冲输入流中的方法readline,逐行读取文本
        while((len=br.readLine())!=null){
//            对读取到的文本进行切割,获取行中的序号和文本内容
            String[] split = len.split("\\.");
//            把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
            hashmap.put(split[0],split[1]);
        }
//        遍历HashMap集合,获取每一个键值对
        for (String key:
             hashmap.keySet()) {
//            把每一个键值对,拼接为一个文本行
            String s = key + "." + hashmap.get(key);
//            把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
            bw.write(s);
            bw.newLine();
        }
//        释放资源
        bw.close();
        br.close();

    }
}
