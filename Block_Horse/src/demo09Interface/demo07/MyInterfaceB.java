package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:20 2021.11.12
 */
public interface MyInterfaceB {
    // ����д�����ӿڲ����о�̬�����
//    static {
//
//    }

    // ����д�����ӿڲ����й��췽��
//    public MyInterfaceA() {
//
//    }
    public abstract void methodB();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("Ĭ�Ϸ���BB");
    }
}
