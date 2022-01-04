package demo38IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author : Bojack
 * @date : Created in 17:57 2022.01.03
 * java.io.OutputStreamWriter extends Writer
 * OutputStreamWriter: ���ַ���ͨ���ֽ�������������ʹ��ָ���� charset ��Ҫд�����е��ַ�������ֽڡ�(����:���ܿ����ı�ɿ�����)
 * <p>
 * �����Ը���Ĺ��Գ�Ա����:
 * - void write(int c) д�뵥���ַ���
 * - void write(char[] cbuf)д���ַ����顣
 * - abstract  void write(char[] cbuf, int off, int len)д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 * - void write(String str)д���ַ�����
 * - void write(String str, int off, int len) д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 * - void flush()ˢ�¸����Ļ��塣
 * - void close() �رմ�������Ҫ��ˢ������
 * ���췽��:
 * OutputStreamWriter(OutputStream out)����ʹ��Ĭ���ַ������ OutputStreamWriter��
 * OutputStreamWriter(OutputStream out, String charsetName) ����ʹ��ָ���ַ����� OutputStreamWriter��
 * ����:
 * OutputStream out:�ֽ������,��������дת��֮����ֽڵ��ļ���
 * String charsetName:ָ���ı��������,�����ִ�Сд,������utf-8/UTF-8,gbk/GBK,...��ָ��Ĭ��ʹ��UTF-8
 * ʹ�ò���:
 * 1.����OutputStreamWriter����,���췽���д����ֽ��������ָ���ı��������
 * 2.ʹ��OutputStreamWriter�����еķ���write,���ַ�ת��Ϊ�ֽڴ洢��������(����)
 * 3.ʹ��OutputStreamWriter�����еķ���flush,���ڴ滺�����е��ֽ�ˢ�µ��ļ���(ʹ���ֽ���д�ֽڵĹ���)
 * 4.�ͷ���Դ
 */
public class OutputStreamWriter01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("Block_Horse/src/demo38IOStream/OutputStreamWriter01.txt"),
                "UTF-8");
        osw.write("��ʢ��");
        osw.close();
    }
}
