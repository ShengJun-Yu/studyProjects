package demo24Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 20:27 2021.11.30
 * 创建集合对象,使用泛型
 * 好处:
 * 1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
 * 2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
 * 弊端:
 * 泛型是什么类型,只能存储什么类型的数据
 */
public class GenericMain {
    public static void main(String[] args) {
        demo01();
        System.out.println("==============");
        demo02();
    }

    private static void demo02() {
        ArrayList<String> string = new ArrayList<>();
        string.add("Bojack");
        string.add("Cete");
        string.add("Roilly");
        string.add("Roilly");
        Iterator<String> its = string.iterator();
        while (its.hasNext()) {
            String s = its.next();
            System.out.println(s + "长度为" + s.length());
        }

    }

    /*
        创建集合对象,不使用泛型
        好处:
            集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
        弊端:
            不安全,会引发异常
     */
    private static void demo01() {
        ArrayList list = new ArrayList();
        list.add("Bojack");
        list.add("Cete");
        list.add("Roilly");
        list.add("Roilly");
        list.add("End");
        list.add(11);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj);
            //会抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
            String st = (String) obj;
            int length = st.length();
            System.out.println("长度为" + length);//报错ClassCastException
        }
    }
}
