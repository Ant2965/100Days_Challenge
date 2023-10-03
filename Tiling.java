//package recursion;

public class Tiling {

    public static int tile(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        // vertical we are using n-1

        int fnm1 = tile(n - 1);

        // horizontal
        int fnm2 = tile(n - 2);

        int total = fnm1 + fnm2;

        return total;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(tile(3));

    }

}
