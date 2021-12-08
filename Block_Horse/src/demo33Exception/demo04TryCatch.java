package demo33Exception;

import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 19:54 2021.12.08
 * try...catch:�쳣����ĵڶ��ַ�ʽ,�Լ������쳣
 * ��ʽ:
 * try{
 * ���ܲ����쳣�Ĵ���
 * }catch(����һ���쳣�ı���,��������try���׳����쳣����){
 * �쳣�Ĵ����߼�,�쳣�쳣����֮��,��ô�����쳣����
 * һ���ڹ�����,����쳣����Ϣ��¼��һ����־��
 * }
 * ...
 * catch(�쳣���� ������){
 * }
 * ע��:
 * 1.try�п��ܻ��׳�����쳣����,��ô�Ϳ���ʹ�ö��catch��������Щ�쳣����
 * 2.���try�в������쳣,��ô�ͻ�ִ��catch�е��쳣�����߼�,ִ�����catch�еĴ����߼�,����ִ��try...catch֮��Ĵ���
 * ���try��û�в����쳣,��ô�Ͳ���ִ��catch���쳣�Ĵ����߼�,ִ����try�еĴ���,����ִ��try...catch֮��Ĵ���
 */
public class demo04TryCatch {
    public static void main(String[] args) {
        try {
            demo("C:\\aa.txt");
        } catch (FileNotFoundException e) {
             /*
                Throwable���ж�����3���쳣����ķ���
                 String getMessage() ���ش� throwable �ļ��������
                 String toString() ���ش� throwable ����ϸ��Ϣ�ַ�����
                 void printStackTrace()  JVM��ӡ�쳣����,Ĭ�ϴ˷���,��ӡ���쳣��Ϣ����ȫ���
             */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("��������");
    }

    public static void demo(String filename) throws FileNotFoundException {
        if (!filename.equals("C:\\a.txt")) {
            throw new FileNotFoundException("�޷��ҵ����ļ�");
        }
        System.out.println("�ļ�·����ȷ");
    }
}
