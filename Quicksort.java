//package recursion;

public class Quicksort {

    public static void quick(int num[], int s, int l) {
        if (s >= l) {
            return;
        }
        int pidx = partition(num, s, l);
        quick(num, s, pidx - 1);
        quick(num, pidx + 1, l);

    }

    public static int partition(int num[], int s, int l) {
        int pivot = num[l];

        int i = s - 1;

        for (int j = s; j < l; j++) {

            if (num[j] <= pivot) {
                i++;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }

        }
        i++;
        int temp = pivot;

        num[l] = num[i];
        num[i] = temp;

        return i;
    }

    public static void print(int num[]) {
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub'

        int num[] = { 3, 5, 4, 2, 1, 9, 6, 60, 54, 34, };

        quick(num, 0, num.length - 1);

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }

        // print(num);

    }

}
