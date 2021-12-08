package demo33Exception;

import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 20:20 2021.12.08
 * finally代码块
 * 格式:
 * try{
 * 可能产生异常的代码
 * }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 * 异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 * 一般在工作中,会把异常的信息记录到一个日志中
 * }
 * ...
 * catch(异常类名 变量名){
 * <p>
 * }finally{
 * 无论是否出现异常都会执行
 * }
 * 注意:
 * 1.finally不能单独使用,必须和try一起使用
 * 2.finally一般用于资源释放(资源回收),无论程序是否出现异常,最后都要资源释放(IO)
 */
public class demo05Finally {
    public static void main(String[] args) {
        try {
            demo("C:aa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {//无论是否出现异常,都会执行
            System.out.println("资源释放");
        }

    }

    public static void demo(String filename) throws FileNotFoundException {
        if (!filename.equals("C:\\a.txt")) {
            throw new FileNotFoundException("无法找到该文件");
        }
        System.out.println("文件路径正确");
    }

}
