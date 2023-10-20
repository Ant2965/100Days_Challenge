
///package backtracking;
import java.util.*;

public class arrayback {

    public static void back(int num[], int i) {

        if (i == num.length) {
            return;
        }
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        num[i] = a;

        back(num, i + 1);

        System.out.println(num[i] - 2);

    }

    public static void main(String[] args) {
        int num[] = new int[6];
        int i = 0;
        back(num, i);

        // TODO Auto-generated method stub

    }

}
