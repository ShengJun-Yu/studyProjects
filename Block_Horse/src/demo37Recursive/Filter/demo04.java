package demo37Recursive.Filter;

import java.io.File;

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
public class demo04 {
    public static void main(String[] args) {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\src\\demo36File");
        getAllName(f);
    }

    private static void getAllName(File f) {
        File[] files = f.listFiles(new FileFilterImpl());
        for (File i : files) {
            if (i.isDirectory()) {
                getAllName(i);
            } else {
                System.out.println(i/*.toString()*/);
            }
        }
    }
}
