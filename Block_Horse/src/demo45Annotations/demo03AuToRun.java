package demo45Annotations;

import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 20:12 2022.03.09
 * 前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
 */
@SuppressWarnings("all")
@dmeo03Annot(className = "demo45Annotations.Apush", methodName = "push")
public class demo03AuToRun {
    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<demo03AuToRun> demo03AuToRunClass = demo03AuToRun.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        dmeo03Annot demo = demo03AuToRunClass.getDeclaredAnnotation(dmeo03Annot.class);
        /*
            public class demo02AnnotImpl implements demo03Annot{
                public String className(){
                    return "demo45Annotations.Apush";
                }
                public String methodName(){
                    return "push";
                }
            }
 */
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = demo.className();
        String methodName = demo.methodName();


        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
