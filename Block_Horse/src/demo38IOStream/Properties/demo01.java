package demo38IOStream.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 17:00 2022.01.02
 * java.util.Properties���� extends Hashtable<k,v> implements Map<k,v>
 * Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء�
 * Properties������һ��Ψһ��IO�����ϵļ���
 * ����ʹ��Properties�����еķ���store,�Ѽ����е���ʱ����,�־û�д�뵽Ӳ���д洢
 * ����ʹ��Properties�����еķ���load,��Ӳ���б�����ļ�(��ֵ��),��ȡ��������ʹ��
 * <p>
 * �����б���ÿ���������Ӧֵ����һ���ַ�����
 * Properties������һ��˫�м���,key��valueĬ�϶����ַ���
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        chun();
        chunHarddisk();
    }
    /*
        ����ʹ��Properties�����еķ���store,�Ѽ����е���ʱ����,�־û�д�뵽Ӳ���д洢
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        ����:
            OutputStream out:�ֽ������,����д������
            Writer writer:�ַ������,����д����
            String comments:ע��,��������˵��������ļ�����ʲô�õ�
                    ����ʹ������,���������,Ĭ����Unicode����
                    һ��ʹ��""���ַ���

        ʹ�ò���:
            1.����Properties���϶���,�������
            2.�����ֽ������/�ַ����������,���췽���а�Ҫ�����Ŀ�ĵ�
            3.ʹ��Properties�����еķ���store,�Ѽ����е���ʱ����,�־û�д�뵽Ӳ���д洢
            4.�ͷ���Դ
     */
    private static void chunHarddisk() throws IOException {
//        1.����Properties���϶���,�������
        Properties p = new Properties();
        p.setProperty("stephen", "21");
        p.setProperty("Rilly", "21");
        p.setProperty("Bojack", "21");
//        2.�����ֽ������/�ַ����������,���췽���а�Ҫ�����Ŀ�ĵ�
        FileWriter fw=new FileWriter("Block_Horse/src/demo38IOStream/Properties/demo01.txt");
//        3.ʹ��Properties�����еķ���store,�Ѽ����е���ʱ����,�־û�д�뵽Ӳ���д洢 comments:ע��,
        p.store(fw,"YuShengJun Save Data");
//        4.�ͷ���Դ
        fw.close();
    }

    /*
        ʹ��Properties���ϴ洢����,����ȡ��Properties�����е�����
        Properties������һ��˫�м���,key��valueĬ�϶����ַ���
        Properties������һЩ�����ַ��������з���
     Object setProperty(String key, String value) ���� Hashtable �ķ��� put��
     String getProperty(String key) ͨ��key�ҵ�valueֵ,�˷����൱��Map�����е�get(key)����
     Set<String> stringPropertyNames() ���ش������б��еļ��������иü������Ӧֵ���ַ���,�˷����൱��Map�����е�keySet����
     */
    private static void chun() {
        Properties p = new Properties();
        p.setProperty("stephen", "21");
        p.setProperty("Rilly", "21");
        p.setProperty("Bojack", "21");
//    Set<String> stringPropertyNames() ���ش������б��еļ��������иü������Ӧֵ���ַ���,�˷����൱��Map�����е�keySet����
        Set<String> s = p.stringPropertyNames();
        for (String str: s) {
            System.out.println(str+"����"+p.getProperty(str));
        }
    }

}
