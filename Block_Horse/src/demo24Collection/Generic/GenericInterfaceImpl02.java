package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:39 2021.11.30
 *     ���з��͵Ľӿڵڶ���ʹ�÷�ʽ:�ӿ�ʹ��ʲô����,ʵ�����ʹ��ʲô����,����Žӿ���
 *     ���൱�ڶ�����һ�����з��͵���,���������ʱ��ȷ�����͵�����
 *     public interface List<E>{
 *         boolean add(E e);
 *         E get(int index);
 *     }
 *     public class ArrayList<E> implements List<E>{
 *         public boolean add(E e) {}
 *         public E get(int index) {}
 *     }
 */
public class GenericInterfaceImpl02<E> implements GenericInterface<E>{
    @Override
    public void method(Object o) {
        System.out.println(o);
    }
}
