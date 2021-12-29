package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 19:59 2021.12.27
 * File�����(�ļ���)Ŀ¼����
 * - public String[] list() ������һ��String���飬��ʾ��FileĿ¼�е��������ļ���Ŀ¼��
 * - public File[] listFiles() ������һ��File���飬��ʾ��FileĿ¼�е����е����ļ���Ŀ¼��
 * <p>
 * ע��:
 * list������listFiles�����������ǹ��췽���и�����Ŀ¼
 * ������췽���и�����Ŀ¼��·��������,���׳���ָ���쳣
 * ������췽���и�����·������һ��Ŀ¼,Ҳ���׳���ָ���쳣
 */
public class File02Methods03 {
    public static void main(String[] args) {
        methodlist();
        System.out.println("================================================");
        methodlistFiles();
    }

    /*
        public File[] listFiles() ������һ��File���飬��ʾ��FileĿ¼�е����е����ļ���Ŀ¼��
        �������췽���и�����Ŀ¼,���ȡĿ¼�����е��ļ�/�ļ���,���ļ�/�ļ��з�װΪFile����,���File����洢��File������
     */
    private static void methodlistFiles() {
        File f1 = new File("Block_Horse\\src\\demo36File");
        File[] files = f1.listFiles();
        for (File f :
                files) {
            System.out.println(f);
        }
    }

    /*
        public String[] list() ������һ��String���飬��ʾ��FileĿ¼�е��������ļ���Ŀ¼��
        �������췽���и�����Ŀ¼,���ȡĿ¼�������ļ�/�ļ��е�����,�ѻ�ȡ���Ķ�����ƴ洢��һ��String���͵�������
     */
    private static void methodlist() {
        File f1 = new File("Block_Horse\\src\\demo36File");
        String[] list = f1.list();
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
