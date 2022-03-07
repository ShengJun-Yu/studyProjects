package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:48 2022.03.07
 * Stream���еĳ��÷���_filter:���ڶ�Stream���е����ݽ��й���
 * Stream<T> filter(Predicate<? super T> predicate);
 * filter�����Ĳ���Predicate��һ������ʽ�ӿ�,���Կ��Դ���Lambda���ʽ,�����ݽ��й���
 * Predicate�еĳ��󷽷�:
 * boolean test(T t);
 */
public class filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����", "����", "����", "����", "����");
        stream.filter((name) -> name.startsWith("��")).forEach((name) -> System.out.println(name));
      /*
            Stream�����ڹܵ���,ֻ�ܱ�����(ʹ��)һ��
            ��һ��Stream��������Ϸ���,���ݾͻ���ת����һ��Stream��
            ����ʱ��һ��Stream���Ѿ�ʹ�����,�ͻ�ر���
            ���Ե�һ��Stream���Ͳ����ٵ��÷�����
            IllegalStateException: stream has already been operated upon or closed
         */


    }
}
