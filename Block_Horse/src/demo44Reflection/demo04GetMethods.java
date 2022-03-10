package demo44Reflection;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author : Bojack
 * @date : Created in 20:12 2022.03.09
 */
public class demo04GetMethods {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建Properties对象
        Properties p=new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
//        ClassLoader getClassLoader() 返回类的类加载器。
        ClassLoader cl = demo04GetMethods.class.getClassLoader();
//        InputStream getResourceAsStream(String name)返回用于读取指定资源的输入流。
        InputStream is = cl.getResourceAsStream("demo44Reflection/pro.properties");
//        void load(InputStream inStream)从输入字节流读取属性列表（键和元素对）。
        p.load(is);
        //2.获取配置文件中定义的数据
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        //3.加载该类进内存
//        static clsaa<?> forName(String className)返回与给定字符串名称的类或接口相关联的 类对象。
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
