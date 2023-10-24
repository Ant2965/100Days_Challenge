class Solution {
    public boolean isValid(String s) {
        Stack<Character> ab = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                ab.push(ch);

            }

            else {
                if (ab.isEmpty()) {
                    return false;
                }

                char tp = ab.pop();
                if (tp == '(' && ch == ')' || tp == '{' && ch == '}' || tp == '[' && ch == ']') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (ab.isEmpty()) {
            return true;
        }
        return false;
    }
}