package AfaceToObject.Bextends.demo07ExtendsThis;

/**
 * @author : Bojack
 * @date : Created in 22:49 2021.10.27
 * super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ������ݡ��÷�Ҳ�����֣�
 *
 * 1. �ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա������
 * 2. �ڱ���ĳ�Ա�����У����ʱ������һ����Ա������
 * 3. �ڱ���Ĺ��췽���У����ʱ������һ�����췽����
 * �ڵ������÷�����Ҫע�⣺
 * A. this(...)����Ҳ�����ǹ��췽���ĵ�һ����䣬Ψһһ����
 * B. super��this���ֹ�����ã�����ͬʱʹ�á�
 */
public class son extends father{
    String name ="son";
    public son(){
//        super(); // ��һ�в�������
        this(2);
//        this(3,3);//����ʹ�ã�thisֻ��ʹ��һ��
    }
    public son(int num){
        System.out.println("������ʱ��෽��");
    }
    public son(int num,int n){
    }

    public void method(){
        System.out.println("���෽��");
    }
    public void methodSon01(){
        this.method();
        System.out.println("���෽���з��ʱ��෽��");
    }

    public void methodSon(){
        String name="son01";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
