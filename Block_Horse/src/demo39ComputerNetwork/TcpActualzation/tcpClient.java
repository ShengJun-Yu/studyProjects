package demo39ComputerNetwork.TcpActualzation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 15:08 2022.02.25
 * TCPͨ�ŵĿͻ���:�������������������,����������������,��ȡ��������д������
 * ��ʾ�ͻ��˵���:
 * java.net.Socket:����ʵ�ֿͻ����׽��֣�Ҳ���ԾͽС��׽��֡������׽�������̨������ͨ�ŵĶ˵㡣
 * �׽���:������IP��ַ�Ͷ˿ںŵ����絥λ
 * <p>
 * ���췽��:
 * Socket(String host, int port) ����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ںš�
 * ����:
 * String host:����������������/��������IP��ַ
 * int port:�������Ķ˿ں�
 * <p>
 * ��Ա����:
 * OutputStream getOutputStream() ���ش��׽��ֵ��������
 * InputStream getInputStream() ���ش��׽��ֵ���������
 * void close() �رմ��׽��֡�
 * <p>
 * ʵ�ֲ���:
 * 1.����һ���ͻ��˶���Socket,���췽���󶨷�������IP��ַ�Ͷ˿ں�
 * 2.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
 * 3.ʹ�������ֽ������OutputStream�����еķ���write,����������������
 * 4.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
 * 5.ʹ�������ֽ�������InputStream�����еķ���read,��ȡ��������д������
 * 6.�ͷ���Դ(Socket)
 * ע��:
 * 1.�ͻ��˺ͷ������˽��н���,����ʹ��Socket���ṩ��������,����ʹ���Լ�������������
 * 2.�����Ǵ����ͻ��˶���Socket��ʱ��,�ͻ�ȥ����������ͷ���������3�����ֽ�������ͨ·
 * ��ʱ���������û������,��ô�ͻ��׳��쳣ConnectException: Connection refused: connect
 * ����������Ѿ�����,��ô�Ϳ��Խ��н�����
 */
public class tcpClient {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = sk.getOutputStream();
        outputStream.write("���ǿͻ��ˣ���÷�����".getBytes());

        InputStream inputStream = sk.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));

//        OutputStream outputStream1 = sk.getOutputStream();
//        outputStream1.write("���ǿͻ��ˣ�����ȷ������".getBytes());
//

        sk.close();


    }
}
