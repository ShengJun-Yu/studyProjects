package demo38IOStream.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author : Bojack
 * @date : Created in 13:41 2022.02.25
 *  可以改变输出语句的目的地(打印流的流向)
 *     输出语句,默认在控制台输出
 *     使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 *         static void setOut(PrintStream out)
 *           重新分配“标准”输出流。
 */
public class Print02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出语句");
        PrintStream ps=new PrintStream("Block_Horse/src/demo38IOStream/PrintStream/print02.txt");
        System.setOut(ps);
        ps.println("我在打印流的目的地输出");
        ps.close();
    }
}
