package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:07 2022.03.07
 *  Stream���еĳ��÷���_concat:���ڰ�����ϵ�һ��
 *     �������������ϣ���ϲ���Ϊһ��������ô����ʹ��Stream�ӿڵľ�̬����concat
 *     static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����", "����", "����", "����", "����");
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<String> concat = Stream.concat(stringStream, stream);
        concat.forEach((i)-> System.out.println(i));
    }
}
