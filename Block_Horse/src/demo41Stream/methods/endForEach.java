package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:46 2022.03.07
 *  Stream���еĳ��÷���_forEach
 *     void forEach(Consumer<? super T> action);
 *     �÷�������һ��Consumer�ӿں������Ὣÿһ����Ԫ�ؽ����ú������д���
 *     Consumer�ӿ���һ�������͵ĺ���ʽ�ӿ�,���Դ���Lambda���ʽ,��������
 *
 *     �򵥼�:
 *         forEach����,�����������е�����
 *         ��һ���ս᷽��,����֮��Ͳ��ܼ�������Stream���е���������
 */
public class endForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����", "����", "����", "����", "����");
        //ʹ��Stream���еķ���forEach��Stream���е����ݽ��б���
        stream.forEach((name)-> System.out.println(name));
    }
}
