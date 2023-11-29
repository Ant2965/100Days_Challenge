public class noofonebits {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int ans = 0;
            int a = 1;
            for (int i = 1; i <= 32; i++) {
                if ((n & a) != 0) {
                    ans++;

                }
                a = a << 1;
            }
            return ans;
        }
    }

}
