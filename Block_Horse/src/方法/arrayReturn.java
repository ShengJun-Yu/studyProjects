package ����;

/**
 * @author : Bojack
 * @date : 2021��9��24��19:57:47
 * һ������������0��1���������������ֻ����0����1������ֵ�������ж������ֵ��
 * ���ϣ��һ���������в����˶��������ݽ��з��أ���ô�죿
 * ���������ʹ��һ��������Ϊ����ֵ���ͼ��ɡ�
 * <p>
 * �κ��������Ͷ�����Ϊ�����Ĳ������ͣ����߷���ֵ���͡�
 * <p>
 * ������Ϊ�����Ĳ��������ݽ�ȥ����ʵ������ĵ�ֵַ��
 * ������Ϊ�����ķ���ֵ�����ص���ʵҲ������ĵ�ֵַ��
 */
public class arrayReturn {
    public static void main(String[] args) {
        int a[] = jishuan(3, 88, 8);
        System.out.println("main�������ܵ��ķ���ֵΪ��" + a);
        System.out.println("sum=" + a[0]);
        System.out.println("avg=" + a[1]);


    }

    public static int[] jishuan(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        System.out.println("jishuan�����ڲ�������" + array);
        return array;

    }

}
