package demo09Interface.demo02;

/**
 * @author : Bojack
 * @date : Created in 21:14 2021.11.09
 * ��Java 8��ʼ���ӿ���������Ĭ�Ϸ�����
 * ��ʽ��
 * public default ����ֵ���� ��������(�����б�) {
 * ������
 * }
 * <p>
 * ��ע���ӿڵ��е�Ĭ�Ϸ��������Խ���ӿ����������⡣
 */
public interface MyInterfaceDefault {
    public abstract void methodsAbs();

    //    public abstract void methodsAbs1();
    public default void methodDefault() {
        System.out.println("�ӿڵ��е�Ĭ�Ϸ���");
    }


}
