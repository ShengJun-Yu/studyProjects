package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:05 2022.03.07
 *  ͨ���������þ�̬��Ա����
 *     ���Ѿ�����,��̬��Ա����Ҳ�Ѿ�����
 *     �Ϳ���ͨ������ֱ�����þ�̬��Ա����
 */
public class demo03Main {
    public static  int com(int num,demo03Interface dw){
        return dw.jdz(num);
    }

    public static void main(String[] args) {
        int num=-121;
        int com = com(num, (n) -> Math.abs(n));
        System.out.println(com);
 /*
            ʹ�÷��������Ż�Lambda���ʽ
            Math���Ǵ��ڵ�
            abs�������ֵ�ľ�̬����Ҳ���Ѿ����ڵ�
            �������ǿ���ֱ��ͨ���������þ�̬����
         */
        int com1 = com(num, Math::abs);
        System.out.println(com1);
    }
}
