package demo26Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author : Bojack
 * @date : Created in 21:10 2021.12.01
 *     java.util.LinkedHashSet���� extends HashSet����
 *     LinkedHashSet�����ص�:
 *         �ײ���һ����ϣ��(����+����/�����)+����:����һ������(��¼Ԫ�صĴ洢˳��),��֤Ԫ������
 */
public class LinkedHashSetMain {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Bojack");
        set.add("Jack");
        set.add("Cete");
        set.add("Zoom");
        set.add("Zoom");
        System.out.println(set);

        //Ԫ�ؼ�¼�˴���˳��
        LinkedHashSet linkesSet = new LinkedHashSet();
        linkesSet.add("Bojack");
        linkesSet.add("Jack");
        linkesSet.add("Cete");
        linkesSet.add("Zoom");
        linkesSet.add("Zoom");
        System.out.println(linkesSet);
    }
}
