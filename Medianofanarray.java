class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int newar[] = new int[m + n];
        for (int i = 0, j = 0; i < m + n; i++) {
            if (i < n) {
                newar[i] = nums1[i];
            } else {
                newar[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(newar);
        int mid = (0 + newar.length - 1) / 2;

        if (newar.length % 2 != 0) {
            return (double) newar[mid];
        } else {
            return (double) (newar[mid] + newar[mid + 1]) / 2;
        }
    }
}