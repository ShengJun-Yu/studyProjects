package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 18:35 2021.12.27
 *    File���ȡ���ܵķ���
 *         - public String getAbsolutePath() �����ش�File�ľ���·�����ַ�����
 *         - public String getPath() ������Fileת��Ϊ·�����ַ�����
 *         - public String getName()  �������ɴ�File��ʾ���ļ���Ŀ¼�����ơ�
 *         - public long length()  �������ɴ�File��ʾ���ļ��ĳ��ȡ�
 */
public class FIle02Methods {
    public static void main(String[] args) {
        getAbsolutePath();
        getPath();
        getName();
        getLengths();
    }
    /*
        public long length()  �������ɴ�File��ʾ���ļ��ĳ��ȡ�
        ��ȡ���ǹ��췽��ָ�����ļ��Ĵ�С,���ֽ�Ϊ��λ
        ע��:
            �ļ�����û�д�С�����,���ܻ�ȡ�ļ��еĴ�С
            ������췽���и�����·��������,��ôlength��������0
     */
    private static void getLengths() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        long length = f.length();
        System.out.println(length);
    }
   /*
       public String getName()  �������ɴ�File��ʾ���ļ���Ŀ¼�����ơ�
       ��ȡ�ľ��ǹ��췽������·���Ľ�β����(�ļ�/�ļ���)
    */
    private static void getName() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("D:\\workspace\\studyProjects");
        String name = f.getName();
        String name1 = f1.getName();
        System.out.println("getName();;"+name+"==="+name1);
    }

    /*
        public String getPath() ������Fileת��Ϊ·�����ַ�����
        ��ȡ�Ĺ��췽���д��ݵ�·��
        toString�������õľ���getPath����
        Դ��:
            public String toString() {
                return getPath();
            }
       */
    private static void getPath() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("01_input.jpg");
        String path = f.getPath();
        String path1 = f1.getPath();
        System.out.println("getPath();;"+path+"==="+path1);
    }


    /*
        public String getAbsolutePath() �����ش�File�ľ���·�����ַ�����
        ��ȡ�Ĺ��췽���д��ݵ�·��
        ����·���Ǿ��ԵĻ�����Ե�,getAbsolutePath�������صĶ��Ǿ���·��
     */
    private static void getAbsolutePath() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("01_input.jpg");
        String absolutePath = f.getAbsolutePath();
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println("getAbsolutePath();;"+absolutePath+"==="+absolutePath1);
    }
}
