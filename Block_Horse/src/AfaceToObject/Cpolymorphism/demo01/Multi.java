package AfaceToObject.Cpolymorphism.demo01;

/**
 * @author : Bojack
 * @date : Created in 14:55 2021.11.14
 * ���뵱�����ֶ�̬�ԣ���ʵ����һ�仰����������ָ���������
 * <p>
 * ��ʽ��
 * �������� ������ = new ��������();
 * ���ߣ�
 * �ӿ����� ������ = new ʵ��������();
 */
public class Multi {
    public static void main(String[] args) {
        Father obj = new Son02();
//        obj.method();
//        obj.methodFather();
        Person p=new Person();
        p.driver(obj);
//        obj.methodSon();
/**
 *  ���ʳ�Ա���������ַ�ʽ��
 * 1. ֱ��ͨ���������Ʒ��ʳ�Ա���������Ⱥ������˭��������˭��û���������ҡ�
 * 2. ���ͨ����Ա�������ʳ�Ա���������÷�������˭��������˭��û���������ҡ�
 */
        System.out.println(obj.num);
        // ����û�и�����д�����Ǹ���10
        // �������������д�������ӣ�20
        obj.methodFather01();
/**
 * �ڶ�̬�Ĵ��뵱�У���Ա�����ķ��ʹ����ǣ�
 *   *��new����˭����������˭��û���������ҡ�
 *   *�ھ������뿴��ߣ����п��ұߡ�
 *   *�Ա�һ�£�
 *   *��Ա���������뿴��ߣ����л�����ߡ�
 *   *��Ա���������뿴��ߣ����п��ұߡ�
 */
        Father obj01 = new Son();
        obj01.method();//���Ӷ��У���������
        obj01.methodFather();// ����û�У������У������ҵ�����
        // ���뿴��ߣ������Fu��Fu����û��methodZi���������Ա��뱨��
//        obj.methodZi(); // ����д����

    }
}
