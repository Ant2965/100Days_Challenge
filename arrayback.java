
//package backtracking;
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
        num[i] = num[i] - 2;
        System.out.println(num[i]);

    }

    public static void main(String[] args) {
        int num[] = new int[6];
        int i = 0;
        back(num, i);

        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }

        // TODO Auto-generated method stub

    }

}
