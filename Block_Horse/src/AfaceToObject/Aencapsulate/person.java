package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021��10��9��20:36:12
 * ��������������Person������ʱ���޷���ֹ���������ֵ�����ý�����
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա�����������Ρ�
 * <p>
 * һ��ʹ����private�������Σ���ô���൱����Ȼ����������ʡ�
 * ���ǣ������˱��෶Χ֮��Ͳ�����ֱ�ӷ����ˡ�
 * <p>
 * ��ӷ���private��Ա���������Ƕ���һ�Զ�Getter/Setter����
 * <p>
 * �����setXxx������getXxx��������
 * ����Getter��˵�������в���������ֵ���ͺͳ�Ա������Ӧ��
 * ����Setter��˵�������з���ֵ���������ͺͳ�Ա������Ӧ��
 */
public class person {
    private int age;
    String name;

    public void show() {
        System.out.println("�ҽ�" + name + ",��" + age + "���ˣ�");
    }

    //������age��������
    public void setAge(int num) {
        if (num < 130 && num > 0) {
            age = num;
        } else {
            System.out.println("������������");
        }
    }

    //���ڻ�ȡage����
    public int getAge() {
        return age;
    }
}
