package demo33Exception;

/**
 * @author : Bojack
 * @date : Created in 18:53 2021.12.08
 * throw�ؼ���
 * ����:
 * ����ʹ��throw�ؼ�����ָ���ķ������׳�ָ�����쳣
 * ʹ�ø�ʽ:
 * throw new xxxException("�쳣������ԭ��");
 * ע��:
 * 1.throw�ؼ��ֱ���д�ڷ������ڲ�
 * 2.throw�ؼ��ֺ��new�Ķ��������Exception����Exception���������
 * 3.throw�ؼ����׳�ָ�����쳣����,���Ǿͱ��봦������쳣����
 * throw�ؼ��ֺ�ߴ�������RuntimeException������ RuntimeException���������,���ǿ��Բ�����,Ĭ�Ͻ���JVM����(��ӡ�쳣����,�жϳ���)
 * throw�ؼ��ֺ�ߴ������Ǳ����쳣(д�����ʱ�򱨴�),���Ǿͱ��봦������쳣,Ҫôthrows,Ҫôtry...catch
 */
public class demo01Throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = demo01(arr, 5);
        System.out.println(i);
    }
    /*
           ����һ������,��ȡ����ָ����������Ԫ��
           ����:
               int[] arr
               int index
           �Ժ�(������)�������ȱ���Է������ݹ����Ĳ������кϷ���У��
           ����������Ϸ�,��ô���Ǿͱ���ʹ���׳��쳣�ķ�ʽ,��֪�����ĵ�����,���ݵĲ���������
           ע��:
               NullPointerException��һ���������쳣,���ǲ��ô���,Ĭ�Ͻ���JVM����
               ArrayIndexOutOfBoundsException��һ���������쳣,���ǲ��ô���,Ĭ�Ͻ���JVM����
        */
    public static int demo01(int[] arr, int index) {
        //  ���ǿ��ԶԴ��ݹ����Ĳ�������,���кϷ���У��
        //  �������arr��ֵ��null
        //  ��ô���Ǿ��׳���ָ���쳣,��֪�����ĵ�����"���ݵ������ֵ��null"
        if (arr == null) {
            throw new NullPointerException("����Ϊ��");
        }
        // ���ǿ��ԶԴ��ݹ����Ĳ���index���кϷ���У��
        // ���index�ķ�Χ���������������Χ��
        // ��ô���Ǿ��׳���������Խ���쳣,��֪�����ĵ�����"���ݵ����������������ʹ�÷�Χ"
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("��������Խ��");
        }
        int num = arr[index];
        return num;
    }
}
