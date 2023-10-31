class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i - 1]) {
                continue;
            } else {
                return nums[i];
            }

        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {

            return nums[nums.length - 1];
        }

        return nums[0];

    }
}