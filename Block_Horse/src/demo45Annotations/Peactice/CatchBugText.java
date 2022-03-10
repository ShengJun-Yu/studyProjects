package demo45Annotations.Peactice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 22:20 2022.03.10
 * * 简单的测试框架
 * *  * 当主方法执行后，会自动自行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 */
public class CatchBugText {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator cal = new Calculator();
        //2.获取字节码文件对象
        Class cls = cal.getClass();
        //获取所有方法名
        Method[] methods = cls.getMethods();
        //记录bug出现的次数
        int nums = 0;
        //获取一个本地字节缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Block_Horse/src/demo45Annotations/Peactice/Bug.txt"));
        //遍历所有方法
        for (Method method : methods) {
            //如果方法体里含有Check注解，就运行该方法。
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {//抓取所有异常，并打印
                    bw.write(method.getName() + "方法出现异常");
                    bw.newLine();
                    bw.write("异常的名称为：" + e.getCause());
                    bw.newLine();
                    bw.write("异常的原因为：" + e.getCause().getMessage());
                    System.out.println("==========================");
                    bw.newLine();
                    nums++;
                }
            }
        }
        bw.write("本次运行出现" + nums + "次异常");
        bw.flush();
        bw.close();
    }
}
