package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月21日21:12:38
 * 1.用在可以用在switch语句当中，一旦执行，整个switch语句立刻结束。
 * 2.还可以用在循环语句当中，一旦执行，整个循环语句立刻结束。打断循环。
 */
public class 循环控制语句Break和Continue {
    public static void main(String[] args) {
        a();
        b();
    }

    /**
     * break
     * 1.用在可以用在switch语句当中，一旦执行，整个switch语句立刻结束。
     * 2.还可以用在循环语句当中，一旦执行，整个循环语句立刻结束。打断循环。
     */
    public static void a() {
        for (int i = 0; i < 9; i++) {
            //如果希望第三次就结束打断循环
            if (i == 3) {//如果为第3次
                break;//打断循环
            }
            System.out.println("hello" + i);
        }
    }

    /**
     * continue
     * 一旦执行则立刻跳过当前次循环剩余内容，马上开始下一场循环
     */
    public static void b() {
        for (int i = 0; i < 9; i++) {
            //如果希望跳过第4次循环
            if (i == 4) {//如果为第4次
                continue;//跳过
            }
            System.out.println(i + "层到了");
        }
    }

}
