package ����;

/**
 * @author : Bojack
 * @date : 2021��9��22��21:23:47
 */
public class ����������ϰ {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(same(a, b));
//        System.out.println(same(22,44));
        System.out.println(same(22.4, 44.5));
        System.out.println(same(10L, 10L));
        System.out.println(same((short) 20, (short) 20));

    }

    public static boolean same(int a, int b) {
        System.out.println("����int�����ķ���ִ�У�");
//        return a == b;
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }


    public static boolean same(double a, double b) {
        System.out.println("����double�����ķ���ִ�У�");
//        return a == b;
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean same(long a, long b) {
        System.out.println("����long�����ķ���ִ�У�");
        return a == b;
    }

    public static boolean same(byte a, byte b) {
        System.out.println("����byte�����ķ���ִ�У�");
//        return a == b;
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
