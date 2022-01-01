package demo38OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:31 2022.01.01
 *     ׷��д/��д:ʹ�����������Ĺ��췽��
 *         FileOutputStream(String name, boolean append)����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
 *         FileOutputStream(File file, boolean append) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
 *         ����:
 *            String name,File file:д�����ݵ�Ŀ�ĵ�
 *            boolean append:׷��д����
 *             true:�������󲻻Ḳ��Դ�ļ�,�������ļ���ĩβ׷��д����
 *             false:����һ�����ļ�,����Դ�ļ�
 *     д����:д���з���
 *         windows:\r\n
 *         linux:/n
 *         mac:/r
 */
public class FIleOutputStream01Add {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt",true);
        for (int i = 0; i < 6; i++) {
            fos.write("��ã�".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
