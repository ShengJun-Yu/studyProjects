package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 20:17 2022.03.07
 *     ��Ĺ�����(���췽��)����
 */
public class demo06Main {
    public static void show1(String p,demo06Interface i){
        demo06Person person = i.show(p);
        System.out.println(person);
    }

    public static void main(String[] args) {
//        show1("ysj",(name)-> new demo06Person(name));
          /*
            ʹ�÷��������Ż�Lambda���ʽ
            ���췽��new Person(String name) ��֪
            ����������֪ new
            �Ϳ���ʹ��Person����new��������
         */
        show1("ysj",demo06Person::new);

    }
}
