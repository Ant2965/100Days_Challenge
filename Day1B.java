//package recursion;

public class Day1B {

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }

    public static void main(String[] args) {
        int n;

        int a = fact(4);

        System.out.println(a);

    }

}
