package ����;

/**
 * @author : Bojack
 * @date : 2021��9��23��19:41:39
 */
public class ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3]; // ��̬��ʼ��
        System.out.println(array); // ��ֵַ
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("==============");

        // �ı����鵱��Ԫ�ص�����
        array[1] = 10;
        array[2] = 20;
        System.out.println(array); // ��ֵַ
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 10
        System.out.println(array[2]); // 20
    }

}
