package demo17Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:57 2021.11.19
 *     java.lang.Object
 *     �� Object �����νṹ�ĸ�(��)�ࡣ
 *     ÿ����(Person,Student...)��ʹ�� Object ��Ϊ��(��)�ࡣ
 *     ���ж��󣨰������飩��ʵ�������ķ�����
 */
public class ToString {
    public static void main(String[] args) {
        Person person=new Person("Bojack",18);
        String l=person.toString();
       //ֱ�Ӵ�ӡ���������,��ʵ���ǵ��ö����toString
        System.out.println(l);

       //��һ�����Ƿ���д��toString,ֱ�Ӵ�ӡ�����Ķ��󼴿�,���û����дtoString������ô��ӡ���Ƕ���ĵ�ֵַ
        Random r=new Random();
        System.out.println(r);//δ������д

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);//�Ѹ�����д

        ArrayList<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(32);
        list.add(32);
        System.out.println(list);//�Ѹ�����д









    }
}
