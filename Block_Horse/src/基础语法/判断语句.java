package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��22��17:12:15
 */

public class �ж���� {
    public static void main(String[] args) {
        �ж����if();
        �ж����ifelse();
        a();
    }

    /**
     * �ж���� if
     */
    public static void �ж����if() {
        System.out.println("�����������ã��������й䣬ͻȻ����һ�����ֵĵط������ɡ�");
        int age = 16;
        if (age >= 18) {
            System.out.println("������ɣ���ʼhigh��");
            System.out.println("����һȺ��");
            System.out.println("�����˻ؼ�");
        }
        System.out.println("δ��18�����ֹ���룬�ؼҳԷ�");
    }

    /**
     * �ж���� if  else
     */
    public static void �ж����ifelse() {
        int num = 888;
        if (num % 2 == 0) {
            System.out.println("ż��");
        } else {
            System.out.println("����");
        }
    }

    /**
     * �ж����if..else if...else
     */
    public static void a() {
        int x = 88;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("���Ϊy=" + y);
    }

}

