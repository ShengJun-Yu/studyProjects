package demo08Math;

/**
 * @author : Bojack
 * @date : 2021��10��25��20:42:22
 * java.util.Math������ѧ��صĹ����࣬�����ṩ�˴����ľ�̬�������������ѧ������صĲ�����
 *
 * public static double abs(double num)����ȡ����ֵ���ж������ء�
 * public static double ceil(double num)������ȡ����
 * public static double floor(double num)������ȡ����
 * public static long round(double num)���������롣
 *
 * Math.PI������Ƶ�Բ���ʳ�����double����
 */
public class math01 {
    public static void main(String[] args) {
        //public static double abs(double num)����ȡ����ֵ���ж������ء�
        System.out.println(Math.abs(-1232));
        //public static double ceil(double num)������ȡ����
        System.out.println(Math.ceil(45.32));
        //public static double floor(double num)������ȡ��
        System.out.println(Math.floor(45.32));
        // public static long round(double num)���������롣
        System.out.println(Math.round(45.32));
        System.out.println(Math.round(45.52));

        //Math.PI������Ƶ�Բ���ʳ�����double����
        System.out.println(Math.PI);


    }
}
