package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:02 2022.03.07
 * \Stream���еĳ��÷���_limit:���ڽ�ȡ���е�Ԫ��
 *     limit�������Զ������н�ȡ��ֻȡ��ǰn��������ǩ����
 *     Stream<T> limit(long maxSize);
 *         ������һ��long�ͣ�������ϵ�ǰ���ȴ��ڲ�������н�ȡ�����򲻽��в���
 *     limit������һ���ӳٷ���,ֻ�Ƕ����е�Ԫ�ؽ��н�ȡ,���ص���һ���µ���,���Կ��Լ�������Stream���е���������
 */
public class limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����", "����", "����", "����", "����");
        Stream<String> limit = stream.limit(3);
        limit.forEach((i)-> System.out.println(i));
    }
}
