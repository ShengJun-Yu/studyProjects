package AfaceToObject.Bextends.demo01Extends;

/**
 * @author : Bojack
 * @date : 2021��10��27��19:12:33
 * �ڼ̳еĹ�ϵ�У����������һ�����ࡱ��Ҳ����˵��������Ա��������࿴����
 * ���縸����Ա���������ǽ�ʦ����ô����ʦ����һ��Ա��������ϵ��is-a��
 *
 * ���常��ĸ�ʽ����һ����ͨ���ඨ�壩
 * public class �������� {
 *     // ...
 * }
 *
 * ��������ĸ�ʽ��
 * public class �������� extends �������� {
 *     // ...
 * }
 */
public class Extends01 {
    public static void main(String[] args) {
        //������һ���������
        Son01 son01=new Son01();
        //Son01�൱����Ȼʲô��ûд�����ǻ�̳����Ը����method������
        son01.method();
        // ������һ���������
        Son02 son02=new Son02();
        son02.method();

    }
}
