package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 18:39 2021.11.17
 * ���һ�����Ƕ�����һ�������ڲ��ģ���ô�����һ���ֲ��ڲ��ࡣ
 * ���ֲ�����ֻ�е�ǰ�����ķ�������ʹ���������������������Ͳ������ˡ�
 * <p>
 * �����ʽ��
 * ���η� class �ⲿ������ {
 * ���η� ����ֵ���� �ⲿ�෽������(�����б�) {
 * class �ֲ��ڲ������� {
 * // ...
 * }
 * }
 * }
 *
 * ���Ȩ�����η���
 * public > protected > (default) > private
 * ����һ�����ʱ��Ȩ�����η�����
 * 1. �ⲿ�ࣺpublic / (default)
 * 2. ��Ա�ڲ��ࣺpublic / protected / (default) / private
 * 3. �ֲ��ڲ��ࣺʲô������д
 */
public class ClassInMain {
    public void ClassMethod() {
        class Inner {//�ֲ��ڲ���
            int num = 100;

            public void MethodInner() {
                System.out.println(num);
            }
        }
        new Inner().MethodInner();
    }
}
