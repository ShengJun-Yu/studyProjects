package demo09Interface.demo05;

/**
 * @author : Bojack
 * @date : Created in 22:07 2021.11.09
 * 2. ��̬˽�з�������������̬����֮���ظ���������
 * ��ʽ��
 * private static ����ֵ���� ��������(�����б�) {
 * ������
 * }
 */
public interface MyInterfacePrivateStatic {
    public static void methodA() {
        System.out.println("��̬����A");
        methodComment();
    }

    public static void methodB() {
        System.out.println("��̬����B");
        methodComment();
    }

    private static void methodComment() {
        System.out.println("AAAA");
        System.out.println("BBBB");
    }
}
