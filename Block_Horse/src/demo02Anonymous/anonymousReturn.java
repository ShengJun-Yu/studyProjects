package demo02Anonymous;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021��10��11��22:00:18
 */
public class anonymousReturn {
    public static void main(String[] args) {
        //        ��ͨ�÷�
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //        �����÷�
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("�����Ϊ��" + num);

        //        ʹ��һ��д���������
//        Scanner sc = new Scanner(System.in);
//        a(sc);
        //ʹ���������������
//        a(new Scanner(System.in));
        //
//        int num1= b().nextInt();
//        System.out.println("������ǣ�" + num1);

//        Scanner sc=new Scanner(System.in);
//        int num1=sc.nextInt();
//        System.out.println("������ǣ�" + num1);
        int num1 = b().nextInt();
        System.out.println("������ǣ�" + num1);

    }

    public static void a(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    public static Scanner b() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }


}
