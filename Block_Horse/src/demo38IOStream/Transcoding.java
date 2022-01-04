package demo38IOStream;

import java.io.*;

/**
 * @author : Bojack
 * @date : Created in 18:22 2022.01.03
 * <p>
 * ��ϰ��ת���ļ�����
 * ��GBK������ı��ļ���ת��ΪUTF-8������ı��ļ���
 * <p>
 * ����:
 * 1.����InputStreamReader����,���췽���д����ֽ���������ָ���ı��������GBK
 * 2.����OutputStreamWriter����,���췽���д����ֽ��������ָ���ı��������UTF-8
 * 3.ʹ��InputStreamReader�����еķ���read��ȡ�ļ�
 * 4.ʹ��OutputStreamWriter�����еķ���write,�Ѷ�ȡ������д�뵽�ļ���
 * 5.�ͷ���Դ
 */
public class Transcoding {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new BufferedInputStream(new FileInputStream("Block_Horse/src/demo38IOStream/Practice01.txt")),
                "gbk");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("Block_Horse/src/demo38IOStream/Practice01Utf-8.txt"),
                "utf-8");
        int len=0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
