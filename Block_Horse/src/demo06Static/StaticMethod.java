package demo06Static;

/**
 * @author : Bojack
 * @date : 2021��10��18��21:06:37
 ��
 */
public class StaticMethod {
    static String name ="stephen";
    int num=10;

    public void  nostatic(){
        System.out.println("���ǳ�Ա����");
        // ��Ա�������Է��ʳ�Ա����
        System.out.println(num);
        // ��Ա�������Է��ʾ�̬����
        System.out.println(name);
        System.out.println("-------------");
    }
    public static void yesstatic(){
        System.out.println("���Ǿ�̬����");
        System.out.println(name);
        // ��̬����ֱ�ӷ��ʷǾ�̬���ص㡿
//        System.out.println(num); // ����д����

        // ��̬�����в���ʹ��this�ؼ��֡�
//        System.out.println(this); // ����д����
        System.out.println("-------------");
    }

}
