package demo23Integer;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 20:13 2021.11.25
 * 自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
 * JDK1.5之后出现的新特性
 */
public class IntegerAutomaticPackaging {
    public static void main(String[] args) {
    /*
    自动装箱:直接把int类型的整数赋值包装类
            Integer in = 1; 就相当于 Integer in = new Integer(1);
     */
        Integer i = 1;
        System.out.println(i);

    /*
    自动 拆箱:in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;就相当于 in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 又是一个自动装箱
     */
        i = i + 1;
        System.out.println(i);
    /*
       ArrayList集合无法直接存储整数,可以存储Integer包装类
     */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //-->自动装箱 list.add(new Integer(1));
        int a = list.get(0); //-->自动拆箱  list.get(0).intValue();
    }

}

