package demo39ComputerNetwork.TcpActualzation.Text.betterText;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 16:49 2022.02.25
 * <p>
 * �ļ��ϴ������Ŀͻ���:��ȡ�����ļ�,�ϴ���������,��ȡ��������д������
 * <p>
 * ��ȷ:
 * ����Դ:c:\\1.jpg
 * Ŀ�ĵ�:������
 */
public class betterTcpClient {
    public static void main(String[] args) throws IOException {
//        ��¼�ϴ�����ʱ��
        long l = System.currentTimeMillis();
//        �ͻ��˴�����������Ҫ��ȡ���ļ�
        FileInputStream fis = new FileInputStream("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/Bojack.png");
//        ����һ���ͻ���Socket����,���췽���а󶨷�������IP��ַ�Ͷ˿ں�
        Socket socket = new Socket("127.0.0.1", 9889);
//        ʹ�ñ����ֽ�������FileInputStream�����еķ���read,��ȡ�����ļ�
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;//��ʾ��Ч�ַ����ȣ��������ʱ��ֵΪ-1
        while ((len = fis.read(bytes)) != -1) {//һ�ζ�һ��bytes���ȵ��ַ�������ĵ�bytes������
            os.write(bytes, 0, len);//ʹ�������ֽ������OutputStream�����еķ���write,�Ѷ�ȡ�����ļ��ϴ���������
        }
        /*
        ���⣺����ϴ��ļ��޷��ϴ��ļ���ֹ�����ᵼ���ļ��ϴ�������
        �������:�ϴ����ļ�,��������дһ���������
            void shutdownOutput() ���ô��׽��ֵ��������
            ���� TCP �׽��֣��κ���ǰд������ݶ��������ͣ����Һ�� TCP ������������ֹ���С�
         */
        socket.shutdownOutput();

//        ʹ�������ֽ�������InputStream�����еķ���read��ȡ�����д������
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int read = is.read(bytes1);
        System.out.println(new String(bytes1, 0, read));
//        �ر���Դ
        fis.close();
        socket.close();
//        ��¼�ϴ�����ʱ��
        long l1 = System.currentTimeMillis();
        System.out.println("�ϴ�����ʱ��Ϊ" + (l1 - l));
    }
}
