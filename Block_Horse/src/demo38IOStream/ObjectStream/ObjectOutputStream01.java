package demo38IOStream.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author : Bojack
 * @date : Created in 15:06 2022.02.21
 * <p>
 * java.io.ObjectOutputStream extends OutputStream
 * ObjectOutputStream:��������л���
 * ����:�Ѷ��������ķ�ʽд�뵽�ļ��б���
 * ���췽��:
 * ObjectOutputStream(OutputStream out) ����д��ָ�� OutputStream �� ObjectOutputStream��
 * ����:
 * OutputStream out:�ֽ������
 * ���еĳ�Ա����:
 * void writeObject(Object obj) ��ָ���Ķ���д�� ObjectOutputStream��
 * ʹ�ò���:
 * 1.����ObjectOutputStream����,���췽���д����ֽ������
 * 2.ʹ��ObjectOutputStream�����еķ���writeObject,�Ѷ���д�뵽�ļ���
 * 3.�ͷ���Դ
 */
public class ObjectOutputStream01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Block_Horse/src/demo38IOStream/ObjectStream/oos.txt"));
        oos.writeObject(new Person("��ʢ��",22));
        oos.close();
    }
}
