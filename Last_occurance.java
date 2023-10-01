//package recursion;

public class Last_occurance {

    public static int last(int num[], int n, int i) {

        if (i == -1) {
            return -1;

        }

        if (num[i] == n) {
            return i;
        }

        return last(num, n, i - 1);

    }

    public static void main(String[] args) {

        int num[] = { 32, 32, 434, 2, 1, 23, 3, 2 };
        int i = num.length - 1;
        int n = 32;

        int c = last(num, n, i);

        System.out.println(c);

    }
}
