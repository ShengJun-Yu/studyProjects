package demo39ComputerNetwork.TcpActualzation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 15:16 2022.02.25
 * TCPͨ�ŵķ�������:���տͻ��˵�����,��ȡ�ͻ��˷��͵�����,���ͻ��˻�д����
 * ��ʾ����������:
 * java.net.ServerSocket:����ʵ�ַ������׽��֡�
 * <p>
 * ���췽��:
 * ServerSocket(int port) �����󶨵��ض��˿ڵķ������׽��֡�
 * <p>
 * �������˱�����ȷһ������,�����֪�����ĸ��ͻ�������ķ�����
 * ���Կ���ʹ��accept������ȡ������Ŀͻ��˶���Socket
 * ��Ա����:
 * Socket accept() ���������ܵ����׽��ֵ����ӡ�
 * <p>
 * ��������ʵ�ֲ���:
 * 1.����������ServerSocket�����ϵͳҪָ���Ķ˿ں�
 * 2.ʹ��ServerSocket�����еķ���accept,��ȡ������Ŀͻ��˶���Socket
 * 3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
 * 4.ʹ�������ֽ�������InputStream�����еķ���read,��ȡ�ͻ��˷��͵�����
 * 5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
 * 6.ʹ�������ֽ������OutputStream�����еķ���write,���ͻ��˻�д����
 * 7.�ͷ���Դ(Socket,ServerSocket)
 */
public class tcpServer {
    public static void main(String[] args) throws IOException {
//        1.����������ServerSocket�����ϵͳҪָ���Ķ˿ں�
        ServerSocket ssk = new ServerSocket(8080);
//        2.ʹ��ServerSocket�����еķ���accept,��ȡ������Ŀͻ��˶���Socket
        Socket socket = ssk.accept();
//        3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
        InputStream inputStream = socket.getInputStream();
//        4.ʹ�������ֽ�������InputStream�����еķ���read,��ȡ�ͻ��˷��͵�����
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));
//        5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("���Ƿ����������Ѿ��յ���лл".getBytes());

//        InputStream inputStream1 = socket.getInputStream();
//        byte[] bytes1 = new byte[1024];
//        int read1 = inputStream.read();
//        System.out.println(new String(bytes1,0,read1));


        ssk.close();
        socket.close();
    }
}
