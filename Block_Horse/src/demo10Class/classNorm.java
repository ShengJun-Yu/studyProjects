package demo10Class;

/**
 * @author : Bojack
 * @date : 2021年10月11日19:14:10
 * 一个标准的类通常要拥有下面四个组成部分：
 * <p>
 * 1. 所有的成员变量都要使用private关键字修饰
 * 2. 为每一个成员变量编写一对儿Getter/Setter方法
 * 3. 编写一个无参数的构造方法
 * 4. 编写一个全参数的构造方法
 */
public class classNorm {
    //    private关键字修饰
    private String name;
    private int age;
    private boolean isman;

    //    无参数的构造方法
    public classNorm() {
    }

    //    全参数的构造方法
    public classNorm(String name, int age, boolean isman) {
        this.name = name;
        this.age = age;
        this.isman = isman;
    }

    //    一个成员变量编写一对儿Getter/Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsman() {
        return isman;
    }

    public void setIsman(boolean isman) {
        this.isman = isman;
    }
}
