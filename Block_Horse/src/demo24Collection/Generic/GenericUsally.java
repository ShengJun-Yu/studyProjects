package demo24Collection.Generic;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 21:50 2021.11.30
 *   ���͵�ͨ���:
 *         ?:�����������������
 *     ʹ�÷�ʽ:
 *         ���ܴ�������ʹ��
 *         ֻ����Ϊ�����Ĳ���ʹ��
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
    ����һ������,�ܱ����������͵�ArrayList����
    ��ʱ�����ǲ�֪��ArrayList����ʹ��ʲô��������,���Է��͵�ͨ���?��������������
    ע��:
    ����û�м̳и����

     */
    public static void method(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
