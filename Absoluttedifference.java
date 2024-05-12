//package greedy;
# antriksh
import java.util.Arrays;

public class Absoluttedifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a[] = { 4, 1, 7, 8 };
        int b[] = { 2, 3, 6, 5 };

        Arrays.sort(a);
        Arrays.sort(b);

        int difference = 0;

        for (int i = 0; i < a.length; i++) {
            difference = difference + Math.abs(a[i] - b[i]);
        }

        System.out.println(difference);
    }

}
