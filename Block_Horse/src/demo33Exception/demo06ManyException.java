package demo33Exception;

/**
 * @author : Bojack
 * @date : Created in 20:30 2021.12.08
 * ����쳣ʹ�ò����ָ���δ����أ�
 * 1. ����쳣�ֱ���
 * 2. ����쳣һ�β��񣬶�δ���
 * 3. ����쳣һ�β���һ�δ���
 */
public class demo06ManyException {
    public static void main(String[] args) {
        System.out.println("����쳣�ֱ���");
        many();
        System.out.println("����쳣һ�β��񣬶�δ���");
        manyOneMang();
        System.out.println("����쳣һ�β���һ�δ���");
        manyOneOne();
    }
    //����ʱ�쳣���׳����Բ�������������Ҳ�������׳���
    //Ĭ�ϸ����������,��ֹ����,ʲôʱ���׳�����ʱ�쳣��,��������ִ�г���
    public static void manyOneOne() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
            int[] list = new int[19998 * 9999 * 99999];
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("�����������");
    }

    public static void many() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            int[] list = new int[19998 * 9999 * 99999];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        System.out.println("�����������");
    }
   /* һ��try���catchע������:
    catch��߶�����쳣����,������Ӹ����ϵ,��ô������쳣��������д���ϱ�,����ͻᱨ��
    ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
    */
    public static void manyOneMang() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
            int[] list = new int[19998 * 9999 * 99999];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        System.out.println("�����������");
    }
}