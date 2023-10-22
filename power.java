public class power {

    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * pow(x, y - 1);

    }

    public static void main(String[] args) {
        int x = 4, y = 3;

        int c = pow(x, y);
        System.out.println(c);

    }

}
