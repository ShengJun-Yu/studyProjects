package demo38IOStream.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:08 2022.01.03
 * java.io.BufferedReader extends Reader
 * BufferedReader:�ַ�����������
 * <p>
 * �̳��Ը���Ĺ��Գ�Ա����:
 * int read() ��ȡ�����ַ������ء�
 * int read(char[] cbuf)һ�ζ�ȡ����ַ�,���ַ��������顣
 * void close() �رո������ͷ���֮������������Դ��
 * <p>
 * ���췽��:
 * BufferedReader(Reader in)  ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
 * BufferedReader(Reader in, int sz)     ����һ��ʹ��ָ����С���뻺�����Ļ����ַ���������
 * ����:
 * Reader in:�ַ�������
 * ���ǿ��Դ���FileReader,���������FileReader����һ��������,���FileReader�Ķ�ȡЧ��
 * ���еĳ�Ա����:
 * String readLine() ��ȡһ���ı��С���ȡһ������
 * �е���ֹ����:ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż���(\r\n)��
 * ����ֵ:
 * �����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
 * <p>
 * ʹ�ò���:
 * 1.�����ַ���������������,���췽���д����ַ�������
 * 2.ʹ���ַ����������������еķ���read/readLine��ȡ�ı�
 * 3.�ͷ���Դ
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Block_Horse/src/demo38IOStream/BufferedStream/write.txt"));
        int read = br.read();

        System.out.println((char)read);
        String len = null;
        while ((len = br.readLine()) != null) {
            System.out.println(len);
        }
        br.close();
    }
}
