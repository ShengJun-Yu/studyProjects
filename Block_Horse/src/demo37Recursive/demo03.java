package demo37Recursive;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 18:48 2021.12.29
 * ��ϰ:
 * �ݹ��ӡ�༶Ŀ¼
 * ����:
 * ���� ���� �ļ���,�� ���� �ļ��е����ļ���
 * ֻҪjava��β���ļ�

 */
public class demo03 {
    public static void main(String[] args) {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\src\\demo36File");
        prin(f);
    }

    public static void prin(File f) {
        File[] files = f.listFiles();
        for (File i : files) {
            if (i.isDirectory()) {
                prin(i);
            } else {
////                ���ַ���,ת��ΪСд
//                String path = i.getPath();
//                //���ַ���,ת��ΪСд
//                String s = path.toLowerCase();
////                ����String���еķ���endsWith�ж��ַ����Ƿ�����.java��β
//                if(s.endsWith(".java")){
//                    System.out.println(i);
//                }
//                ��ʽ���
                if(i.getPath().toLowerCase().endsWith(".java")){
                    System.out.println(i);
                }
            }
        }
    }
}
