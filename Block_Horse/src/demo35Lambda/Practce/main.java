package demo35Lambda.Practce;

/**
 * @author : Bojack
 * @date : Created in 16:43 2021.12.27
 * Lambda���ʽ�в����з���ֵ����ϰ
 * ����:
 * ����һ��������Calculator�ӿڣ��ں����󷽷�calc���Խ�����int������ӵõ���ֵ
 * ʹ��Lambda�ı�׼��ʽ����invokeCalc���������120��130����Ӽ���
 */
public class main {
    public static void main(String[] args) {
//        jias(10, 20, new Calculator() {
//            @Override
//            public int calu(int a, int b) {
//                return a+b;
//            }
//        });

//        lambdaд��
        jias(20, 30, (int a, int b) -> {
            return a + b;
        });

    }

    public static void jias(int a, int b, Calculator c) {
        int sum = c.calu(a, b);
        System.out.println(sum);
    }

}
