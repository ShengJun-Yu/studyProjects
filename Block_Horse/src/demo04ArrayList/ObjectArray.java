package demo04ArrayList;

/**
 * @author : Bojack
 * @date : 2021年10月13日19:00:13
 * 题目：
 * 定义一个数组，用来存储3个Person对象。
 * <p>
 * 数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
 */
public class ObjectArray {
    public static void main(String[] args) {
        //创建一个Person类有3元素的数组
        Person[] array = new Person[3];

        //将要输入的参数传给Person方法
        Person zero = new Person("Stephen", 18);
        Person one = new Person("Bojack", 28);
        Person two = new Person("Cete", 38);

        //将执行完的方法结果的地址值储存到数组之中
        array[0] = zero;
        array[1] = one;
        array[2] = two;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

        System.out.println("我叫" + array[0].getName() + "我的年龄是" + array[0].getAge());
        System.out.println("我叫" + array[1].getName() + "我的年龄是" + array[1].getAge());
        System.out.println("我叫" + array[2].getName() + "我的年龄是" + array[2].getAge());
    }

}
