package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 20:59 2021.11.30
 *     ����һ�����з���<E>����,ģ��ArrayList����
 *     ������һ��δ֪����������,�����ǲ�ȷ��ʲôʲô�������͵�ʱ��,����ʹ�÷���
 *     ���Ϳ��Խ����������������,����ʹ��Integer,String,Student...
 *     ���������ʱ��ȷ�����͵���������
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
