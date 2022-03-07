package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 20:32 2022.03.07
 */
public class demo07Main {
    public static int[] shows(int lenth, demo07Interface d) {
        return d.builder(lenth);
    }

    public static void main(String[] args) {
//       int[] shows = shows(7,(len)->new int[len]);
        int[] shows = shows(7, int[]::new);
        System.out.println(shows.length);
    }
}
