package demo11Final;

/**
 * @author : Bojack
 * @date : Created in 19:24 2021.11.16
 * ��final�ؼ�����������һ��������ʱ����������������շ�����Ҳ���ǲ��ܱ�������д��
 * ��ʽ��
 * ���η� final ����ֵ���� ��������(�����б�) {
 *     // ������
 * }
 *
 * ע�����
 * �����ࡢ������˵��abstract�ؼ��ֺ�final�ؼ��ֲ���ͬʱʹ�ã���Ϊì�ܡ�
 */
public abstract class Father {
    public final void method(){
        System.out.println("���෽��");
    }
    public abstract /*final*/ void methodAbs();
}
