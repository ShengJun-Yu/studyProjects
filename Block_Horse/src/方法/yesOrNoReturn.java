package ����;

/**
 * @author : Bojack
 * @date :2021��9��22��20:10:08
 *
 * ��ĿҪ�󣺶���һ���������������������������֮�͡���������㣬����֮��ѽ�������ҡ���
 * ��Ŀ���Σ�����һ����������������ӡ����������֮�͡����������㣬����֮�����Լ�������ʾ��������ø����ҡ���
 *
 * ע�����
 * �����з���ֵ�ķ���������ʹ�õ������á���ӡ���û��߸�ֵ���á�
 * ���Ƕ����޷���ֵ�ķ�����ֻ��ʹ�õ������ã�����ʹ�ô�ӡ���û��߸�ֵ���á�
 */
public class yesOrNoReturn {
    public static void main(String[] args) {
        // ����main���������������㡣
        // �ҵ����㣬�������Ҽ���һ�£�������֮�󣬰ѽ�������ҵ�num����
        sum(33, 44);
        int num = sum(33, 44);
        System.out.println(num);
        System.out.println("==============");
        printSum(100, 200);
        System.out.println("==============");

        System.out.println(sum(2, 3)); // ��ȷд��
        sum(3, 5); // ��ȷд�������Ƿ���ֵû���õ�
        System.out.println("==============");

        // ����voidû�з���ֵ�ķ�����ֻ�ܵ��������ܴ�ӡ���߸�ֵ
//        System.out.println(printSum(2, 3)); // ����д����
//        System.out.println(void);

//        int num2 = printSum(10, 20); // ����д����
//        int num3 = void;
//        void num4 = void;
    }

    // ����һ���������Ҹ�������������ӡ�
    // ���з���ֵint��˭�����ң��ҾͰѼ���������˭
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // ����һ���������Ҹ�������������ӡ�
    // ��û�з���ֵ������ѽ�������κ��ˣ��������Լ����д�ӡ�����
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("����ǣ�" + result);
    }

}
