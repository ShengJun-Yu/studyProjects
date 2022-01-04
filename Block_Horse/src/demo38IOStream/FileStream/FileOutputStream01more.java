package demo38IOStream.FileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:06 2022.01.01
 * <p>
 * һ��д����ֽڵķ���:
 * - public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
 * - public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 */
public class FileOutputStream01more {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("Block_Horse/src/demo38IOStream/FileStream/text02.txt"));
//        public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
        byte[] by = {68, 69, 80, 65};
        fos.write(by);
//        public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
        fos.write(by, 2, 2);

        /*
            д���ַ��ķ���:����ʹ��String���еķ������ַ���,ת��Ϊ�ֽ�����
                byte[] getBytes()  ���ַ���ת��Ϊ�ֽ�����
         */
        byte[] by1 = "___Hello,World!".getBytes();
        fos.write(by1);
        fos.close();
    }
}
