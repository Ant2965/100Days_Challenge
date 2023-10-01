//package recursion;

public class First_occurance {

    public static int occ(int num[], int a, int i) {

        if (a == num.length) {
            return -1;
        }

        if (i == num[a]) {
            return a;

        }

        return occ(num, a + 1, i);

    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int num[] = { 1, 2, 4, 5, 2, 7 };
        int a = 0;
        int i = 7;
        int c = occ(num, a, i);

        if (c == -1) {
            System.out.println("Num not found");

        } else {
            System.out.println(c);
        }
    }

}
