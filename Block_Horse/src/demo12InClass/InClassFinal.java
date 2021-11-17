package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 19:10 2021.11.17
 * 局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。
 * <p>
 * 备注：从Java 8+开始，只要局部变量事实不变，那么final关键字可以省略。
 * <p>
 * 原因：
 * 1. new出来的对象在堆内存当中。
 * 2. 局部变量是跟着方法走的，在栈内存当中。
 * 3. 方法运行结束之后，立刻出栈，局部变量就会立刻消失。
 * 4. 但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 */
public class InClassFinal {

    public void Method() {
        int num = 100;
//        nun=10;
        class MethodClass {
            public void Methods() {
                System.out.println(num);
            }
        }
    }
}
