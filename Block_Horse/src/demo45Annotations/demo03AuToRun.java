package demo45Annotations;

import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 20:12 2022.03.09
 * ǰ�᣺���ܸı������κδ��롣���Դ���������Ķ��󣬿���ִ�����ⷽ��
 */
@SuppressWarnings("all")
@dmeo03Annot(className = "demo45Annotations.Apush", methodName = "push")
public class demo03AuToRun {
    public static void main(String[] args) throws Exception {
        //1.����ע��
        //1.1��ȡ������ֽ����ļ�����
        Class<demo03AuToRun> demo03AuToRunClass = demo03AuToRun.class;
        //2.��ȡ�ϱߵ�ע�����
        //��ʵ�������ڴ���������һ����ע��ӿڵ�����ʵ�ֶ���
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
        //3.����ע������ж���ĳ��󷽷�����ȡ����ֵ
        String className = demo.className();
        String methodName = demo.methodName();


        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
