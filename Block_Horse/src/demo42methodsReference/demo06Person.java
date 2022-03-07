package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 20:16 2022.03.07
 */
public class demo06Person {
    private String name;

    @Override
    public String toString() {
        return "demo06Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public demo06Person() {
    }

    public demo06Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
