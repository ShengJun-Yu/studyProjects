package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021��10��10��16:52:09
 * �������ľֲ������ͷ����ĳ�Ա��������ʱ�����ݾͽ�ԭ������ʹ�þֲ�����
 * ����Ҫ���ʱ����еĳ�Ա��������Ҫʹ��this�ؼ���
 * this.��Ա����
 */
public class thisPerson {
    String name;

    public void sayhello(String name) {
        System.out.println(name + "��ã�����" + this.name);
    }
}
