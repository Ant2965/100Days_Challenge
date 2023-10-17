class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        int maxleft = 0;
        int maxright = 0;
        int tw = 0;

        for (int i = 0; i < left.length; i++) {
            maxleft = Math.max(maxleft, height[i]);
            left[i] = maxleft;
        }

        for (int i = right.length - 1; i >= 0; i--) {
            maxright = Math.max(maxright, height[i]);
            right[i] = maxright;
        }

        for (int i = 0; i < height.length; i++) {
            int h = Math.min(left[i], right[i]) - height[i];
            tw += h;

        }

        return tw;
    }
}