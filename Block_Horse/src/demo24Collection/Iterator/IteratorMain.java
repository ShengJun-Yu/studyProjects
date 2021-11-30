package demo24Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 19:37 2021.11.30
 *     java.util.Iterator�ӿ�:������(�Լ��Ͻ��б���)
 *     ���������õķ���
 *         boolean hasNext() �������Ԫ�ؿ��Ե������򷵻� true��
 *             �жϼ����л���û����һ��Ԫ��,�оͷ���true,û�оͷ���false
 *         E next() ���ص�������һ��Ԫ�ء�
 *             ȡ�������е���һ��Ԫ��
 *     Iterator������,��һ���ӿ�,�����޷�ֱ��ʹ��,��Ҫʹ��Iterator�ӿڵ�ʵ�������,��ȡʵ����ķ�ʽ�Ƚ�����
 *     Collection�ӿ�����һ������,��iterator(),����������صľ��ǵ�������ʵ�������
 *         Iterator<E> iterator() �����ڴ� collection ��Ԫ���Ͻ��е����ĵ�������
 *
 *     ��������ʹ�ò���(�ص�):
 *         1.ʹ�ü����еķ���iterator()��ȡ��������ʵ�������,ʹ��Iterator�ӿڽ���(��̬)
 *         2.ʹ��Iterator�ӿ��еķ���hasNext�жϻ���û����һ��Ԫ��
 *         3.ʹ��Iterator�ӿ��еķ���nextȡ�������е���һ��Ԫ��
 */
public class IteratorMain {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("Bojack");
        col.add("Cete");
        col.add("Roilly");
        col.add("Roilly");
        col.add("End");
// ��̬��      �ӿ�                ʵ����
        Iterator<String> it = col.iterator();
        while(it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }
        System.out.println("==========================");
        for (Iterator<String> s= col.iterator();s.hasNext();){
            String ne = s.next();
            System.out.println(ne);
        }


    }
}
