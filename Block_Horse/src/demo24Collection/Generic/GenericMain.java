package demo24Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 20:27 2021.11.30
 * �������϶���,ʹ�÷���
 * �ô�:
 * 1.����������ת�����鷳,�洢����ʲô����,ȡ���ľ���ʲô����
 * 2.���������쳣(��������֮����׳����쳣),�������˱�����(д�����ʱ��ᱨ��)
 * �׶�:
 * ������ʲô����,ֻ�ܴ洢ʲô���͵�����
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
            System.out.println(s + "����Ϊ" + s.length());
        }

    }

    /*
        �������϶���,��ʹ�÷���
        �ô�:
            ���ϲ�ʹ�÷���,Ĭ�ϵ����;���Object����,���Դ洢�������͵�����
        �׶�:
            ����ȫ,�������쳣
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
            //���׳�ClassCastException����ת���쳣,���ܰ�Integer����ת��ΪString����
            String st = (String) obj;
            int length = st.length();
            System.out.println("����Ϊ" + length);//����ClassCastException
        }
    }
}
