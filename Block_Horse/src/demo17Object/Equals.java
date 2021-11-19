package demo17Object;

/**
 * @author : Bojack
 * @date : Created in 20:22 2021.11.19
 * Person��Ĭ�ϼ̳���Object��,���Կ���ʹ��Object���equals����
 * boolean equals(Object obj) ָʾ����ĳ�������Ƿ���˶�����ȡ���
 * equals����Դ��:
 * public boolean equals(Object obj) {
 * return (this == obj);
 * }
 * ����:
 * Object obj:���Դ�������Ķ���
 * == �Ƚ������,���ص���һ������ֵ true false
 * ������������:�Ƚϵ���ֵ
 * ������������:�ȼ۵�����������ĵ�ֵַ
 * this��˭?�Ǹ�������õķ���,�����е�this�����Ǹ�����;person1���õ�equals��������this����person1
 * obj��˭?���ݹ����Ĳ���person2
 * this==obj -->person1==person2
 */
public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("Bojack", 19);
        Person person2 = new Person("Bojack", 19);
        boolean y = person1.equals(person2);
        System.out.println(y);
    }
}
