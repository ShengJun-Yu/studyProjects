package demo37Recursive;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 17:20 2021.12.29
 * ��ϰ:
 * �ݹ��ӡ�༶Ŀ¼
 * ����:
 * ���� ���� �ļ���,�� ���� �ļ��е����ļ���

 */
public class demo02 {
    public static void main(String[] args) {
        File f = new File("D:\\Ѹ������");
        prin(f);
    }

    public static void prin(File f) {
        System.out.println(f);
        File[] files = f.listFiles();
        for (File i : files) {
            if (i.isDirectory()) {
                prin(i);
            } else {
                System.out.println(i);
            }
        }
    }
}
