package AfaceToObject.Bextends.demo03Extends;

/**
 * @author : Bojack
 * @date : 2021��10��27��19:58:20
 * �ֲ�������         ֱ��д��Ա������
 * ����ĳ�Ա������    this.��Ա������
 * ����ĳ�Ա������    super.��Ա������
 */
public class Son extends Father {
    String name = "son";

    public void smethed() {
        String name = "methed son";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    //@Override��д�ڷ���ǰ�棬��������ǲ�����Ч����ȷ������д��
    @Override
    public String methed(){
        System.out.println("���෽��ִ����");
        return null;
    }
}
