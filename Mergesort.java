// package recursion;

public class Mergesort {

    public static void print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void mergesort(int num[], int s, int l) {
        if (s >= l) {
            return;
        }

        int mid = (l + s) / 2;
        mergesort(num, s, mid);
        mergesort(num, mid + 1, l);
        merge(num, s, mid, l);
    }

    public static void merge(int num[], int s, int mid, int l) {

        int tem[] = new int[l - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= l) {
            if (num[i] < num[j]) {
                tem[k] = num[i];
                i++;
            } else {
                tem[k] = num[j];
                j++;

            }
            k++;

        }

        while (i <= mid) {
            tem[k++] = num[i++];

        }
        while (j <= l) {
            tem[k++] = num[j++];
        }

        int r = s;
        for (int e = 0; e < tem.length; e++) {
            num[r] = tem[e];
            r++;

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num[] = { 2, 5, 6, 4, 9, 7 };
        mergesort(num, 0, num.length - 1);
        print(num);

    }

}
