package demo38IOStream.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:08 2022.01.01
 * java.io.InputStream:�ֽ�������
 * �˳������Ǳ�ʾ�ֽ���������������ĳ��ࡣ
 * <p>
 * �������������๲�Եķ���:
 * int read()���������ж�ȡ���ݵ���һ���ֽڡ�
 * int read(byte[] b) ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
 * void close() �رմ����������ͷ����������������ϵͳ��Դ��
 * <p>
 * java.io.FileInputStream extends InputStream
 * FileInputStream:�ļ��ֽ�������
 * ����:��Ӳ���ļ��е�����,��ȡ���ڴ���ʹ��
 * <p>
 * ���췽��:
 * FileInputStream(String name)
 * FileInputStream(File file)
 * ����:��ȡ�ļ�������Դ
 * String name:�ļ���·��
 * File file:�ļ�
 * ���췽��������:
 * 1.�ᴴ��һ��FileInputStream����
 * 2.���FileInputStream����ָ�����췽����Ҫ��ȡ���ļ�
 * <p>
 * ��ȡ���ݵ�ԭ��(Ӳ��-->�ڴ�)
 * java����-->JVM-->OS-->OS��ȡ���ݵķ���-->��ȡ�ļ�
 * <p>
 * �ֽ���������ʹ�ò���(�ص�):
 * 1.����FileInputStream����,���췽���а�Ҫ��ȡ������Դ
 * 2.ʹ��FileInputStream�����еķ���read,��ȡ�ļ�
 * 3.�ͷ���Դ
 */
public class FileInputStream01 {
    public static void main(String[] args) throws IOException {
//        int read()��ȡ�ļ��е�һ���ֽڲ�����,��ȡ���ļ���ĩβ����-1
        FileInputStream fis=new FileInputStream("Block_Horse/src/demo38IOStream/FileStream/text.txt");

//        System.out.println(fis.read());
//        System.out.println(fis.read());

         /*
            �������϶�ȡ�ļ���һ���ظ��Ĺ���,���Կ���ʹ��ѭ���Ż�
            ��֪���ļ����ж����ֽ�,ʹ��whileѭ��
            whileѭ����������,��ȡ��-1��ʱ�����

            �������ʽ(len = fis.read())!=-1
                1.fis.read():��ȡһ���ֽ�
                2.len = fis.read():�Ѷ�ȡ�����ֽڸ�ֵ������len
                3.(len = fis.read())!=-1:�жϱ���len�Ƿ񲻵���-1
         */
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
