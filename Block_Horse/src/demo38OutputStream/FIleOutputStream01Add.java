package demo38OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 14:31 2022.01.01
 *     追加写/续写:使用两个参数的构造方法
 *         FileOutputStream(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *         FileOutputStream(File file, boolean append) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *         参数:
 *            String name,File file:写入数据的目的地
 *            boolean append:追加写开关
 *             true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
 *             false:创建一个新文件,覆盖源文件
 *     写换行:写换行符号
 *         windows:\r\n
 *         linux:/n
 *         mac:/r
 */
public class FIleOutputStream01Add {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("Block_Horse\\src\\demo38OutputStream\\text02.txt",true);
        for (int i = 0; i < 6; i++) {
            fos.write("你好！".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
