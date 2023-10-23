
//package greedy;
import java.util.*;

public class Maxlengthpairs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(num, Comparator.comparingDouble(o -> o[1]));

        int chain = 1;
        int last = num[0][1];

        for (int i = 1; i < num.length; i++) {
            if (num[i][0] > last) {
                chain++;
                last = num[i][1];

            }
        }
        System.out.println(chain);

    }

}
