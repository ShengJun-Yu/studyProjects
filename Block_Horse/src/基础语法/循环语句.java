package �����﷨;
/**
 * @author : Bojack
 * @date : 2021��9��21��19:34:09
 * ѭ�������Ĳ�
 * 1.��ʼ����䣺��ѭ����ʼֻ��Ψһһ��
 * 2.�����жϣ������������������˳�ѭ��
 * 3.ѭ���壺�ظ�������
 * 4.������䣺ѭ�����ɨβ����������ÿ��ѭ����Ҫִ��һ�Σ�����
 */
public class ѭ����� {
    public static void main(String[] args) {
        a();
        b();
        c();
    }
    /**
     * ѭ����� --for
     *for (��ʼ�����; �����ж�; ������䣩{
     *     ѭ����;
     *}
     */
    public static void a(){
        for(int a=0;a<=9;a++){
            System.out.println(a+"����ˣ�");
        }
        System.out.println("for����ֹͣ");
    }
    /**
     * ѭ����� --while
     * ��׼��ʽ��
     * while�������жϣ�{
     *     ѭ����;
     * }
     * ��չ��ʽ��
     * ��ʼ�����;
     * while�������жϣ�{
     *     ѭ����;
     *     �������;
     * }
     */
    public static void b(){
        int i=1;
        while(i<=8){
            System.out.println(i+"Fuck");
            i++;
        }
        System.out.println("while����ֹͣ");
    }
    /**
     * ѭ����� --do...while
     * ��׼��ʽ
     *
     * do{
     *     ѭ����;
     *  }while(�����ж�);
     *
     *  ��չ��ʽ��
     *
     *  ��ʼ�����;
     *  do{
     *      ѭ����;
     *      �������;
     *  }while(�����жϣ�;
     */
    public static void c(){
        int b=1;
        do{
            System.out.println(b+"hello");
            b++;
        }while(b<=6);
        System.out.println("do...while�������");
    }

}
