package demo33Exception;


import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 21:14 2021.12.08
 * �Ӹ�����쳣:
 * - ��������׳��˶���쳣,������д���෽��ʱ,�׳��͸�����ͬ���쳣�����Ǹ����쳣��������߲��׳��쳣��
 * - ���෽��û���׳��쳣��������д����÷���ʱҲ�����׳��쳣����ʱ����������쳣��ֻ�ܲ��������������׳�
 * ע��:
 * �����쳣ʱʲô��,�����쳣��ʲô��
 */
public class demo08FatherAndSon {
    public void show01() throws NullPointerException, IndexOutOfBoundsException {
    }

    public void show02() throws Exception {
    }

    public void show03() throws NullPointerException, IndexOutOfBoundsException {
    }

    public void show04() {
    }
}

class Son extends demo08FatherAndSon {
    //������д���෽��ʱ,�׳��͸�����ͬ���쳣
    public void show01() throws NullPointerException, IndexOutOfBoundsException {
    }

    //������д���෽��ʱ,�׳������쳣������
    public void show02() throws NullPointerException {
    }

    //������д���෽��ʱ,���׳��쳣
    public void show03() {
    }

    //���෽��û���׳��쳣��������д����÷���ʱҲ�����׳��쳣��
    public void show04() {
        //����Ҫ�����쳣���������׳�����ʹ��try...Catch����
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
