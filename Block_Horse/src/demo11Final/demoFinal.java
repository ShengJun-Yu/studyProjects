package demo11Final;

/**
 * @author : Bojack
 * @date : Created in 17:58 2021.11.14
 * final关键字代表最终、不可改变的。
 *
 * 常见四种用法：
 * 1. 可以用来修饰一个类
 * 2. 可以用来修饰一个方法
 * 3. 还可以用来修饰一个局部变量
 * 4. 还可以用来修饰一个成员变量
 */
public class demoFinal {
    public static void main(String[] args) {

        // 一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        // “一次赋值，终生不变”
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);
// 对于基本类型来说，不可变说的是变量当中的数据不可改变
        final int num1=20;
        System.out.println(num1);
//        num1=10;
//        num1=20;

        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        demoFinal01 fin=new demoFinal01("Bojack");
        System.out.println(fin.getName());
        System.out.println(fin);
        fin=new demoFinal01("jun");
        System.out.println(fin.getName());
        System.out.println(fin);
        System.out.println("==================");

        // final的引用类型变量，其中的地址不可改变
        final demoFinal01 fin1=new demoFinal01("Bojakk");
        System.out.println(fin1.getName());
        System.out.println(fin1);
        fin1.setName("Bojackkkk");
        System.out.println(fin1);
        System.out.println(fin1.getName());


    }
}
