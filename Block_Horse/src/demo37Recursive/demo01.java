package demo37Recursive;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.27
 * �ݹ�:�����Լ������Լ�
 * - �ݹ�ķ���:
 * - �ݹ��Ϊ���֣�ֱ�ӵݹ�ͼ�ӵݹ顣
 * - ֱ�ӵݹ��Ϊ������������Լ���
 * - ��ӵݹ����A��������B������B��������C������C��������A������
 * - ע�����
 * - �ݹ�һ��Ҫ�������޶�����֤�ݹ��ܹ�ֹͣ����������ᷢ��ջ�ڴ������
 * - �ڵݹ�����Ȼ���޶����������ǵݹ��������̫�ࡣ����Ҳ�ᷢ��ջ�ڴ������
 * - ���췽��,��ֹ�ݹ�
 * �ݹ��ʹ��ǰ��:
 * �����÷�����ʱ��,���������岻��,ÿ�ε��÷����Ĳ�����ͬ,����ʹ�õݹ�
 */
public class demo01 {
    public static void main(String[] args) {
//        a();//StackOverflowError
        int b = b(5);
        System.out.println(b);
    }

    private static int b(int max) {
        if (max==1){
            return 1;
        }
        return max + b(max - 1);
    }

    private static void a() {
        System.out.println("a����");//StackOverflowError
        a();
    }
}
