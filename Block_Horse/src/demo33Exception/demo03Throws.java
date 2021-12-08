package demo33Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 19:37 2021.12.08
 * throws�ؼ���:�쳣����ĵ�һ�ַ�ʽ,�������˴���
 * ����:
 * �������ڲ��׳��쳣�����ʱ��,��ô���Ǿͱ��봦������쳣����
 * ����ʹ��throws�ؼ��ִ����쳣����,����쳣���������׳��������ĵ����ߴ���(�Լ�������,�����˴���),���ս���JVM����-->�жϴ���
 * ʹ�ø�ʽ:�ڷ�������ʱʹ��
 * ���η� ����ֵ���� ������(�����б�) throws AAAExcepiton,BBBExcepiton...{
 * throw new AAAExcepiton("����ԭ��");
 * throw new BBBExcepiton("����ԭ��");
 * ...
 * }
 * ע��:
 * 1.throws�ؼ��ֱ���д�ڷ���������
 * 2.throws�ؼ��ֺ���������쳣������Exception������Exception������
 * 3.�����ڲ�����׳��˶���쳣����,��ôthrows��߱���Ҳ��������쳣
 * ����׳��Ķ���쳣�������Ӹ����ϵ,��ôֱ�����������쳣����
 * 4.������һ�������׳��쳣�ķ���,���Ǿͱ���Ĵ����������쳣
 * Ҫô����ʹ��throws�����׳�,���������ĵ����ߴ���,���ս���JVM
 * Ҫôtry...catch�Լ������쳣
 */
public class demo03Throws {
    //    FileNotFoundException extends IOException extends Excepiton
    //    ����׳��Ķ���쳣�������Ӹ����ϵ,��ôֱ�����������쳣����
    public static void main(String[] args) throws IOException, FileNotFoundException {
        demo("C:\\a.txt");
    }

    /*
         ����һ������,�Դ��ݵ��ļ�·�����кϷ����ж�
         ���·������"c:\\a.txt",��ô���Ǿ��׳��ļ��Ҳ����쳣����,��֪�����ĵ�����
         ע��:
             FileNotFoundException�Ǳ����쳣,�׳��˱����쳣,�ͱ��봦������쳣
             ����ʹ��throws���������׳�FileNotFoundException����쳣����,�÷����ĵ����ߴ���
      */
    public  static void demo(String filename) throws IOException, FileNotFoundException {
        if (!filename.equals("C:\\a.txt")) {
            throw new FileNotFoundException("�޷��ҵ����ļ�");
        }
        System.out.println("�ļ�·����ȷ");
        //     ������ݵ�·��,����.txt��β
        //     ��ô���Ǿ��׳�IO�쳣����,��֪�����ĵ�����,�ļ��ĺ�׺������
        if (!filename.endsWith(".txt")) {
            throw new IOException("�ļ���׺������");
        }
        System.out.println("�ļ���׺����ȷ");
    }
}
