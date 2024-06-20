/**
 * Kanpsack
 */
public class kanpsack {

    public static void main(String[] args) {
        int[] wt = { 2, 5, 1,3,4 };
        int[] val = { 15, 14, 10,45, 30 };
        int W = 7;
        // int n = wt.length;
        System.out.println(knap(val, wt, W, val.length));
    }

    public static int knap(int val[] , int wt[], int W ,int n){
        if(W==0 || n==0){
            return 0;
        }

        if(wt[n-1]<= W){
           int ans1=val[n-1]+ knap(val, wt,W-wt[n-1] , n);


           int ans2= knap(val, wt, W, n-1);

              return Math.max(ans1, ans2);

        }else{
            return knap(val, wt, W, n-1);
        }
    }

	
}