package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 19:09 2021.12.27
 *     File���жϹ��ܵķ���
 *         - public boolean exists() ����File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
 *         - public boolean isDirectory() ����File��ʾ���Ƿ�ΪĿ¼��
 *         - public boolean isFile() ����File��ʾ���Ƿ�Ϊ�ļ���
 */
public class File02Methods01 {
    public static void main(String[] args) {
        exists();
        isFileAndIsDirectory();
    }
   /*
   public boolean isDirectory() ����File��ʾ���Ƿ�ΪĿ¼��
    �����жϹ��췽���и�����·���Ƿ����ļ��н�β
    ��:true
    ��:false
    public boolean isFile() ����File��ʾ���Ƿ�Ϊ�ļ���
    �����жϹ��췽���и�����·���Ƿ����ļ���β
    ��:true
    ��:false
    ע��:
    ���Ե�Ӳ����ֻ���ļ�/�ļ���,���������ǻ���
            ����������ʹ��ǰ��,·�������Ǵ��ڵ�,���򶼷���false
    */
    private static void isFileAndIsDirectory() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        if (f.exists()){
            boolean directory = f.isDirectory();
            System.out.println(directory);
            boolean file = f.isFile();
            System.out.println(file);
        }

    }

    /*
         public boolean exists() ����File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
         �����жϹ��췽���е�·���Ƿ����
             ����:true
             ������:false
     */
    private static void exists() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        boolean exists = f.exists();
        System.out.println(exists);

    }
}
