package demo38IOStream.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:00 2022.01.02
 * ��д�ͻ���
 *     ��д,׷��д:ʹ�����������Ĺ��췽��
 *         FileWriter(String fileName, boolean append)
 *         FileWriter(File file, boolean append)
 *         ����:
 *             String fileName,File file:д�����ݵ�Ŀ�ĵ�
 *             boolean append:��д���� true:���ᴴ���µ��ļ�����Դ�ļ�,������д; false:�����µ��ļ�����Դ�ļ�
 *      ����:���з���
 *         windows:\r\n
 *         linux:/n
 *         mac:/r
 */
public class demo02FileWriterAdd {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt",true);
        for (int i = 0; i <4 ; i++) {
            fw.write("Helle!shephen!"+"\r\n");
        }
        fw.close();

    }
}
