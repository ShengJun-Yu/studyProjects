package AfaceToObject.Bextends.demo06ExtendsSuper;

/**
 * @author : Bojack
 * @date : Created in 22:31 2021.10.27
 * super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ������ݡ��÷�Ҳ�����֣�
 *
 * 1. �ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա������
 * 2. �ڱ���ĳ�Ա�����У����ʱ������һ����Ա������
 * 3. �ڱ���Ĺ��췽���У����ʱ������һ�����췽����
 * �ڵ������÷�����Ҫע�⣺
 * A. this(...)����Ҳ�����ǹ��췽���ĵ�һ����䣬Ψһһ����
 * B. super��this���ֹ�����ã�����ͬʱʹ�á�
 */
public class son extends father {
    String name ="Son";
    public son(){
        super();
    }
    public void methedSon(){
        System.out.println(super.name);
    }
    public void method(){
        super.method();//���෽��
        System.out.println("���෽��");
    }

}
