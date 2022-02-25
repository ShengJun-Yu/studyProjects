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
        long l = System.currentTimeMillis();
        ServerSocket server=new ServerSocket(9889);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();

        FileOutputStream fos=new FileOutputStream("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/ServerBojack.png");
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("已收到，储存完毕！".getBytes());
        fos.close();
        socket.close();
        server.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
