package ����;

/**
 * @author : Bojack
 * @date : 2021��9��24��19:38:50
 * ���������Ϊ�����Ĳ�����
 * �����÷�����ʱ���򷽷���С���Ž��д��Σ����ݽ�ȥ����ʵ������ĵ�ֵַ��
 */
public class arrayParam {

    public static void main(String[] args) {
        int[] arrayC = {10, 20, 30, 40, 50};
        System.out.println(arrayC); // ��ֵַ

        printArray(arrayC); // ���ݽ�ȥ�ľ���array���б���ĵ�ֵַ
        System.out.println("==========AAA==========");
        printArray(arrayC);
        System.out.println("==========BBB==========");
        printArray(arrayC);
    }

    /**
     * ��Ҫ��
     * ����ֵ���ͣ�ֻ�ǽ��д�ӡ���ѣ�����Ҫ���м��㣬Ҳû�н������void
     * �������ƣ�printArray
     * �����б�����������飬�Ҳ��ܴ�ӡ���е�Ԫ�ء�int[] array
     */
    public static void printArray(int[] X) {
        System.out.println("printArray�����յ��Ĳ����ǣ�");
        System.out.println(X); // ��ֵַ
        for (int i = 0; i < X.length; i++) {
            System.out.println(X[i]);
        }
    }

}