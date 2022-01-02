package demo38IOStream.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 17:00 2022.01.02
 * java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
 * Properties集合是一个唯一和IO流相结合的集合
 * 可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
 * 可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
 * <p>
 * 属性列表中每个键及其对应值都是一个字符串。
 * Properties集合是一个双列集合,key和value默认都是字符串
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        chun();
        chunHarddisk();
    }
    /*
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数:
            OutputStream out:字节输出流,不能写入中文
            Writer writer:字符输出流,可以写中文
            String comments:注释,用来解释说明保存的文件是做什么用的
                    不能使用中文,会产生乱码,默认是Unicode编码
                    一般使用""空字符串

        使用步骤:
            1.创建Properties集合对象,添加数据
            2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
            4.释放资源
     */
    private static void chunHarddisk() throws IOException {
//        1.创建Properties集合对象,添加数据
        Properties p = new Properties();
        p.setProperty("stephen", "21");
        p.setProperty("Rilly", "21");
        p.setProperty("Bojack", "21");
//        2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
        FileWriter fw=new FileWriter("Block_Horse/src/demo38IOStream/Properties/demo01.txt");
//        3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储 comments:注释,
        p.store(fw,"YuShengJun Save Data");
//        4.释放资源
        fw.close();
    }

    /*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        Properties集合是一个双列集合,key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
     Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
     String getProperty(String key) 通过key找到value值,此方法相当于Map集合中的get(key)方法
     Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
     */
    private static void chun() {
        Properties p = new Properties();
        p.setProperty("stephen", "21");
        p.setProperty("Rilly", "21");
        p.setProperty("Bojack", "21");
//    Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
        Set<String> s = p.stringPropertyNames();
        for (String str: s) {
            System.out.println(str+"年龄"+p.getProperty(str));
        }
    }

}
