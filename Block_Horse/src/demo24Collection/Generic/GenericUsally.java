package demo24Collection.Generic;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 21:50 2021.11.30
 *   泛型的通配符:
 *         ?:代表任意的数据类型
 *     使用方式:
 *         不能创建对象使用
 *         只能作为方法的参数使用
 */
public class GenericUsally {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(1324);
        list01.add(1213);
        list01.add(1423);
        ArrayList<String> list02=new ArrayList<>();
        list02.add("fa");
        list02.add("gsf");
        list02.add("ersg");

        method(list01);
        System.out.println("===========");
        method(list02);

    }
    /*
    定义一个方法,能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
    注意:
    泛型没有继承概念的

     */
    public static void method(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
