package demo38IOStream.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:28 2022.01.02
 * <p>
 * java.io.Writer:�ַ������,�������ַ�����������ĸ���,��һ��������
 * <p>
 * ���Եĳ�Ա����:
 * - void write(int c) д�뵥���ַ���
 * - void write(char[] cbuf)д���ַ����顣
 * - abstract  void write(char[] cbuf, int off, int len)д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 * - void write(String str)д���ַ�����
 * - void write(String str, int off, int len) д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 * - void flush()ˢ�¸����Ļ��塣
 * - void close() �رմ�������Ҫ��ˢ������
 * <p>
 * java.io.FileWriter extends OutputStreamWriter extends Writer
 * FileWriter:�ļ��ַ������
 * ����:���ڴ����ַ�����д�뵽�ļ���
 * <p>
 * ���췽��:
 * FileWriter(File file)���ݸ����� File ������һ�� FileWriter ����
 * FileWriter(String fileName) ���ݸ������ļ�������һ�� FileWriter ����
 * ����:д�����ݵ�Ŀ�ĵ�
 * String fileName:�ļ���·��
 * File file:��һ���ļ�
 * ���췽��������:
 * 1.�ᴴ��һ��FileWriter����
 * 2.����ݹ��췽���д��ݵ��ļ�/�ļ���·��,�����ļ�
 * 3.���FileWriter����ָ�򴴽��õ��ļ�
 * <p>
 * �ַ��������ʹ�ò���(�ص�):
 * 1.����FileWriter����,���췽���а�Ҫд�����ݵ�Ŀ�ĵ�
 * 2.ʹ��FileWriter�еķ���write,������д�뵽�ڴ滺������(�ַ�ת��Ϊ�ֽڵĹ���)
 * 3.ʹ��FileWriter�еķ���flush,���ڴ滺�����е�����,ˢ�µ��ļ���
 * 4.�ͷ���Դ(���Ȱ��ڴ滺�����е�����ˢ�µ��ļ���)
 * flush������close����������
 *         - flush ��ˢ�»���������������Լ���ʹ�á�
 *         - close:  ��ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ�������󲻿����ٱ�ʹ���ˡ�
 */
public class demo02FileWriter {
    public static void main(String[] args) throws IOException {
//        FileWriter(File file)���ݸ����� File ������һ�� FileWriter ����
        FileWriter fw=new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read01.txt");
//        void write(int c) д�뵥���ַ���
        fw.write(65);
//        void flush()ˢ�¸����Ļ��塣flush ��ˢ�»���������������Լ���ʹ�á�
//        fw.flush();
//        void close() �رմ�������Ҫ��ˢ������ close:  ��ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ�������󲻿����ٱ�ʹ���ˡ�
        fw.close();
    }
}
