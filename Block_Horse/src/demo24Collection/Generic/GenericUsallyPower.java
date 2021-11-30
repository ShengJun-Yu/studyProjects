package demo24Collection.Generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : Bojack
 * @date : Created in 22:56 2021.11.30
 *     ���͵������޶�: ? extends E  ����ʹ�õķ���ֻ����E���͵�����/����
 *     ���͵������޶�: ? super E    ����ʹ�õķ���ֻ����E���͵ĸ���/����
 */
public class GenericUsallyPower {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        //getElement1(list2);//����
        getElement1(list3);
        //getElement1(list4);//����

        //getElement2(list1);//����
        //getElement2(list2);//����
        getElement2(list3);
        getElement2(list4);

        /*
            ������֮��ļ̳й�ϵ
            Integer extends Number extends Object
            String extends Object
         */

    }
    // ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵�����
    public static void getElement1(Collection<? extends Number> coll){

    }
    // ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵ĸ���
    public static void getElement2(Collection<? super Number> coll){

    }
}
