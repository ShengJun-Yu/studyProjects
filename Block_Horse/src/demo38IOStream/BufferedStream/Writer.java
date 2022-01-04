package demo38IOStream.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:00 2022.01.03
 * java.io.BufferedWriter extends Writer
 * BufferedWriter:�ַ����������
 * <p>
 * �̳��Ը���Ĺ��Գ�Ա����:
 * - void write(int c) д�뵥���ַ���
 * - void write(char[] cbuf)д���ַ����顣
 * - abstract  void write(char[] cbuf, int off, int len)д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 * - void write(String str)д���ַ�����
 * - void write(String str, int off, int len) д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 * - void flush()ˢ�¸����Ļ��塣
 * - void close() �رմ�������Ҫ��ˢ������
 * <p>
 * ���췽��:
 * BufferedWriter(Writer out) ����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ��������
 * BufferedWriter(Writer out, int sz) ����һ��ʹ�ø�����С������������»����ַ��������
 * ����:
 * Writer out:�ַ������
 * ���ǿ��Դ���FileWriter,���������FileWriter����һ��������,���FileWriter��д��Ч��
 * int sz:ָ���������Ĵ�С,��дĬ�ϴ�С
 * <p>
 * ���еĳ�Ա����:
 * void newLine() д��һ���зָ���������ݲ�ͬ�Ĳ���ϵͳ,��ȡ��ͬ���зָ���
 * ����:���з���
 * windows:\r\n
 * linux:/n
 * mac:/r
 * ʹ�ò���:
 * 1.�����ַ��������������,���췽���д����ַ������
 * 2.�����ַ�����������еķ���write,������д�뵽�ڴ滺������
 * 3.�����ַ�����������еķ���flush,���ڴ滺�����е�����,ˢ�µ��ļ���
 * 4.�ͷ���Դ
 */
public class Writer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Block_Horse/src/demo38IOStream/BufferedStream/write.txt"));
        for (int i = 0; i <10 ; i++) {
            bw.write("��ʢ�����");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
