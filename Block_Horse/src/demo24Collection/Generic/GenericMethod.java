package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:12 2021.11.30
 *      ���庬�з��͵ķ���:���Ͷ����ڷ��������η��ͷ���ֵ����֮��
 *
 *     ��ʽ:
 *         ���η� <����> ����ֵ���� ������(�����б�(ʹ�÷���)){
 *             ������;
 *         }
 *
 *     ���з��͵ķ���,�ڵ��÷�����ʱ��ȷ�����͵���������
 *     ����ʲô���͵Ĳ���,���;���ʲô����
 */
public class GenericMethod {
    public <E> void method01(E e){
        System.out.println(e);
    }

    public static  <E> void method02(E e){
        System.out.println(e);
    }
}
