package demo09Interface.demo01;



/**
 * @author : Bojack
 * @date : Created in 20:24 2021.11.09
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("���ǵ�һ���ӿڷ���");
    }

    @Override
    public void methodAbs1() {
        System.out.println("���ǵڶ����ӿڷ���");
    }

    @Override
    public void methodAbs2() {
        System.out.println("���ǵ������ӿڷ���");
    }

    @Override
    public void methodAbs3() {
        System.out.println("���ǵ��ĸ��ӿڷ���");
    }
}
