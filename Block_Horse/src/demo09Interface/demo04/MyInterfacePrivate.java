package demo09Interface.demo04;

/**
 * @author : Bojack
 * @date : Created in 21:54 2021.11.09
 * ����������
 * ������Ҫ��ȡһ�����з����������������Ĭ�Ϸ���֮���ظ���������⡣
 * ����������з�����Ӧ����ʵ����ʹ�ã�Ӧ����˽�л��ġ�
 * <p>
 * ���������
 * ��Java 9��ʼ���ӿڵ���������˽�з�����
 * 1. ��ͨ˽�з�����������Ĭ�Ϸ���֮���ظ���������
 * ��ʽ��
 * private ����ֵ���� ��������(�����б�) {
 * ������
 * }
 */
public interface MyInterfacePrivate {
    public default void methodA() {
        System.out.println("����A");
        methodComment();
    }

    public default void methodB() {
        System.out.println("����B");
        methodComment();
    }

    private void methodComment() {
        System.out.println("AAAA");
        System.out.println("BBBB");
    }

}
