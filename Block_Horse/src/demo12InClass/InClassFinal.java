package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 19:10 2021.11.17
 * �ֲ��ڲ��࣬���ϣ���������ڷ����ľֲ���������ô����ֲ����������ǡ���Чfinal�ġ���
 * <p>
 * ��ע����Java 8+��ʼ��ֻҪ�ֲ�������ʵ���䣬��ôfinal�ؼ��ֿ���ʡ�ԡ�
 * <p>
 * ԭ��
 * 1. new�����Ķ����ڶ��ڴ浱�С�
 * 2. �ֲ������Ǹ��ŷ����ߵģ���ջ�ڴ浱�С�
 * 3. �������н���֮�����̳�ջ���ֲ������ͻ�������ʧ��
 * 4. ����new�����Ķ�����ڶѵ��г������ڣ�ֱ������������ʧ��
 */
public class InClassFinal {

    public void Method() {
        int num = 100;
//        nun=10;
        class MethodClass {
            public void Methods() {
                System.out.println(num);
            }
        }
    }
}
