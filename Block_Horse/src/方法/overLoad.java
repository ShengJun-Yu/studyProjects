package ����;

/**
 * @author : Bojack
 * @date : 2021��9��22��21:00:14
 * ���ڹ������Ƶķ�������Ϊ�����б�һ����ȴҪ��ס�ܶ಻ͬ���ֵķ������֣�
 * ���������
 * ���������أ�Overload���������������һ�������б�һ����
 * �ô���ֻ��Ҫ��סΨһһ���������ƣ��Ϳ���ʵ�����ƵĶ�����ܡ�
 *
 * ��������������������أ�
 * 1. ����������ͬ
 * 2. �������Ͳ�ͬ
 * 3. �����Ķ�����˳��ͬ
 *
 * �������������������޹أ����������أ�
 * 1. ������������޹�
 * 2. �뷽���ķ���ֵ�����޹�
 */
public class overLoad {
    public static void main(String[] args) {
//        System.out.println(sumTwo(10, 20)); // 30
//        System.out.println(sumThree(10, 20, 30)); // 60
//        System.out.println(sumFour(10, 20, 30, 40)); // 100
        System.out.println(sum(3,4));//���������ķ���
        System.out.println(sum(3,4,5));//���������ķ���
        System.out.println(sum(3,4,5,4));//�ĸ������ķ���

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static long sum(int a, int b, int c, long d) {
        return a + b + c + d;
    }


}
