package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 18:54 2022.03.07
 * ͨ�����������ó�Ա����
 *     ʹ��ǰ���Ƕ��������Ѿ����ڵ�,��Ա����Ҳ���Ѿ�����
 *     �Ϳ���ʹ�ö����������ó�Ա����
 */
public class demo02Main {
    public static void pr(AInterface d){
        d.printlns("hello,world");
    }
    public static void main(String[] args) {
        pr((name)->{
            demo02 de=new demo02();
            de.bigprint(name);
        });
 /*
            ʹ�÷��������Ż�Lambda
            �������Ѿ����ڵ�demo02
            ��Ա����Ҳ���Ѿ����ڵ�bidprint
            �������ǿ���ʹ�ö��������ó�Ա����
         */
        demo02 dee=new demo02();
        pr(dee::bigprint);
    }
}
