package demo38IOStream.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author : Bojack
 * @date : Created in 13:41 2022.02.25
 *  ���Ըı��������Ŀ�ĵ�(��ӡ��������)
 *     ������,Ĭ���ڿ���̨���
 *     ʹ��System.setOut�����ı��������Ŀ�ĵظ�Ϊ�����д��ݵĴ�ӡ����Ŀ�ĵ�
 *         static void setOut(PrintStream out)
 *           ���·��䡰��׼���������
 */
public class Print02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("���ڿ���̨������");
        PrintStream ps=new PrintStream("Block_Horse/src/demo38IOStream/PrintStream/print02.txt");
        System.setOut(ps);
        ps.println("���ڴ�ӡ����Ŀ�ĵ����");
        ps.close();
    }
}
