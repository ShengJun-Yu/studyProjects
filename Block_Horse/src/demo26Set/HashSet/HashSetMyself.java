package demo26Set.HashSet;

import java.util.HashSet;

/**
 * @author : Bojack
 * @date : Created in 20:57 2021.12.01
 *     HashSet�洢�Զ�������Ԫ��
 *
 *     set���ϱ�֤Ԫ��Ψһ:
 *         �洢��Ԫ��(String,Integer,...Student,Person...),������дhashCode������equals����
 *
 *     Ҫ��:
 *         ͬ��ͬ�������,��Ϊͬһ����,ֻ�ܴ洢һ��
 */
public class HashSetMyself {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p = new Person("Bojack",18);
        Person p1 = new Person("Bojack",18);
        Person p2 = new Person("Jack",19);
        set.add(p);
        set.add(p1);
        set.add(p2);
        System.out.println(set);
    }
}
