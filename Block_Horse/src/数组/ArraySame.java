package ����;

/**
 * @author : Bojack
 * @date : 2021��9��23��19:37:00
 */
public class ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA); // ��ֵַ
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("==============");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // ��ֵַ
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20
        System.out.println("==============");
//��arrayA�ڵĵ�ֵַ��ֵ��ArrayB����
        int[] arrayB = arrayA;
        System.out.println(arrayB); // ��ֵַ
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 0
        System.out.println(arrayB[2]); // 0
        System.out.println("==============");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // ��ֵַ
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
    }

}

