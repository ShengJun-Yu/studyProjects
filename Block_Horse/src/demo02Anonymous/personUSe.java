package demo02Anonymous;

/**
 * @author : Bojack
 * @date : 2021��10��11��21:25:31
 * ��������ı�׼��ʽ��
 * ������ ������ = new ������();
 * <p>
 * �����������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ�������
 * new ������();
 * <p>
 * ע�������������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ٴ���һ���¶���
 * ʹ�ý��飺���ȷ����һ������ֻ��Ҫʹ��Ψһ��һ�Σ��Ϳ�������������
 */
public class personUSe {
    public static void main(String[] args) {
        person one = new person();
        one.name = "��ʢ��";
        one.sayname();

        new person().name = "��ʢ��";
        new person().sayname();

    }
}
