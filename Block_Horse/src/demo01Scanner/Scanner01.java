package demo01Scanner;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021��10��11��20:48:59
 * Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ��������С�
 * <p>
 * �������͵�һ��ʹ�ò��裺
 * <p>
 * 1. ����
 * import ��·��.������;
 * �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д��
 * ֻ��java.lang���µ����ݲ���Ҫ�����������İ�����Ҫimport��䡣
 * <p>
 * 2. ����
 * ������ ������ = new ������();
 * <p>
 * 3. ʹ��
 * ������.��Ա������()
 * <p>
 * ��ȡ���������һ��int���֣�int num = sc.nextInt();
 * ��ȡ���������һ���ַ�����String str = sc.next();
 */
public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //��������
        String name = sc.next();
        System.out.println("����Ϊ��" + name);
//        �����ַ���
        int num = sc.nextInt();
        System.out.println("����Ϊ��" + num);

    }
}
