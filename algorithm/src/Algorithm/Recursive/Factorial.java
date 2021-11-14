package Algorithm.Recursive;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}
