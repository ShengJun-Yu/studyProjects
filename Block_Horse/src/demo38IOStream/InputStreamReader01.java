package demo38IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Bojack
 * @date : Created in 18:04 2022.01.03
 * java.io.InputStreamReader extends Reader
 * InputStreamReader:���ֽ���ͨ���ַ�������������ʹ��ָ���� charset ��ȡ�ֽڲ��������Ϊ�ַ���(����:�ѿ������ı���ܿ�����)
 * <p>
 * �̳��Ը���Ĺ��Գ�Ա����:
 * int read() ��ȡ�����ַ������ء�
 * int read(char[] cbuf)һ�ζ�ȡ����ַ�,���ַ��������顣
 * void close() �رո������ͷ���֮������������Դ��
 * ���췽��:
 * InputStreamReader(InputStream in) ����һ��ʹ��Ĭ���ַ����� InputStreamReader��
 * InputStreamReader(InputStream in, String charsetName) ����ʹ��ָ���ַ����� InputStreamReader��
 * ����:
 * InputStream in:�ֽ�������,������ȡ�ļ��б�����ֽ�
 * String charsetName:ָ���ı��������,�����ִ�Сд,������utf-8/UTF-8,gbk/GBK,...��ָ��Ĭ��ʹ��UTF-8
 * ʹ�ò���:
 * 1.����InputStreamReader����,���췽���д����ֽ���������ָ���ı��������
 * 2.ʹ��InputStreamReader�����еķ���read��ȡ�ļ�
 * 3.�ͷ���Դ
 * ע������:
 * ���췽����ָ���ı��������Ҫ���ļ��ı�����ͬ,����ᷢ������
 */
public class InputStreamReader01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Block_Horse/src/demo38IOStream/OutputStreamWriter01.txt"),
                "utf-8");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        isr.close();
    }
}
