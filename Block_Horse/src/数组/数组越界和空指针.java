package ����;

/**
 * @author : Bojack
 * @date : 2021��9��24��17:30:45
 * <p>
 * �����������Ŵ�0��ʼ��һֱ��������ĳ���-1��Ϊֹ��
 * �����������Ԫ�ص�ʱ��������Ų������ڣ���ô���ᷢ��
 * ��������Խ���쳣
 * ArrayIndexOutOfBoundsException
 * ԭ���������д���ˡ�
 * ������޸ĳ�Ϊ���ڵ���ȷ������š�
 */
class ����Խ��Ϳ�ָ�� {
    public static void main(String[] args) {
        outofBound();
        arrayNull();

    }

    public static void outofBound() {
        int[] array = {15, 25, 35};

        System.out.println(array[0]); //15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35

        // ����д��
        // ��������3��Ԫ�أ����Է����쳣
        System.out.println(array[2]);
    }

    /**
     * ���е��������ͱ����������Ը�ֵΪһ��nullֵ�����Ǵ�������ʲô��û�С�
     * ����������new��ʼ������ʹ�����е�Ԫ�ء�
     * ���ֻ�Ǹ�ֵ��һ��null��û�н���new������
     * ��ô���ᷢ����
     * ��ָ���쳣 NullPointerException
     * ԭ������new
     * ���������new
     */
    public static void arrayNull() {
        int array[];
             array=new int [3];
        System.out.println(array[0]);
    }

}