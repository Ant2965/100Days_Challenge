class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int power= nums[i]*nums[i];
            nums[i]=power;
        }
        Arrays.sort(nums);
        return nums;
    }
}