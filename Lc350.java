class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] cnt = new int[1001];
        for (int x : nums1) {
            ++cnt[x];
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : nums2) {
            if (cnt[x]-- > 0) {
                ans.add(x);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Dont know where to start God help me out to start and be consistent in dsa
