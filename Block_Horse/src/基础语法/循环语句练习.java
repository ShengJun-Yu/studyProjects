package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��21��20:21:32
 * 1��100���ֻҪż��
 */
public class ѭ�������ϰ {
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
        System.out.println("for��Ϊ" + sum);
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
        System.out.println("while��Ϊ" + sum);
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
        System.out.println("do...while��Ϊ" + sum);
    }
}
