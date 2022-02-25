package demo39ComputerNetwork.TcpActualzation.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : Bojack
 * @date : Created in 16:49 2022.02.25
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/Bojack.png");
        Socket socket=new Socket("127.0.0.1",9889);
        OutputStream os = socket.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        InputStream is = socket.getInputStream();

        byte[] bytes1=new byte[1024];
        int read = is.read(bytes1);
        System.out.println(new String(bytes1,0,read));

        fis.close();
        socket.close();

        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
