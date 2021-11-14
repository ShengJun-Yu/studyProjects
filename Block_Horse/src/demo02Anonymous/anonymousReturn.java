package demo02Anonymous;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月11日22:00:18
 */
public class anonymousReturn {
    public static void main(String[] args) {
        //        普通用法
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //        匿名用法
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的为：" + num);

        //        使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        a(sc);
        //使用匿名对象传入参数
//        a(new Scanner(System.in));
        //
//        int num1= b().nextInt();
//        System.out.println("输入的是：" + num1);

//        Scanner sc=new Scanner(System.in);
//        int num1=sc.nextInt();
//        System.out.println("输入的是：" + num1);
        int num1 = b().nextInt();
        System.out.println("输入的是：" + num1);

    }

    public static void a(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner b() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }


}
