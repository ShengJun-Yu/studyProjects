package demo21System;


import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author : Bojack
 * @date : Created in 21:38 2021.11.23
 * java.lang.System�����ṩ�˴����ľ�̬���������Ի�ȡ��ϵͳ��ص���Ϣ��ϵͳ����������System���API�ĵ��У����õķ����У�
 *     public static long currentTimeMillis()�������Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
 *     public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)��
 * ��������ָ�������ݿ�������һ�������С�
 */
public class System01 {
    public static void main(String[] args) {
        demoCurrentTimeMillis();
        demoarraycopy();
    }

    /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)��
        ��������ָ�������ݿ�������һ�������С�
        ����:
            src - Դ���顣
            srcPos - Դ�����е���ʼλ��(��ʼ����)��
            dest - Ŀ�����顣
            destPos - Ŀ�������е���ʼλ�á�
            length - Ҫ���Ƶ�����Ԫ�ص�������
        ��ϰ:
            ��src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
                ����Ԫ��ǰ��
                src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[6,7,8,9,10]
                ����Ԫ�غ�
                src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[1,2,3,9,10]
     */
    private static void demoarraycopy() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));

    }

    /*
            public static long currentTimeMillis()�������Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
            �������Գ����Ч��
            ��֤forѭ����ӡ����1-9999����Ҫʹ�õ�ʱ�䣨���룩
     */
    private static void demoCurrentTimeMillis() {
        long b = System.currentTimeMillis();
        SimpleDateFormat c = new SimpleDateFormat();
        String format = c.format(b);
        System.out.println(format);

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e);
        System.out.println("��ʱ" + (e - b));
    }
}
