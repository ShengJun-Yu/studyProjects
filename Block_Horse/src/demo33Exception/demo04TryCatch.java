package demo33Exception;

import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 19:54 2021.12.08
 * try...catch:异常处理的第二种方式,自己处理异常
 * 格式:
 * try{
 * 可能产生异常的代码
 * }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 * 异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 * 一般在工作中,会把异常的信息记录到一个日志中
 * }
 * ...
 * catch(异常类名 变量名){
 * }
 * 注意:
 * 1.try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
 * 2.如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
 * 如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 */
public class demo04TryCatch {
    public static void main(String[] args) {
        try {
            demo("C:\\aa.txt");
        } catch (FileNotFoundException e) {
             /*
                Throwable类中定义了3个异常处理的方法
                 String getMessage() 返回此 throwable 的简短描述。
                 String toString() 返回此 throwable 的详细消息字符串。
                 void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的
             */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("后续代码");
    }

    public static void demo(String filename) throws FileNotFoundException {
        if (!filename.equals("C:\\a.txt")) {
            throw new FileNotFoundException("无法找到该文件");
        }
        System.out.println("文件路径正确");
    }
}
