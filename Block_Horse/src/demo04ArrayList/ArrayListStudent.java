package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��21:15:15
 * ��Ŀ��
 * �Զ���4��ѧ��������ӵ����ϣ���������
 * <p>
 * ˼·��
 * 1. �Զ���Studentѧ���࣬�ĸ����֡�
 * 2. ����һ�����ϣ������洢ѧ�����󡣷��ͣ�<Student>
 * 3. �����࣬����4��ѧ������
 * 4. ��4��ѧ��������ӵ������У�add
 * 5. �������ϣ�for��size��get
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu=new Student("Stephen",18);
        Student stu1=new Student("Bojack",28);
        Student stu2=new Student("Jack",38);
        Student stu3=new Student("Nana",25);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student per= list.get(i);
            System.out.println("����Ϊ"+per.getName()+"����Ϊ"+per.getAge());
        }

    }
}
