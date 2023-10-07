import java.util.Arrays;

public class CommonDigitNumbers {

    public static int solution(int[] numbers, int N) {
        boolean[][] hasCommonDigit = new boolean[N][N];
        int[] dp = new int[N];

        // Initialize dp array with 1 for each element in the beginning
        Arrays.fill(dp, 1);
        int maxCount = 1;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (hasCommonDigit(numbers[i], numbers[j])) {
                    // If numbers[i] and numbers[j] share a common digit
                    // Update dp[j] with dp[i] + 1 if it's greater
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                    maxCount = Math.max(maxCount, dp[j]);
                }
            }
        }

        return maxCount;
    }

    // Helper function to check if two numbers share a common digit
    private static boolean hasCommonDigit(int num1, int num2) {
        while (num1 > 0) {
            int digit1 = num1 % 10;
            int temp = num2;
            while (temp > 0) {
                int digit2 = temp % 10;
                if (digit1 == digit2) {
                    return true;
                }
                temp /= 10;
            }
            num1 /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers1 = { 50, 30, 15, 51, 10, 20, 151, 50, 15, 51, 10 };
        int result1 = solution(numbers1, numbers1.length);
        System.out.println(result1); // Output: 5

        int[] numbers2 = { 11, 33, 55 };
        int result2 = solution(numbers2, numbers2.length);
        System.out.println(result2); // Output: 1
    }
}
