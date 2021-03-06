package demo39ComputerNetwork.TcpActualzation.Text.betterText;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author : Bojack
 * @date : Created in 17:02 2022.02.25
 */
public class betterTcpServer {
    public static void main(String[] args) throws IOException {
//        创建一个服务器ServerSocket对象,和系统要指定的端口号
        ServerSocket server = new ServerSocket(9889);
//        使服务器一直开启，一直处于监听状态
        while (true) {
//        使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
            Socket socket = server.accept();
//            一旦捕获到客户端请求对象就开启一个线程储存文件
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
//         记录上传所用时间
                        long l = System.currentTimeMillis();
//        使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
//        创建一个随机名字，使得服务器可以一直储存来自客户端上传的文件
                        String filename = "self" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
//        创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(("Block_Horse/src/demo39ComputerNetwork/TcpActualzation/Text/") + filename);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {//使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
                            fos.write(bytes, 0, len);//使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
                        }
//        使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();
//        向客户端发送已经储存的信号
                        os.write("已收到，储存完毕！".getBytes());
                        //        关闭资源
                        fos.close();
                        socket.close();
                        //        记录服务器储存所用时间
                        long l1 = System.currentTimeMillis();
                        System.out.println("服务器储存所用时间" + (l1 - l));
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
