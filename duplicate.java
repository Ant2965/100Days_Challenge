public class duplicate {

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int a = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {

                nums[a] = nums[i + 1];

                a = a + 1;
                count += 1;

            }

        }
        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 7 };
        System.out.print(removeDuplicates(nums));

    }

}
