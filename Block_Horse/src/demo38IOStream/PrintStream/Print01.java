package demo38IOStream.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author : Bojack
 * @date : Created in 13:36 2022.02.25
 * java.io.PrintStream:��ӡ��
 *         PrintStream Ϊ�������������˹��ܣ�ʹ�����ܹ�����ش�ӡ��������ֵ��ʾ��ʽ��
 *     PrintStream�ص�:
 *         1.ֻ�������ݵ����,���������ݵĶ�ȡ
 *         2.�������������ͬ��PrintStream ��Զ�����׳� IOException
 *         3.�����еķ���,print,println
 *             void print(�������͵�ֵ)
 *             void println(�������͵�ֵ������)
 *     ���췽��:
 *         PrintStream(File file):�����Ŀ�ĵ���һ���ļ�
 *         PrintStream(OutputStream out):�����Ŀ�ĵ���һ���ֽ������
 *         PrintStream(String fileName) :�����Ŀ�ĵ���һ���ļ�·��
 *     PrintStream extends OutputStream
 *     �̳��Ը���ĳ�Ա����:
 *         - public void close() ���رմ���������ͷ��������������κ�ϵͳ��Դ��
 *         - public void flush() ��ˢ�´��������ǿ���κλ��������ֽڱ�д����
 *         - public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
 *         - public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 *         - public abstract void write(int b) ����ָ�����ֽ��������
 *     ע��:
 *         ���ʹ�ü̳��Ը����write����д����,��ô�鿴���ݵ�ʱ����ѯ����� 97->a
 *         ���ʹ���Լ����еķ���print/println����д����,д������ԭ����� 97->97
 */
public class Print01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("Block_Horse/src/demo38IOStream/PrintStream/print.txt");
        ps.write(97);

        ps.println(97);
        ps.println("efwer");
        ps.println(93232);
        ps.println(92323);

        ps.close();
    }
}
