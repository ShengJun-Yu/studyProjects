package demo34Thread.MainThread;

/**
 * @author : Bojack
 * @date : Created in 20:43 2021.12.09
 */
public class Person {
    private String name;
    public  void run(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.println(name+"=="+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
