package demo35Lambda.LambdaReturn;

import java.util.Arrays;

/**
 * @author : Bojack
 * @date : Created in 16:14 2021.12.27
 */
public class Returns {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("Jun", 16),
                new Person("Yu", 118),
                new Person("Sheng", 20)
        };

//        sort方法
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        labbda表达方法
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge() - o2.getAge();
        });

//        省略版labbda表达方法
        Arrays.sort(arr,(o1,o2)->o1.getAge() - o2.getAge());

        for (Person i : arr) {
            System.out.println(i);
        }
    }
}
