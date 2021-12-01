package demo26Set.HashCode01;


/**
 * @author : Bojack
 * @date : Created in 19:19 2021.12.01
 * 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
 * 在Object类有一个方法,可以获取对象的哈希值
 * int hashCode() 返回该对象的哈希码值。
 * hashCode方法的源码:
 * public native int hashCode();
 * native:代表该方法调用的是本地操作系统的方法;
 */
public class HashCodeMain {
    public static void main(String[] args) {
        //HashCode方法已经重写
        Person a = new Person();
        int i = a.hashCode();
        System.out.println(i);

        Person b = new Person();
        int j = b.hashCode();
        System.out.println(j);

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
       /*
            String类的哈希值
                String类重写Obejct类的hashCode方法
        */
        String str = new String("abc");
        String str1 = new String("abc");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        String str2 = new String("重地");
        String str3 = new String("通话");
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());


    }
}
