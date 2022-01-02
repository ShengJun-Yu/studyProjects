package demo38IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:44 2022.01.01
 * �ļ�������ϰ:һ��һд
 * <p>
 * <p>
 * �ļ����ƵĲ���:
 * 1.����һ���ֽ�����������,���췽���а�Ҫ��ȡ������Դ
 * 2.����һ���ֽ����������,���췽���а�Ҫд���Ŀ�ĵ�
 * 3.ʹ���ֽ������������еķ���read��ȡ�ļ�
 * 4.ʹ���ֽ�������еķ���write,�Ѷ�ȡ�����ֽ�д�뵽Ŀ�ĵص��ļ���
 * 5.�ͷ���Դ
 */
public class IOCopy {
    public static void main(String[] args) throws IOException {
        long b = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt");
        FileOutputStream fos = new FileOutputStream("Block_Horse\\src\\demo38OutputStream\\text03.txt");
        byte[] by = new byte[1024];
        int len = fis.read(by);
        fis.close();
        fos.write(by, 0, len);
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
