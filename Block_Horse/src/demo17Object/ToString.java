package demo17Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:57 2021.11.19
 *     java.lang.Object
 *     类 Object 是类层次结构的根(父)类。
 *     每个类(Person,Student...)都使用 Object 作为超(父)类。
 *     所有对象（包括数组）都实现这个类的方法。
 */
public class ToString {
    public static void main(String[] args) {
        Person person=new Person("Bojack",18);
        String l=person.toString();
       //直接打印对象的名字,其实就是调用对象的toString
        System.out.println(l);

       //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
        Random r=new Random();
        System.out.println(r);//未覆盖重写

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);//已覆盖重写

        ArrayList<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(32);
        list.add(32);
        System.out.println(list);//已覆盖重写









    }
}
