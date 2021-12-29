package demo37Recursive.Filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author : Bojack
 * @date : Created in 19:28 2021.12.29
 * ����:
 * ����c:\\abc�ļ���,��abc�ļ��е����ļ���
 * ���ǿ���ʹ�ù�������ʵ��
 * ��File������������ListFiles���صķ���,�����Ĳ������ݵľ��ǹ�����
 * <p>
 * File[] listFiles(FileFilter filter)
 * java.io.FileFilter�ӿ�:���ڳ���·����(File����)�Ĺ�������
 * ����:���������ļ�(File����)
 * ���󷽷�:���������ļ��ķ���
 * boolean accept(File pathname) ����ָ������·�����Ƿ�Ӧ�ð�����ĳ��·�����б��С�
 * ����:
 * File pathname:ʹ��ListFiles��������Ŀ¼,�õ���ÿһ���ļ�����
 * <p>
 * File[] listFiles(FilenameFilter filter)
 * java.io.FilenameFilter�ӿ�:ʵ�ִ˽ӿڵ���ʵ�������ڹ������ļ�����
 * ����:���ڹ����ļ�����
 * ���󷽷�:���������ļ��ķ���
 * boolean accept(File dir, String name) ����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ�ļ��б��С�
 * ����:
 * File dir:���췽���д��ݵı�������Ŀ¼
 * String name:ʹ��ListFiles��������Ŀ¼,��ȡ��ÿһ���ļ�/�ļ��е�����
 * ע��:
 * �����������ӿ���û��ʵ�����,��Ҫ�����Լ�дʵ����,��д���˵ķ���accept,�ڷ������Լ�������˵Ĺ���
 */
public class demo04Anonymous {
    public static void main(String[] args) {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\src\\demo36File");
        getAllName(f);
    }

    private static void getAllName(File f) {
//        ʹ�������ӿ�ʵ��FileFilter
//        File[] files = f.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory();
//            }
//        });
        //        ʹ�������ӿ�ʵ��FilenameFilter
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });
        for (File i : files) {
            if (i.isDirectory()) {
                getAllName(i);
            } else {
                System.out.println(i/*.toString()*/);
            }
        }
    }
}
