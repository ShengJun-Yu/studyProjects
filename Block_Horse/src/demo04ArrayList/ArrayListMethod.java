package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021年10月13日20:19:54
 * ArrayList当中的常用方法有：
 * public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
 * 但是对于其他集合（今后学习）来说，add添加动作不一定成功。
 * public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
 * public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
 * public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList();
        boolean lose = all.add("Stephen");

        //public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
        System.out.println("添加是否成功" + lose + all);
        all.add("Bojack");
        all.add("Jack");
        all.add("Cete");
        all.add("Nana");
        System.out.println("数组列表为：" + all);

        //public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
        String name = all.get(2);
        System.out.println("二号元素为：" + name);

        //public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
        String removewho = all.remove(2);
        System.out.println("被删除的人为：" + removewho);
        System.out.println("删除二号位置后的数组列表为：" + all);

        //public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
        int num = all.size();
        System.out.println("数组列表长度为" + num);


    }
}
