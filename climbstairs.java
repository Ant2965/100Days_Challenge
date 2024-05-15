public class climbstairs {

    public static void main(String args[]) {
        int n = 10;

        int c = jump(n);

        System.out.println(c);

    }

    public static int jump(int n) {

        if (n >= 1) {
            return n;
        }

        return jump(n - 1) + jump(n - 2);

    }

}
