package demo11Final;

/**
 * @author : Bojack
 * @date : Created in 20:38 2021.11.16
 * ���ڳ�Ա������˵�����ʹ��final�ؼ������Σ���ô�������Ҳ�����ǲ��ɱ䡣
 *
 * 1. ���ڳ�Ա��������Ĭ��ֵ����������final֮������ֶ���ֵ�������ٸ�Ĭ��ֵ�ˡ�
 * 2. ����final�ĳ�Ա������Ҫôʹ��ֱ�Ӹ�ֵ��Ҫôͨ�����췽����ֵ������ѡ��һ��
 * 3. ���뱣֤�൱���������صĹ��췽���������ջ��final�ĳ�Ա�������и�ֵ��
 */
public class Person {
    private final  int num /*=10*/;

    public Person() {
        num=10;
    }

    public Person(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

//    public void setNum(int num) {
//        this.num = num;
//    }
}
