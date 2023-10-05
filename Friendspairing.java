//package recursion;

public class Friendspairing {

    public static int friends(int n) {
        // single
        if (n == 1 || n == 2) {
            return n;
        }

        int a = friends(n - 1);

        int b = friends(n - 2) * (n - 1);

        return a + b;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 3;

        System.out.println(friends(n));

    }

}
