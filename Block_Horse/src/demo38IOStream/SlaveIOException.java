package demo38IOStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:21 2022.01.02   在jdk1.7之前使用try catch finally 处理流中的异常
 * 格式:
 * try{
 * 可能会产出异常的代码
 * }catch(异常类变量 变量名){
 * 异常的处理逻辑
 * }finally{
 * 一定会指定的代码
 * 资源释放
 * }
 */
public class SlaveIOException {
    public static void main(String[] args) {
        FileWriter fw= null;
        try {
            fw = new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt");
            fw.write("处理异常");
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
