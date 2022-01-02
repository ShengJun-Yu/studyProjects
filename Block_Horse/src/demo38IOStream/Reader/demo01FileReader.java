package demo38IOStream.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:57 2022.01.02
 * java.io.Reader:�ַ�������,���ַ������������ĸ���,������һЩ���Եĳ�Ա����,��һ��������
 * <p>
 * ���Եĳ�Ա����:
 * int read() ��ȡ�����ַ������ء�
 * int read(char[] cbuf)һ�ζ�ȡ����ַ�,���ַ��������顣
 * void close() �رո������ͷ���֮������������Դ��
 * <p>
 * java.io.FileReader extends InputStreamReader extends Reader
 * FileReader:�ļ��ַ�������
 * ����:��Ӳ���ļ��е��������ַ��ķ�ʽ��ȡ���ڴ���
 * <p>
 * ���췽��:
 * FileReader(String fileName)
 * FileReader(File file)
 * ����:��ȡ�ļ�������Դ
 * String fileName:�ļ���·��
 * File file:һ���ļ�
 * FileReader���췽��������:
 * 1.����һ��FileReader����
 * 2.���FileReader����ָ��Ҫ��ȡ���ļ�
 * �ַ���������ʹ�ò���:
 * 1.����FileReader����,���췽���а�Ҫ��ȡ������Դ
 * 2.ʹ��FileReader�����еķ���read��ȡ�ļ�
 * 3.�ͷ���Դ
 *
 * 1������
 * GBK:ռ�������ֽ�
 * UTF-8:ռ��3���ֽ�
 */
public class demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Block_Horse\\src\\demo38IOStream\\Reader\\read.txt");
        int len=0;
//        int read() ��ȡ�����ַ������ء�
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
//        int read(char[] cbuf)һ�ζ�ȡ����ַ�,���ַ��������顣
        char[] chars=new char[1024];
        int lenth=0;
        while ((lenth=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,lenth));
        }
//        void close() �رո������ͷ���֮������������Դ��
        fr.close();


    }
}
