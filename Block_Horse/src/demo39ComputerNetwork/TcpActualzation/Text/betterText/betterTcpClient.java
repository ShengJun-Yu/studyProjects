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
 * 文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据
 * <p>
 * 明确:
 * 数据源:c:\\1.jpg
 * 目的地:服务器
 */
public class betterTcpClient {
    public static void main(String[] args) throws IOException {
//        记录上传所用时间
        long l = System.currentTimeMillis();
//        客户端创建本地流绑定要读取的文件
        FileInputStream fis = new FileInputStream("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/Bojack.png");
//        创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 9889);
//        使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;//表示有效字符长度，读到最后时数值为-1
        while ((len = fis.read(bytes)) != -1) {//一次读一个bytes长度的字符，储存的到bytes数组中
            os.write(bytes, 0, len);//使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
        }
        /*
        问题：如此上传文件无法上传文件终止符。会导致文件上传阻塞，
        解决方法:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

//        使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int read = is.read(bytes1);
        System.out.println(new String(bytes1, 0, read));
//        关闭资源
        fis.close();
        socket.close();
//        记录上传所用时间
        long l1 = System.currentTimeMillis();
        System.out.println("上传所用时间为" + (l1 - l));
    }
}
