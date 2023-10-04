public class PalindromeConversion {
    public static int minStepsToPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int steps = 0;

        for (int i = 0, j = charArray.length - 1; i < j;) {
            if (charArray[i] == charArray[j]) {
                i++;
                j--;
            } else {
                // Find the rightmost character matching charArray[i] starting from j-1
                int k = j - 1;
                while (k > i && charArray[k] != charArray[i]) {
                    k--;
                }

                // If no match is found, it's not possible to form a palindrome
                if (k == i) {
                    return -1;
                }

                // Swap the characters to make charArray[i] equal to charArray[j]
                while (k < j) {
                    char temp = charArray[k];
                    charArray[k] = charArray[k + 1];
                    charArray[k + 1] = temp;
                    k++;
                    steps++;
                }
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        String input = "nitiin";
        int result = minStepsToPalindrome(input);
        if (result == -1) {
            System.out.println("It's not possible to convert into a palindrome.");
        } else {
            System.out.println("Minimum steps to convert to a palindrome: " + result);
        }
    }
}
