//package recursion;

public class Day2 {

    public static boolean sor(int num[], int i) {

        if (i == num.length - 1) {
            return true;
        }

        if (num[i + 1] < num[i]) {

            return false;

        }

        return sor(num, i + 1);

    }

    public static void main(String[] args) {

        int num[] = { 2, 7, 7, 8, 45, 75 };
        int i = 0;

        boolean v = sor(num, i);

        System.out.println(v);

    }

}
