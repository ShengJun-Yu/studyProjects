package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021��10��9��20:33:50
 * <p>
 * �������������������װ���̳С���̬��
 * <p>
 * ��װ����Java���е����֣�
 * 1. ��������һ�ַ�װ
 * 2. �ؼ���privateҲ��һ�ַ�װ
 * <p>
 * ��װ���ǽ�һЩϸ����Ϣ����������������粻�ɼ���
 */
public class Method {

    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100};
        int max = getMax(array);
        System.out.println("���ֵ��" + max);
    }

    // ����һ�����飬�һ�����һ�����ֵ
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
