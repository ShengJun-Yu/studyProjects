package demo41Stream;


import java.util.ArrayList;

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
public class Practice01 {
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
        ArrayList<String> one1 = new ArrayList<>();
        for (String name : one) {
            if(name.length()==3){
                one1.add(name);
            }
        }
        //2. ��һ������ɸѡ֮��ֻҪǰ3���ˣ��洢��һ���¼����С�
        ArrayList<String> one2 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            one2.add(one1.get(i));//i = 0,1,2
        }

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
        ArrayList<String> two1 = new ArrayList<>();
        for (String name : two) {
            if(name.startsWith("��")){
                two1.add(name);
            }
        }
        //4. �ڶ�������ɸѡ֮��Ҫǰ2���ˣ��洢��һ���¼����С�
        ArrayList<String> two2 = new ArrayList<>();
        for (int i = 2; i <two1.size() ; i++) {
            two2.add(two1.get(i)); //i ������0 1
        }

        //5. ����������ϲ�Ϊһ�����飻�洢��һ���¼����С�
        ArrayList<String> all = new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);

        //6. ������������Person���󣻴洢��һ���¼����С�
        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        //7. ��ӡ���������Person������Ϣ��
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
