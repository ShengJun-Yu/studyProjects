package demo10Class;

/**
 * @author : Bojack
 * @date :2021��10��4��16:36:14
 * ͨ������£�һ�����޷�ֱ��ʹ�ã���Ҫ�����ഴ��һ���������ʹ��
 * <p>
 * 1. ������Ҳ����ָ����Ҫʹ�õ��࣬��ʲôλ�á�
 * import ������.������;
 * import �������.��.Student;
 * ���ں͵�ǰ������ͬһ���������������ʡ�Ե�����䲻д��(�˴����ɲ�д)
 * <p>
 * 2. ��������ʽ��
 * ������ ������ = new ������();
 * Student stu = new Student();
 * <p>
 * 3. ʹ�ã���Ϊ���������
 * ʹ�ó�Ա������������.��Ա������
 * ʹ�ó�Ա������������.��Ա������(����)
 * ��Ҳ���ǣ�����˭�����ö��������˭����
 * <p>
 * ע�����
 * �����Ա����û�н��и�ֵ����ô������һ��Ĭ��ֵ�����������һ����
 */
public class Student���� {
    public static void main(String[] args) {
        //������ ������ = new ������();
        Student stu = new Student();
        System.out.println(stu.name);//Ĭ��Ϊnull
        System.out.println(stu.age);//Ĭ��Ϊ0

        stu.name = "��ʢ��";
        stu.age = 18;
        System.out.println(stu.name);//Ĭ��Ϊnull
        System.out.println(stu.age);//Ĭ��Ϊ0

        // ������.��Ա������(����)
        stu.study();
        stu.eat();
        stu.sleep();
    }
}
