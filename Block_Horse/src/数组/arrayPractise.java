package 数组;

/**
 * @author : Bojack
 * @date : 2021年9月24日17:57:43
 */
public class arrayPractise {
    public static void main(String[] args) {
        arrayPrintln();
        System.out.println("==============");
        arrayMost();
        System.out.println("==============");
        Revrse();

    }

    /**
     * 遍历数组
     */
    public static void arrayPrintln() {
//        int arrayA[]=new int[]{34,5,5,5663,252,1,4134,134};
        int[] arrayA = {14342342, 3243, 4313213, 1313, 13, 12, 3123, 123, 12, 321,};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }

    /**
     * 数组最值打印
     */
    public static void arrayMost() {
        int[] arrayB = {1123113, 1, 1, 1, 1, 13, 1, 14, 142, 5451, 1, 1, 9912423, 1, 1, 1};
        //int[] arrayB = {12, 3434, 65466, 54757, 23, 34, 584, 66457, 7, 4, 754, 74643242};
        int max = arrayB[0], min = arrayB[0];
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] > max) {
                max = arrayB[i];
            } else if (arrayB[i] < min) {
                min = arrayB[i];
            }
        }
        if (max == min) {
            System.out.println("数组内数值大小相等");
        } else {
            System.out.println("最大值" + max + "最小值" + min);
        }
    }

    /**
     * 数组反转
     */
    public static void Revrse() {
        int[] arrayC = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
//        for (int i = arrayC.length-1; i < arrayC.length&&i>=0; i--) {
//            System.out.print(arrayC[i]);
        int temp = 0;
        for (int min = 0, max = arrayC.length - 1; min <= max; min++, max--) {
            temp = arrayC[min];
            arrayC[min] = arrayC[max];
            arrayC[max] = temp;
        }
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i]);
        }
    }
}
