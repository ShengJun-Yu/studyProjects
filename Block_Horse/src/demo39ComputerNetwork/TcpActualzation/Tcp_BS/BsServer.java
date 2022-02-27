package demo39ComputerNetwork.TcpActualzation.Tcp_BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 20:57 2022.02.26
 */
public class BsServer {
    public static void main(String[] args) throws IOException {
        //��������ϵͳ����˿�9999
        ServerSocket server=new ServerSocket(9999);
        while (true) {
            //ʹ��server�е�accept������ȡ��������������socket
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //ʹ��socket�еķ���getOutputStream������ȡ��������������is
                        InputStream is = socket.getInputStream();
                        //�������ֽ�������ת��Ϊ�ַ�����������
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //�ѿͻ���������Ϣ�ĵ�һ�ж�ȡ���� GET /11_Net/web/index.html HTTP/1.1�����и�
                        //����split�����Կո�ֳ�3���֣�ȡ�õڶ����֣�
                        String[] s = br.readLine().split(" ");
                        //��ȡ�õĵڶ�������substring����ȥ���и�/,ֻȡ���ַ���֣��õ��ļ�·������
                        String filename = s[1].substring(1);
                        //ʹ�ñ�����������ȡ��ȡ�����ļ�·�����е��ļ�
                        FileInputStream fs = new FileInputStream(filename);
                        //ʹ��socket�еķ���OutputStream���Ҫ����Ķ���os
                        OutputStream os = socket.getOutputStream();
                        // д��HTTPЭ����Ӧͷ,�̶�д��
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // ����Ҫд�����,���������������
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[10024];
                        while ((len = fs.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        //��ӽ������
//                        socket.shutdownOutput();
                        //�ر���Դ
                        fs.close();
                        socket.close();
//                        server.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        int len=0;
//        byte [] bytes=new byte[1024];
//        while((len=is.read(bytes))!=-1){//ʹ��read������ȡis�����ݵ�bytes������
//            System.out.println(new String(bytes,0,len));
//        }
    }
}
