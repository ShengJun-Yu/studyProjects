package demo11Final;

/**
 * @author : Bojack
 * @date : Created in 17:58 2021.11.14
 * final�ؼ��ִ������ա����ɸı�ġ�
 *
 * ���������÷���
 * 1. ������������һ����
 * 2. ������������һ������
 * 3. ��������������һ���ֲ�����
 * 4. ��������������һ����Ա����
 */
public class demoFinal {
    public static void main(String[] args) {

        // һ��ʹ��final�������ξֲ���������ô��������Ͳ��ܽ��и��ġ�
        // ��һ�θ�ֵ���������䡱
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);
// ���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı�
        final int num1=20;
        System.out.println(num1);
//        num1=10;
//        num1=20;

        // ��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ���ɸı�
        demoFinal01 fin=new demoFinal01("Bojack");
        System.out.println(fin.getName());
        System.out.println(fin);
        fin=new demoFinal01("jun");
        System.out.println(fin.getName());
        System.out.println(fin);
        System.out.println("==================");

        // final���������ͱ��������еĵ�ַ���ɸı�
        final demoFinal01 fin1=new demoFinal01("Bojakk");
        System.out.println(fin1.getName());
        System.out.println(fin1);
        fin1.setName("Bojackkkk");
        System.out.println(fin1);
        System.out.println(fin1.getName());


    }
}
