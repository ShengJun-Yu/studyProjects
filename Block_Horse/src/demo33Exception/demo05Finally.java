package demo33Exception;

import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 20:20 2021.12.08
 * finally�����
 * ��ʽ:
 * try{
 * ���ܲ����쳣�Ĵ���
 * }catch(����һ���쳣�ı���,��������try���׳����쳣����){
 * �쳣�Ĵ����߼�,�쳣�쳣����֮��,��ô�����쳣����
 * һ���ڹ�����,����쳣����Ϣ��¼��һ����־��
 * }
 * ...
 * catch(�쳣���� ������){
 * <p>
 * }finally{
 * �����Ƿ�����쳣����ִ��
 * }
 * ע��:
 * 1.finally���ܵ���ʹ��,�����tryһ��ʹ��
 * 2.finallyһ��������Դ�ͷ�(��Դ����),���۳����Ƿ�����쳣,���Ҫ��Դ�ͷ�(IO)
 */
public class demo05Finally {
    public static void main(String[] args) {
        try {
            demo("C:aa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {//�����Ƿ�����쳣,����ִ��
            System.out.println("��Դ�ͷ�");
        }

    }

    public static void demo(String filename) throws FileNotFoundException {
        if (!filename.equals("C:\\a.txt")) {
            throw new FileNotFoundException("�޷��ҵ����ļ�");
        }
        System.out.println("�ļ�·����ȷ");
    }

}
