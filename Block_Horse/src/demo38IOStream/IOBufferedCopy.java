package demo38IOStream;

import java.io.*;

/**
 * @author : Bojack
 * @date : Created in 15:39 2022.01.03
 * ��ȷ:
 *         ����Դ: c:\\1.jpg
 *         ���ݵ�Ŀ�ĵ�: d:\\1.jpg
 *     �ļ����ƵĲ���:
 *         1.�����ֽڻ�������������,���췽���д����ֽ�������
 *         2.�����ֽڻ������������,���췽���д����ֽ������
 *         3.ʹ���ֽڻ��������������еķ���read,��ȡ�ļ�
 *         4.ʹ���ֽڻ���������еķ���write,�Ѷ�ȡ������д�뵽�ڲ���������
 *         5.�ͷ���Դ(���Ȱѻ������е�����,ˢ�µ��ļ���)
 */
public class IOBufferedCopy {
    public static void main(String[] args) throws IOException {
        long b = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("D:\\###AAA�����ļ�233333\\����\\���˼���.docx");
        FileOutputStream fos = new FileOutputStream("Block_Horse/src/demo38IOStream/text04.zip");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len=0;
        while((len=bis.read())!=-1) {
            bos.write(len);
        }
//        byte[] by = new byte[1024000000];
//        int len = bis.read(by);
//        bos.write(by, 0, len);
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
