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
        //服务器向系统请求端口9999
        ServerSocket server=new ServerSocket(9999);
        while (true) {
            //使用server中的accept方法获取浏览器端请求对象socket
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //使用socket中的方法getOutputStream方法获取网络输入流对象is
                        InputStream is = socket.getInputStream();
                        //把网络字节输入流转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来 GET /11_Net/web/index.html HTTP/1.1进行切割
                        //先用split方法以空格分成3部分，取得第二部分，
                        String[] s = br.readLine().split(" ");
                        //将取得的第二部分用substring方法去除切割/,只取其地址部分，得到文件路径名。
                        String filename = s[1].substring(1);
                        //使用本地输入流读取获取到的文件路径名中的文件
                        FileInputStream fs = new FileInputStream(filename);
                        //使用socket中的方法OutputStream输出要输出的对象os
                        OutputStream os = socket.getOutputStream();
                        // 写入HTTP协议响应头,固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[10024];
                        while ((len = fs.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        //添加结束标记
//                        socket.shutdownOutput();
                        //关闭资源
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
//        while((len=is.read(bytes))!=-1){//使用read方法读取is的内容到bytes数组中
//            System.out.println(new String(bytes,0,len));
//        }
    }
}
