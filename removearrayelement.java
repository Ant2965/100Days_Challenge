class Solution {
    public int removeElement(int[] nums, int val) {
        int newer[] = new int[nums.length];
        int a = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newer[a] = nums[i];

                count++;

                nums[a] = newer[a];
                a++;

            }
        }

        return count;

    }
}