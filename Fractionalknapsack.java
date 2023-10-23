
//package greedy;
import java.util.*;

public class Fractionalknapsack {

    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };

        int weight[] = { 10, 20, 30 };

        int capacity = 50;

        int value2 = 0;

        int bag = 50;

        int ratio[][] = new int[value.length][3];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = value[i];
            ratio[i][1] = weight[i];
            ratio[i][2] = value[i] / weight[i];

        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[2]));

        for (int i = ratio.length - 1; i >= 0; i--) {
            if (bag > ratio[i][1]) {
                value2 = value2 + ratio[i][0];
                bag = bag - ratio[i][1];
            } else {
                value2 = value2 + (bag * ratio[i][2]);
            }

        }
        System.out.println(value2);
    }
}