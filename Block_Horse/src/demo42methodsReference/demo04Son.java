package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:47 2022.03.07
 */
public class demo04Son extends demo04Father {
    @Override
    public void say() {
        System.out.println("���Ƕ���");
    }

    public void method(demo04Interface d) {
        d.see();
    }

    public void show() {
//        method(() -> {
//            demo04Father father = new demo04Father();
//            father.say();
//        });
         /*
           ʹ��super������ĳ�Ա����
           super���Ѿ����ڵ�
           ����ĳ�Ա����sayHelloҲ���Ѿ����ڵ�
           �������ǿ���ֱ��ʹ��super���ø���ĳ�Ա����
       */
        method(super::say);

    }

    public static void main(String[] args) {
        new demo04Son().show();
    }
}
