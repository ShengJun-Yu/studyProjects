package demo41Stream;


import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:10 2022.03.07
 * ��ϰ:����Ԫ�ش�����ͳ��ʽ��
 * ����������ArrayList���ϴ洢���鵱�еĶ����Ա������Ҫ��ʹ�ô�ͳ��forѭ��������ǿforѭ�������ν����������ɲ������裺
 * 1. ��һ������ֻҪ����Ϊ3���ֵĳ�Ա�������洢��һ���¼����С�
 * 2. ��һ������ɸѡ֮��ֻҪǰ3���ˣ��洢��һ���¼����С�
 * 3. �ڶ�������ֻҪ���ŵĳ�Ա�������洢��һ���¼����С�
 * 4. �ڶ�������ɸѡ֮��Ҫǰ2���ˣ��洢��һ���¼����С�
 * 5. ����������ϲ�Ϊһ�����飻�洢��һ���¼����С�
 * 6. ������������Person���󣻴洢��һ���¼����С�
 * 7. ��ӡ���������Person������Ϣ��
 */
public class Practice01Stream {
    public static void main(String[] args) {
        //��һ֧����
        ArrayList<String> one = new ArrayList<>();
        one.add("�����Ȱ�");
        one.add("��Զ��");
        one.add("���Ǻ�");
        one.add("ʯ����");
        one.add("ʯ����");
        one.add("����");
        one.add("ׯ��");
        one.add("���߹�");
        //1. ��һ������ֻҪ����Ϊ3���ֵĳ�Ա�������洢��һ���¼����С�
        // 2. ��һ������ɸѡ֮��ֻҪǰ3���ˣ��洢��һ���¼����С�
        Stream<String> stream = one.stream();
        Stream<String> stream1 = stream.filter((name) -> name.length() == 3).limit(3)/*.forEach((o)-> System.out.println(o))*/;


        //�ڶ�֧����
        ArrayList<String> two = new ArrayList<>();
        two.add("��������");
        two.add("���޼�");
        two.add("����ӱ");
        two.add("������");
        two.add("�����˹����");
        two.add("���찮");
        two.add("�Ŷ���");
        //3. �ڶ�������ֻҪ���ŵĳ�Ա�������洢��һ���¼����С�
        // 4. �ڶ�������ɸѡ֮��Ҫǰ2���ˣ��洢��һ���¼����С�
        Stream<String> stream2 = two.stream();
        Stream<String> stream3 = stream2.filter((n) -> n.startsWith("��")).skip(2);
        //5. ����������ϲ�Ϊһ�����飻�洢��һ���¼����С�
        Stream<String> concat = Stream.concat(stream1, stream3);/*.forEach((o)-> System.out.println(o))*/
        //6. ������������Person���󣻴洢��һ���¼����С�
        Stream<Person> personStream = concat.map((name) -> new Person(name));
        //7. ��ӡ���������Person������Ϣ��
        personStream.forEach((o) -> System.out.println(o));
    }
}
