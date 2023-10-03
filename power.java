import java.util.*;

public class power {

    public static int powe(int x, int n, int i, int p) {

        if (i == n) {
            return p * x;
        }
        p = p * x;

        return powe(x, n, i + 1, p);

    }

    public static void main(String args[]) {

        int x = 2;
        int n = 5;
        int i = 1;
        int p = 1;
        System.out.println(powe(x, n, i, p));

    }

}
