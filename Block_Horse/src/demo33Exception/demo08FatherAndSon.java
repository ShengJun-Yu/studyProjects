package demo33Exception;


import java.io.FileNotFoundException;

/**
 * @author : Bojack
 * @date : Created in 21:14 2021.12.08
 * 子父类的异常:
 * - 如果父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者不抛出异常。
 * - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
 * 注意:
 * 父类异常时什么样,子类异常就什么样
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
    //子类重写父类方法时,抛出和父类相同的异常
    public void show01() throws NullPointerException, IndexOutOfBoundsException {
    }

    //子类重写父类方法时,抛出父类异常的子类
    public void show02() throws NullPointerException {
    }

    //子类重写父类方法时,不抛出异常
    public void show03() {
    }

    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。
    public void show04() {
        //子类要是有异常不可声明抛出，可使用try...Catch捕获
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
