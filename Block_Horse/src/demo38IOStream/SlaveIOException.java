package demo38IOStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:21 2022.01.02   ��jdk1.7֮ǰʹ��try catch finally �������е��쳣
 * ��ʽ:
 * try{
 * ���ܻ�����쳣�Ĵ���
 * }catch(�쳣����� ������){
 * �쳣�Ĵ����߼�
 * }finally{
 * һ����ָ���Ĵ���
 * ��Դ�ͷ�
 * }
 */
public class SlaveIOException {
    public static void main(String[] args) {
        FileWriter fw= null;
        try {
            fw = new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt");
            fw.write("�����쳣");
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
