package demo10Class;

/**
 * @author : Bojack
 * @date : 2021��10��11��19:14:10
 * һ����׼����ͨ��Ҫӵ�������ĸ���ɲ��֣�
 * <p>
 * 1. ���еĳ�Ա������Ҫʹ��private�ؼ�������
 * 2. Ϊÿһ����Ա������дһ�Զ�Getter/Setter����
 * 3. ��дһ���޲����Ĺ��췽��
 * 4. ��дһ��ȫ�����Ĺ��췽��
 */
public class classNorm {
    //    private�ؼ�������
    private String name;
    private int age;
    private boolean isman;

    //    �޲����Ĺ��췽��
    public classNorm() {
    }

    //    ȫ�����Ĺ��췽��
    public classNorm(String name, int age, boolean isman) {
        this.name = name;
        this.age = age;
        this.isman = isman;
    }

    //    һ����Ա������дһ�Զ�Getter/Setter����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsman() {
        return isman;
    }

    public void setIsman(boolean isman) {
        this.isman = isman;
    }
}
