
//package recursion;
import java.util.*;

public class Day1 {

    public static void num(long n) {
        if (n == 0) {
            return;

        }

        num(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        // int a;

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();

        num(a);

    }

}
