package demo45Annotations.Peactice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 22:20 2022.03.10
 * * �򵥵Ĳ��Կ��
 * *  * ��������ִ�к󣬻��Զ����б��������з���(����Checkע��ķ���)���жϷ����Ƿ����쳣����¼���ļ���
 */
public class CatchBugText {
    public static void main(String[] args) throws IOException {
        //1.��������������
        Calculator cal = new Calculator();
        //2.��ȡ�ֽ����ļ�����
        Class cls = cal.getClass();
        //��ȡ���з�����
        Method[] methods = cls.getMethods();
        //��¼bug���ֵĴ���
        int nums = 0;
        //��ȡһ�������ֽڻ��������
        BufferedWriter bw = new BufferedWriter(new FileWriter("Block_Horse/src/demo45Annotations/Peactice/Bug.txt"));
        //�������з���
        for (Method method : methods) {
            //����������ﺬ��Checkע�⣬�����и÷�����
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {//ץȡ�����쳣������ӡ
                    bw.write(method.getName() + "���������쳣");
                    bw.newLine();
                    bw.write("�쳣������Ϊ��" + e.getCause());
                    bw.newLine();
                    bw.write("�쳣��ԭ��Ϊ��" + e.getCause().getMessage());
                    System.out.println("==========================");
                    bw.newLine();
                    nums++;
                }
            }
        }
        bw.write("�������г���" + nums + "���쳣");
        bw.flush();
        bw.close();
    }
}
