package demo38IOStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Bojack
 * @date : Created in 16:21 2022.01.02   ��jdk1.7֮ǰʹ��try catch finally �������е��쳣
 * JDK7��������
 * ��try�ĺ�߿�������һ��(),�������п��Զ���������
 * ��ô�������������������try����Ч
 * try�еĴ���ִ�����,���Զ����������ͷ�,����дfinally
 * ��ʽ:
 * try(����������;����������....){
 * ���ܻ�����쳣�Ĵ���
 * }catch(�쳣����� ������){
 * �쳣�Ĵ����߼�
 * }
 */
public class SlaveIOExceptionJDK7 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Block_Horse\\src\\demo38IOStream\\Reader\\read02.txt")) {
            fw.write("�����쳣");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
