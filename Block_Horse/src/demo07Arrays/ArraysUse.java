package demo07Arrays;
import java.util.Arrays;
/**
 * @author : Bojack
 * @date : 2021��10��25��19:38:12
 * java.util.Arrays��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ�����
 *
 * public static String toString(����)���������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1, Ԫ��2, Ԫ��3...]��
 * public static void sort(����)������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������
 *
 * ��ע��
 * 1. �������ֵ��sortĬ�ϰ��������С����
 * 2. ������ַ�����sortĬ�ϰ�����ĸ����
 * 3. ������Զ�������ͣ���ô����Զ��������Ҫ��Comparable����Comparator�ӿڵ�֧�֡������ѧϰ��
 */
public class ArraysUse {
    public static void main(String[] args) {
        int[] array1={23,56,34,321,12,112};
        String str=Arrays.toString(array1);
        System.out.println(str);
        // public static void sort(����)������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] str1={"zaaaqqq","acwrew","abfsesf"};
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));

    }
}
