package ����;

/**
 * @author : Bojack
 * @date : 2021��9��24��17:47:55
 * ��λ�ȡ����ĳ��ȣ���ʽ��
 * ��������.length
 * �⽫��õ�һ��int���֣���������ĳ��ȡ�
 * <p>
 * ����һ�����������������ڼ䣬���Ȳ��ɸı䡣
 */
public class arrayLenght {
    public static void main(String[] args) {
        int arrayA[] = new int[3];
        int arrayB[] = {2, 3, 4, 5};
        int la = arrayB.length;
        System.out.println(la);

        int arrayC[] = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);

    }
}
