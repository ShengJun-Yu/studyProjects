package ����;

/**
 * @author : Bojack
 * @date : 2021��9��23��18:27:13
 * ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ��
 * �����ƣ�01
 * ʮ���ƣ�0123456789
 * 16���ƣ�0123456789abcdef
 *
 * ��������Ԫ�صĸ�ʽ����������[����ֵ]
 * ����ֵ������һ��int���֣��������鵱��Ԫ�صı�š�
 * ��ע�⡿����ֵ��0��ʼ��һֱ��������ĳ���-1��Ϊֹ��
 */
public class arrayUse {
    public static void main(String[] args) {
        int[] array = {3, 41, 522};
        System.out.println(array);//�ڴ��ַ��ϣֵ��
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        int num =array[2];
        System.out.println(num);
        for (int i = 0; i <= 2; i++) {
            System.out.println("����Ϊ��"+array[i]);
        }
        ��̬����();
    }

    /**
     * ʹ�ö�̬��ʼ�������ʱ�����е�Ԫ�ؽ����Զ�ӵ��һ��Ĭ��ֵ���������£�
     * ������������ͣ���ôĬ��Ϊ0��
     * ����Ǹ������ͣ���ôĬ��Ϊ0.0��
     * ������ַ����ͣ���ôĬ��Ϊ'\u0000'��
     * ����ǲ������ͣ���ôĬ��Ϊfalse��
     * ������������ͣ���ôĬ��Ϊnull��
     *
     * ע�����
     * ��̬��ʼ����ʵҲ��Ĭ��ֵ�Ĺ��̣�ֻ����ϵͳ�Զ����Ͻ�Ĭ��ֵ�滻��Ϊ�˴����ŵ��еľ�����ֵ��
     */

    public static void ��̬����(){
        int [] array=new int[4];
        array[1]=888;//��ֵ 
        System.out.println(array);//�ڴ��ַ��ϣֵ��
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
    }
}
