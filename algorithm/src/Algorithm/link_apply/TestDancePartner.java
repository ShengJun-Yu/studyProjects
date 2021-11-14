package Algorithm.link_apply;

public class TestDancePartner {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        String sex = "F";
        for (int i = 0; i < persons.length; i++) {
            double rand = Math.random();
            if (rand > 0.5)
                sex = "M";
            persons[i] = new Person("people" + i, sex);
            sex = "F";
        }
        System.out.println("The dancers are...");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + " " + persons[i].sex);
        }
        DancePartner dancePartner = new DancePartner();
        dancePartner.match(persons, persons.length);
    }
}
