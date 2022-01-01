package demo38OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 15:46 2022.01.01
 * �ֽ�������һ�ζ�ȡ����ֽڵķ���:
 * int read(byte[] b) ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
 * ��ȷ��������:
 * 1.�����Ĳ���byte[]������?
 * �𵽻�������,�洢ÿ�ζ�ȡ���Ķ���ֽ�
 * ����ĳ���һ�Ѷ���Ϊ1024(1kb)����1024��������
 * 2.�����ķ���ֵint��ʲô?
 * ÿ�ζ�ȡ����Ч�ֽڸ���
 * <p>
 * String��Ĺ��췽��
 * String(byte[] bytes) :���ֽ�����ת��Ϊ�ַ���
 * String(byte[] bytes, int offset, int length) ���ֽ������һ����ת��Ϊ�ַ��� offset:����Ŀ�ʼ���� length:ת�����ֽڸ���
 */
public class FileInputStream01Add {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt");
//        int read(byte[] b) ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
//        byte[] by=new byte[2];
//        int len = fis.read(by);
//        System.out.println(len);//��ȡ�ĳ���
////        String(byte[] bytes) :���ֽ�����ת��Ϊ�ַ���
//        System.out.println(new String(by));

        byte[] by = new byte[1024];
        int len = 0;//len:��Ч�ֽڸ���
        while ((len = fis.read(by)) != -1) {
//   String(byte[] bytes, int offset, int length) ���ֽ������һ����ת��Ϊ�ַ��� offset:����Ŀ�ʼ���� length:ת�����ֽڸ���
            System.out.println(new String(by, 0, len));
        }


//        int lenth=0;
//        int len1=0;
//        while((len1=fis.read())!=-1){
//            lenth++;
//        }
//        FileInputStream fis1=new FileInputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt");
//        byte[] all=new byte[lenth];
//        fis1.read(all);
//        System.out.println(new String(all));
        fis.close();
    }
}
