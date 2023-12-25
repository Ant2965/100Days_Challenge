//package recursion;
public class Binarystringproblem {

    public static void bin(int n, int lastplace, String newstr) {
        if (n == 0) {
            System.out.println(newstr);
            return;

        }

        if (lastplace == 0) {
            bin(n - 1, 0, newstr + "0");

            bin(n - 1, 1, newstr + "1");

        } else {
            bin(n - 1, 0, newstr + "0");

        }

    }

    public static void main(String[] args) {
        int n = 3;
        String newstr = "";

        bin(n, 0, newstr);
    }

}
/*hello i am back on github lets goo */
