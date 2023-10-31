class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max_length = 0;
        if (len == 0) {
            return 0;
        }
        int right = 0;
        int left = 0;
        HashSet<Character> ch = new HashSet<>();
        while (right < len) {
            if (!ch.contains(s.charAt(right))) {
                ch.add(s.charAt(right));
                max_length = Math.max(max_length, right - left + 1);
                right++;
            } else {
                ch.remove(s.charAt(left));
                left++;
            }
        }

        return max_length;

    }
}