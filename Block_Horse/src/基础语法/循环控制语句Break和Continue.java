package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��21��21:12:38
 * 1.���ڿ�������switch��䵱�У�һ��ִ�У�����switch������̽�����
 * 2.����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
 */
public class ѭ���������Break��Continue {
    public static void main(String[] args) {
        a();
        b();
    }

    /**
     * break
     * 1.���ڿ�������switch��䵱�У�һ��ִ�У�����switch������̽�����
     * 2.����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
     */
    public static void a() {
        for (int i = 0; i < 9; i++) {
            //���ϣ�������ξͽ������ѭ��
            if (i == 3) {//���Ϊ��3��
                break;//���ѭ��
            }
            System.out.println("hello" + i);
        }
    }

    /**
     * continue
     * һ��ִ��������������ǰ��ѭ��ʣ�����ݣ����Ͽ�ʼ��һ��ѭ��
     */
    public static void b() {
        for (int i = 0; i < 9; i++) {
            //���ϣ��������4��ѭ��
            if (i == 4) {//���Ϊ��4��
                continue;//����
            }
            System.out.println(i + "�㵽��");
        }
    }

}
