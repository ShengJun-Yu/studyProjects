package demo38IOStream.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:18 2022.01.03
 * java.io.BufferedInputStream extends InputStream
 * BufferedInputStream:�ֽڻ���������
 * <p>
 * �̳��Ը���ĳ�Ա����:
 * int read()���������ж�ȡ���ݵ���һ���ֽڡ�
 * int read(byte[] b) ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
 * void close() �رմ����������ͷ����������������ϵͳ��Դ��
 * <p>
 * ���췽��:
 * BufferedInputStream(InputStream in) ����һ�� BufferedInputStream ��������������������� in���Ա㽫��ʹ�á�
 * BufferedInputStream(InputStream in, int size) ��������ָ����������С�� BufferedInputStream ��������������������� in���Ա㽫��ʹ�á�
 * ����:
 * InputStream in:�ֽ�������
 * ���ǿ��Դ���FileInputStream,���������FileInputStream����һ��������,���FileInputStream�Ķ�ȡЧ��
 * int size:ָ���������ڲ��������Ĵ�С,��ָ��Ĭ��
 * <p>
 * ʹ�ò���(�ص�):
 * 1.����FileInputStream����,���췽���а�Ҫ��ȡ������Դ
 * 2.����BufferedInputStream����,���췽���д���FileInputStream����,���FileInputStream����Ķ�ȡЧ��
 * 3.ʹ��BufferedInputStream�����еķ���read,��ȡ�ļ�
 * 4.�ͷ���Դ
 */
public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("Block_Horse/src/demo38IOStream/BufferedStream/text.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
