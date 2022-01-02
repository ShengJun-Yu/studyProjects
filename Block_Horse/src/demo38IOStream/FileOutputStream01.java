package demo38IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 13:37 2022.01.01
 * java.io.OutputStream:�ֽ������
 * �˳������Ǳ�ʾ����ֽ�����������ĳ��ࡣ
 * <p>
 * ������һЩ���๲�Եĳ�Ա����:
 * - public void close() ���رմ���������ͷ��������������κ�ϵͳ��Դ��
 * - public void flush() ��ˢ�´��������ǿ���κλ��������ֽڱ�д����
 * - public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
 * - public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 * - public abstract void write(int b) ����ָ�����ֽ��������
 * <p>
 * java.io.FileOutputStream extends OutputStream
 * FileOutputStream:�ļ��ֽ������
 * ����:���ڴ��е�����д�뵽Ӳ�̵��ļ���
 * <p>
 * ���췽��:
 * FileOutputStream(String name)����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
 * FileOutputStream(File file) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
 * ����:д�����ݵ�Ŀ��
 * String name:Ŀ�ĵ���һ���ļ���·��
 * File file:Ŀ�ĵ���һ���ļ�
 * ���췽��������:
 * 1.����һ��FileOutputStream����
 * 2.����ݹ��췽���д��ݵ��ļ�/�ļ�·��,����һ���յ��ļ�
 * 3.���FileOutputStream����ָ�򴴽��õ��ļ�
 * <p>
 * д�����ݵ�ԭ��(�ڴ�-->Ӳ��)
 * java����-->JVM(java�����)-->OS(����ϵͳ)-->OS����д���ݵķ���-->������д�뵽�ļ���
 * <p>
 * �ֽ��������ʹ�ò���(�ص�):
 * 1.����һ��FileOutputStream����,���췽���д���д�����ݵ�Ŀ�ĵ�
 * 2.����FileOutputStream�����еķ���write,������д�뵽�ļ���
 * 3.�ͷ���Դ(��ʹ�û�ռ��һ�����ڴ�,ʹ�����Ҫ���ڴ����,�ṩ�����Ч��)
 */
public class FileOutputStream01  {
    public static void main(String[] args) throws IOException {
//        FileOutputStream(String name)����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
        FileOutputStream fos=new FileOutputStream("Block_Horse\\src\\demo38OutputStream\\text.txt");
//        public abstract void write(int b) ����ָ�����ֽ��������
        fos.write(2021);
//        public void close() ���رմ���������ͷ��������������κ�ϵͳ��Դ��
        fos.close();
    }
}
