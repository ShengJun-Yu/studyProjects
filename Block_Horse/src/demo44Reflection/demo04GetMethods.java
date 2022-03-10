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
        //1.���������ļ�
        //1.1����Properties����
        Properties p=new Properties();
        //1.2���������ļ���ת��Ϊһ������
        //1.2.1��ȡclassĿ¼�µ������ļ�
//        ClassLoader getClassLoader() ����������������
        ClassLoader cl = demo04GetMethods.class.getClassLoader();
//        InputStream getResourceAsStream(String name)�������ڶ�ȡָ����Դ����������
        InputStream is = cl.getResourceAsStream("demo44Reflection/pro.properties");
//        void load(InputStream inStream)�������ֽ�����ȡ�����б�����Ԫ�ضԣ���
        p.load(is);
        //2.��ȡ�����ļ��ж��������
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        //3.���ظ�����ڴ�
//        static clsaa<?> forName(String className)����������ַ������Ƶ����ӿ�������� �����
        Class cls = Class.forName(className);
        //4.��������
        Object obj = cls.newInstance();
        //5.��ȡ��������
        Method method = cls.getMethod(methodName);
        //6.ִ�з���
        method.invoke(obj);
    }
}
