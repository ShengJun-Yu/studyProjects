package demo09Interface.demo01;

/**
 * @author : Bojack
 * @date : Created in 20:13 2021.11.09
 *  �ӿھ��Ƕ����Ĺ����淶��
 *  �ӿ���һ�������������ͣ�����Ҫ�����ݾ������еģ����󷽷���
 *
 *  ��ζ���һ���ӿڵĸ�ʽ��
 *  public interface �ӿ����� {
 *      // �ӿ�����
 *  }
 *
 *  ��ע�������˹ؼ���interface֮�󣬱������ɵ��ֽ����ļ���Ȼ�ǣ�.java --> .class��
 *
 *  �����Java 7����ô�ӿ��п��԰����������У�
 *  1. ����
 *  2. ���󷽷�
 *
 *  �����Java 8�������Զ�������У�
 *  3. Ĭ�Ϸ���
 *  4. ��̬����
 *
 *  �����Java 9�������Զ�������У�
 *  5. ˽�з���
 * ���κΰ汾��Java�У��ӿڶ��ܶ�����󷽷���
 * ��ʽ��
 * public abstract ����ֵ���� ��������(�����б�);
 * <p>
 * ע�����
 * 1. �ӿڵ��еĳ��󷽷������η������������̶��Ĺؼ��֣�public abstract
 * 2. �������ؼ������η�������ѡ���Ե�ʡ�ԡ��������ѧ�����Բ��Ƽ�����
 * 3. ��������Ҫ�أ��������ⶨ�塣
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs();

    abstract void methodAbs1();

    public void methodAbs2();

    void methodAbs3();

}
