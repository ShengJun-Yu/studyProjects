package demo38IOStream.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:41 2022.01.02
 *  �ַ������д���ݵ���������
 *         - void write(char[] cbuf)д���ַ����顣
 *         - abstract  void write(char[] cbuf, int off, int len)д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 *         - void write(String str)д���ַ�����
 *         - void write(String str, int off, int len) д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 */
public class demo02FileWriterMethod {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt");
//        void write(char[] cbuf)д���ַ����顣
        char[] ch={'a','b','c','d'};
        fw.write(ch);
//        void write(String str)д���ַ�����
        fw.write("��ʢ�����");
//        void write(String str, int off, int len) д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
        fw.write("��ʢ�����",3,2);

        fw.close();
    }
}
