package AfaceToObject.Bextends.demo02Extends;

/**
 * @author : Bojack
 * @date : 2021��10��27��19:37:49
 * �ڸ�����ļ̳й�ϵ���У������Ա�����������򴴽��������ʱ�����������ַ�ʽ��
 *
 * ֱ��ͨ�����������ʳ�Ա������
 *     �Ⱥ������˭����������˭��û���������ҡ�
 * ���ͨ����Ա�������ʳ�Ա������
 *     �÷�������˭����������˭��û���������ҡ�
 */
public class extends02 {
    public static void main(String[] args) {
        Father father=new Father();
        System.out.println(father.fnum);

        Son son=new Son();
        System.out.println(son.snum);
        System.out.println(son.fnum);


        System.out.println(son.num);
        System.out.println(father.num);

        son.Smethod();
        son.fmethod();





    }
}
