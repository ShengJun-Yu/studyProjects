package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.11.30
 *     ���з��͵Ľӿ�,��һ��ʹ�÷�ʽ:����ӿڵ�ʵ����,ʵ�ֽӿ�,ָ���ӿڵķ���
 *     public interface Iterator<E> {
 *         E next();
 *     }
 *     Scanner��ʵ����Iterator�ӿ�,��ָ���ӿڵķ���ΪString,������д��next��������Ĭ�Ͼ���String
 *     public final class Scanner implements Iterator<String>{
 *         public String next() {}
 *     }
 */
public class GenericInterfaceImpl01 implements GenericInterface<String>{
    @Override
    public void method(String o) {
        System.out.println(o);
    }
}
