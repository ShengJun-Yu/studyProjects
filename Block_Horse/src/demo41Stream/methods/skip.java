package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:05 2022.03.07
 *  Stream���еĳ��÷���_skip:��������Ԫ��
 *     ���ϣ������ǰ����Ԫ�أ�����ʹ��skip������ȡһ����ȡ֮���������
 *     Stream<T> skip(long n);
 *         ������ĵ�ǰ���ȴ���n��������ǰn�������򽫻�õ�һ������Ϊ0�Ŀ�����
 */
public class skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����", "����", "����", "����", "����");
        Stream<String> skip = stream.skip(2);
        skip.forEach((i)-> System.out.println(i));

    }
}
