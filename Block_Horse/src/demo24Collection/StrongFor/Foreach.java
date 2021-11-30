package demo24Collection.StrongFor;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 19:58 2021.11.30
 * ��ǿforѭ��:�ײ�ʹ�õ�Ҳ�ǵ�����,ʹ��forѭ���ĸ�ʽ,���˵���������д
 * ��JDK1.5֮����ֵ�������
 * Collection<E>extends Iterable<E>:���еĵ��м��϶�����ʹ����ǿfor
 * public interface Iterable<T>ʵ������ӿ���������Ϊ "foreach" ����Ŀ�ꡣ
 * <p>
 * ��ǿforѭ��:�����������Ϻ�����
 * <p>
 * ��ʽ:
 * for(����/������������� ������: ������/������){
 * sout(������);
 * }
 */
public class Foreach {
    public static void main(String[] args) {
        demo01();
        System.out.println();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bojack");
        list.add("Cete");
        list.add("Roilly");
        list.add("Roilly");
        list.add("End");
        for (String s : list) {
            System.out.print(s + ".");
        }
    }

    private static void demo01() {
        int[] array = {123, 4535, 354, 67, 57, 65, 31, 32, 3, 13, 12, 3, 31, 3};
        for (int i : array) {
            System.out.print(i + ".");
        }
    }
}
