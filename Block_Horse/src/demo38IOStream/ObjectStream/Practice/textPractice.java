package demo38IOStream.ObjectStream.Practice;

import demo38IOStream.ObjectStream.Person;

import java.io.*;
import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 12:41 2022.02.25
 *   练习：序列化集合
 *         当我们想在文件中保存多个对象的时候
 *         可以把多个对象存储到一个集合中
 *         对集合进序列化和反序列化
 *
 *          1.定义一个存储Person对象的ArrayList集合
 *         2.往ArrayList集合中存储Person对象
 *         3.创建一个序列化流ObjectOutputStream对象
 *         4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
 *         5.创建一个反序列化ObjectInputStream对象
 *         6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
 *         7.把Object类型的集合转换为ArrayList类型
 *         8.遍历ArrayList集合
 *         9.释放资源
 */
public class textPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person per = new Person("军", 12);
        Person per1 = new Person("军", 12);
        Person per2 = new Person("军", 12);
//        1.定义一个存储Person对象的ArrayList集合
        ArrayList<persons> list = new ArrayList<persons>();
//        2.往ArrayList集合中存储Person对象
        list.add(new persons("余盛军", 22, per));
        list.add(new persons("违法", 222, per1));
        list.add(new persons("余违法", 2332, per2));
//        3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Block_Horse/src/demo38IOStream/ObjectStream/Practice/text.txt"));
//        4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        oos.writeObject(list);
//        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Block_Horse/src/demo38IOStream/ObjectStream/Practice/text.txt"));
//        7.把Object类型的集合转换为ArrayList类型
        Object o = ois.readObject();
//        8.将object类强转为persons类
        ArrayList<persons> list1=(ArrayList<persons>)o;
//        9.遍历ArrayList集合
        for (persons li:list1) {
            System.out.println(li);
        }
//        10.关闭资源
        ois.close();
        oos.close();

    }
}
