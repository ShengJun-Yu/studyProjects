package demo03Random;

import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021��10��12��19:40:47
 * Random����������������֡�ʹ������Ҳ���������裺
 * <p>
 * 1. ����
 * import java.util.Random;
 * <p>
 * 2. ����
 * Random r = new Random(); // С���ŵ������ռ���
 * <p>
 * 3. ʹ��
 * ��ȡһ�������int���֣���Χ��int���з�Χ�����������֣���int num = r.nextInt()
 * ��ȡһ�������int���֣����������˷�Χ������ҿ����䣩��int num = r.nextInt(3)
 * ʵ���ϴ���ĺ����ǣ�[0,3)��Ҳ����0~2
 */
public class Random01 {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(63);
        System.out.println("�����Ϊ��"+num);
    }
}
