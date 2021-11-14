package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月21日20:21:32
 * 1到100求和只要偶数
 */
public class 循环语句练习 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    //for
    public static void a() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("for和为" + sum);
    }

    //while
    public static void b() {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("while和为" + sum);
    }

    //do...while
    public static void c() {
        int i = 0;
        int sum = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);
        System.out.println("do...while和为" + sum);
    }
}
