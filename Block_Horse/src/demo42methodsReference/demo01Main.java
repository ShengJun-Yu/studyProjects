package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 18:27 2022.03.07
 */
public class demo01Main {
    public static void pr(AInterface d) {
        d.printlns("ysj,hello!");
    }

    public static void main(String[] args) {
        pr((name) -> System.out.println(name));
  /*
            ����:
                Lambda���ʽ��Ŀ��,��ӡ�������ݵ��ַ���
                �Ѳ���s,���ݸ���System.out����,����out�����еķ���println���ַ������������
                ע��:
                    1.System.out�������Ѿ����ڵ�
                    2.println����Ҳ���Ѿ����ڵ�
                �������ǿ���ʹ�÷����������Ż�Lambda���ʽ
                ����ʹ��System.out����ֱ������(����)println����
         */
        pr(System.out::println);
    }
}
