package demo39ComputerNetwork.TcpActualzation.Text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 17:02 2022.02.25
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
//                ��¼�ϴ�����ʱ��
        long l = System.currentTimeMillis();
//        ����һ��������ServerSocket����,��ϵͳҪָ���Ķ˿ں�
        ServerSocket server=new ServerSocket(9889);
//        ʹ��ServerSocket�����еķ���accept,��ȡ������Ŀͻ���Socket����
        Socket socket = server.accept();
//        ʹ��Socket�����еķ���getInputStream,��ȡ�������ֽ�������InputStream����
        InputStream is = socket.getInputStream();
//        ����һ�������ֽ������FileOutputStream����,���췽���а�Ҫ�����Ŀ�ĵ�
        FileOutputStream fos=new FileOutputStream("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/ServerBojack.png");

        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){//ʹ�������ֽ�������InputStream�����еķ���read,��ȡ�ͻ����ϴ����ļ�
            fos.write(bytes,0,len);//ʹ�ñ����ֽ������FileOutputStream�����еķ���write,�Ѷ�ȡ�����ļ����浽��������Ӳ����
        }
//        ʹ��Socket�����еķ���getOutputStream,��ȡ�������ֽ������OutputStream����
        OutputStream os = socket.getOutputStream();
//        ��ͻ��˷����Ѿ�������ź�
        os.write("���յ���������ϣ�".getBytes());
//        �ر���Դ
        fos.close();
        socket.close();
        server.close();
        //        ��¼��������������ʱ��
        long l1 = System.currentTimeMillis();
        System.out.println("��������������ʱ��"+(l1-l));
    }
}
