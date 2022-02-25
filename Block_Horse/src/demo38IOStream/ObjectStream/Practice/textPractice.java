package demo38IOStream.ObjectStream.Practice;

import demo38IOStream.ObjectStream.Person;

import java.io.*;
import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 12:41 2022.02.25
 *   ��ϰ�����л�����
 *         �����������ļ��б����������ʱ��
 *         ���԰Ѷ������洢��һ��������
 *         �Լ��Ͻ����л��ͷ����л�
 *
 *          1.����һ���洢Person�����ArrayList����
 *         2.��ArrayList�����д洢Person����
 *         3.����һ�����л���ObjectOutputStream����
 *         4.ʹ��ObjectOutputStream�����еķ���writeObject,�Լ��Ͻ������л�
 *         5.����һ�������л�ObjectInputStream����
 *         6.ʹ��ObjectInputStream�����еķ���readObject��ȡ�ļ��б���ļ���
 *         7.��Object���͵ļ���ת��ΪArrayList����
 *         8.����ArrayList����
 *         9.�ͷ���Դ
 */
public class textPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person per = new Person("��", 12);
        Person per1 = new Person("��", 12);
        Person per2 = new Person("��", 12);
//        1.����һ���洢Person�����ArrayList����
        ArrayList<persons> list = new ArrayList<persons>();
//        2.��ArrayList�����д洢Person����
        list.add(new persons("��ʢ��", 22, per));
        list.add(new persons("Υ��", 222, per1));
        list.add(new persons("��Υ��", 2332, per2));
//        3.����һ�����л���ObjectOutputStream����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Block_Horse/src/demo38IOStream/ObjectStream/Practice/text.txt"));
//        4.ʹ��ObjectOutputStream�����еķ���writeObject,�Լ��Ͻ������л�
        oos.writeObject(list);
//        6.ʹ��ObjectInputStream�����еķ���readObject��ȡ�ļ��б���ļ���
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Block_Horse/src/demo38IOStream/ObjectStream/Practice/text.txt"));
//        7.��Object���͵ļ���ת��ΪArrayList����
        Object o = ois.readObject();
//        8.��object��ǿתΪpersons��
        ArrayList<persons> list1=(ArrayList<persons>)o;
//        9.����ArrayList����
        for (persons li:list1) {
            System.out.println(li);
        }
//        10.�ر���Դ
        ois.close();
        oos.close();

    }
}
