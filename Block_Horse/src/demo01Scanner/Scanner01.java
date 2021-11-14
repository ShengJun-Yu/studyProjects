package demo01Scanner;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月11日20:48:59
 * Scanner类的功能：可以实现键盘输入数据，到程序当中。
 * <p>
 * 引用类型的一般使用步骤：
 * <p>
 * 1. 导包
 * import 包路径.类名称;
 * 如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
 * 只有java.lang包下的内容不需要导包，其他的包都需要import语句。
 * <p>
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 * <p>
 * 3. 使用
 * 对象名.成员方法名()
 * <p>
 * 获取键盘输入的一个int数字：int num = sc.nextInt();
 * 获取键盘输入的一个字符串：String str = sc.next();
 */
public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入数字
        String name = sc.next();
        System.out.println("输入为：" + name);
//        输入字符串
        int num = sc.nextInt();
        System.out.println("输入为：" + num);

    }
}
