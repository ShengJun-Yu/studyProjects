package demo38IOStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:21 2022.01.02   在jdk1.7之前使用try catch finally 处理流中的异常
 * JDK7的新特性
 * 在try的后边可以增加一个(),在括号中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try中的代码执行完毕,会自动把流对象释放,不用写finally
 * 格式:
 * try(定义流对象;定义流对象....){
 * 可能会产出异常的代码
 * }catch(异常类变量 变量名){
 * 异常的处理逻辑
 * }
 */
public class SlaveIOExceptionJDK7 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt")) {
            fw.write("处理异常");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
