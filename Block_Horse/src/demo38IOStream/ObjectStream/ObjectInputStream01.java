package demo38IOStream.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author : Bojack
 * @date : Created in 16:35 2022.02.21
 * java.io.ObjectInputStream extends InputStream
 * ObjectInputStream:����ķ����л���
 * ����:���ļ��б���Ķ���,�����ķ�ʽ��ȡ����ʹ��
 * <p>
 * ���췽��:
 * ObjectInputStream(InputStream in) ������ָ�� InputStream ��ȡ�� ObjectInputStream��
 * ����:
 * InputStream in:�ֽ�������
 * ���еĳ�Ա����:
 * Object readObject() �� ObjectInputStream ��ȡ����
 * <p>
 * ʹ�ò���:
 * 1.����ObjectInputStream����,���췽���д����ֽ�������
 * 2.ʹ��ObjectInputStream�����еķ���readObject��ȡ���������ļ�
 * 3.�ͷ���Դ
 * 4.ʹ�ö�ȡ�����Ķ���(��ӡ)
 * <p>
 * readObject���������׳���ClassNotFoundException(class�ļ��Ҳ����쳣)
 * �������ڶ����class�ļ�ʱ�׳����쳣
 * �����л���ǰ��:
 * 1.�����ʵ��Serializable
 * 2.����������Ӧ��class�ļ�
 */
public class ObjectInputStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Block_Horse/src/demo38IOStream/ObjectStream/oos.txt"));

//        System.out.println(ois.readObject());
        Object o = ois.readObject();
        Person o1 = (Person) o;
        System.out.println( o1.getName()+o1.getAge());
        ois.close();
    }
}
