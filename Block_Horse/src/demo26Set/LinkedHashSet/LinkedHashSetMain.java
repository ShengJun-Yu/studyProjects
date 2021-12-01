package demo26Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author : Bojack
 * @date : Created in 21:10 2021.12.01
 *     java.util.LinkedHashSet集合 extends HashSet集合
 *     LinkedHashSet集合特点:
 *         底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
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

        //元素记录了储存顺序
        LinkedHashSet linkesSet = new LinkedHashSet();
        linkesSet.add("Bojack");
        linkesSet.add("Jack");
        linkesSet.add("Cete");
        linkesSet.add("Zoom");
        linkesSet.add("Zoom");
        System.out.println(linkesSet);
    }
}
