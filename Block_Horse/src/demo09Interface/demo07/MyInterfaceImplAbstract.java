package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:23 2021.11.12
 */
//一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
//    如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
public abstract class MyInterfaceImplAbstract implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A");
    }


//    如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
    @Override
    public void methodComment() {
        System.out.println("覆盖重写了AB都有的方法Comment");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写了AB接口中重复的methodDefault方法");
    }
}
