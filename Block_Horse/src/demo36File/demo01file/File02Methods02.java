package demo36File.demo01file;

import java.io.File;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 19:32 2021.12.27
 * File�ഴ��ɾ�����ܵķ���
 * - public boolean createNewFile() �����ҽ������и����Ƶ��ļ��в�����ʱ������һ���µĿ��ļ���
 * - public boolean delete() ��ɾ���ɴ�File��ʾ���ļ���Ŀ¼��
 * - public boolean mkdir() �������ɴ�File��ʾ��Ŀ¼��
 * - public boolean mkdirs() �������ɴ�File��ʾ��Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼��
 */
public class File02Methods02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
        System.out.println("=====================");
        mkdirs();
        System.out.println("=====================");
        delete();
    }
    /*
        public boolean delete() ��ɾ���ɴ�File��ʾ���ļ���Ŀ¼��
        �˷���,����ɾ�����췽��·���и������ļ�/�ļ���
        ����ֵ:����ֵ
            true:�ļ�/�ļ���ɾ���ɹ�,����true
            false:�ļ�����������,����ɾ������false;���췽����·��������false
        ע��:
            delete������ֱ����Ӳ��ɾ���ļ�/�ļ���,���߻���վ,ɾ��Ҫ����
     */
    private static void delete() {
        File f = new File("Block_Horse\\src\\demo36File\\demo01File\\jj\\hh\\gg\\fdd\\sss");
        File f1 = new File("Block_Horse\\src\\demo36File\\demo01File\\jjj");
        f1.delete();
        f.delete();
    }

    /*
       public boolean mkdir() �������������ļ���
       public boolean mkdirs() ���ȿ��Դ����������ļ���,Ҳ���Դ����༶�ļ���
       �����ļ��е�·���������ڹ��췽���и���(���췽���Ĳ���)
        ����ֵ:����ֵ
            true:�ļ��в�����,�����ļ���,����true
            false:�ļ��д���,���ᴴ��,����false;���췽���и�����·�������ڷ���false
        ע��:
            1.�˷���ֻ�ܴ����ļ���,���ܴ����ļ�
     */
    private static void mkdirs() {
        File f = new File("Block_Horse\\src\\demo36File\\demo01File\\jj");
        boolean mkdir = f.mkdir();
        System.out.println(mkdir);
        File f1 = new File("Block_Horse\\src\\demo36File\\demo01File\\jj\\hh\\gg\\fdd\\sss");
        f1.mkdirs();
    }

    /*
        public boolean createNewFile() �����ҽ������и����Ƶ��ļ��в�����ʱ������һ���µĿ��ļ���
        �����ļ���·���������ڹ��췽���и���(���췽���Ĳ���)
        ����ֵ:����ֵ
            true:�ļ�������,�����ļ�,����true
            false:�ļ�����,���ᴴ��,����false
        ע��:
            1.�˷���ֻ�ܴ����ļ�,���ܴ����ļ���
            2.�����ļ���·���������,������׳��쳣

        public boolean createNewFile() throws IOException
        createNewFile�����׳���IOException,���ǵ����������,�ͱ���Ĵ�������쳣,Ҫôthrows,Ҫôtry catch
     */
    private static void createNewFile() throws IOException {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\���ļ�");
        File f1 = new File("Block_Horse\\src\\demo36File\\demo01File\\jjj");
        f1.createNewFile();
        boolean newFile = f.createNewFile();
        System.out.println(newFile);

    }
}
