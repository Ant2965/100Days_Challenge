public class palindrome {

    public static void reverse(String a) {
        int n = a.length();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(n - 1)) {
                System.out.println("notpali");

                n--;
            } else {
                System.out.println("plai");
            }

        }

    }

    public static void main(String[] args) {
        String a = "Ant";
        reverse(a);

    }

}
