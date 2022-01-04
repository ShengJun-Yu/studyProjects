package demo38IOStream.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:00 2022.01.03
 * java.io.BufferedOutputStream extends OutputStream
 * BufferedOutputStream:�ֽڻ��������
 * <p>
 * �̳��Ը���Ĺ��Գ�Ա����:
 * - public void close() ���رմ���������ͷ��������������κ�ϵͳ��Դ��
 * - public void flush() ��ˢ�´��������ǿ���κλ��������ֽڱ�д����
 * - public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
 * - public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 * - public abstract void write(int b) ����ָ�����ֽ��������
 * <p>
 * ���췽��:
 * BufferedOutputStream(OutputStream out)  ����һ���µĻ�����������Խ�����д��ָ���ĵײ��������
 * BufferedOutputStream(OutputStream out, int size)  ����һ���µĻ�����������Խ�����ָ����������С������д��ָ���ĵײ��������
 * ����:
 * OutputStream out:�ֽ������
 * ���ǿ��Դ���FileOutputStream,���������FileOutputStream����һ��������,���FileOutputStream��д��Ч��
 * int size:ָ���������ڲ��������Ĵ�С,��ָ��Ĭ��
 * ʹ�ò���(�ص�)
 * 1.����FileOutputStream����,���췽���а�Ҫ�����Ŀ�ĵ�
 * 2.����BufferedOutputStream����,���췽���д���FileOutputStream�������,���FileOutputStream����Ч��
 * 3.ʹ��BufferedOutputStream�����еķ���write,������д�뵽�ڲ���������
 * 4.ʹ��BufferedOutputStream�����еķ���flush,���ڲ��������е�����,ˢ�µ��ļ���
 * 5.�ͷ���Դ(���ȵ���flush����ˢ������,��4������ʡ��)
 */
public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("Block_Horse/src/demo38IOStream/BufferedStream/text.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos,1024);
        bos.write("��ʢ��".getBytes());
        bos.close();
    }
}
