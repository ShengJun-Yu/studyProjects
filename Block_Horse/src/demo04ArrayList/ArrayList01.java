package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��19:42:46
 * ����ĳ��Ȳ����Է����ı䡣
 * ����ArrayList���ϵĳ����ǿ�������仯�ġ�
 *
 * ����ArrayList��˵����һ��������<E>�����͡�
 * ���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ��ʲô���͡�
 * ע�⣺����ֻ�����������ͣ������ǻ������͡�
 *
 * ע�����
 * ����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
 * ��������ǿգ��õ����ǿյ������ţ�[]
 */
public class ArrayList01 {
    public static void main(String[] args) {
        // ������һ��ArrayList���ϣ����ϵ�������list������װ��ȫ����String�ַ������͵�����
        // ��ע����JDK 1.7+��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд�ġ�
        ArrayList<String> al = new ArrayList<>();
        // �򼯺ϵ������һЩ���ݣ���Ҫ�õ�add������
        al.add("Stephen");
        al.add("Bojack");
        al.add("Cete");
        al.add("Jack");
        al.add("Jnana");
        //list.add(100); // ����д������Ϊ������ʱ������ŷ����Ѿ�˵�����ַ�������ӽ�ȥ��Ԫ�ؾͱ��붼���ַ�������

        System.out.println(al);
    }
}
