
//package greedy;
import java.util.*;

public class Coins {

    public static void main(String[] args) {
        int denomi[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        int value = 2001;
        int count = 0;
        ArrayList<Integer> currency = new ArrayList<>();

        for (int i = denomi.length - 1; i >= 0; i--) {
            if (denomi[i] <= value) {
                while (value >= denomi[i]) {
                    currency.add(denomi[i]);
                    value = value - denomi[i];
                    count++;

                }
            }
        }
        System.out.println(currency);
        System.out.println(count);

    }

}
