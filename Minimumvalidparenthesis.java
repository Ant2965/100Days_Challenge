
/*1249. Minimum Remove to Make Valid Parentheses
Solved
Medium
Topics
Companies
Hint
Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 

Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
 

Constraints:

1 <= s.length <= 105
s[i] is either'(' , ')', or lowercase English letter.
 */

class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();

        Stack<Integer> a = new Stack<>();

        Set<Integer> e = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                a.push(i);
            } else if (s.charAt(i) == ')') {
                if (a.isEmpty()) {
                    e.add(i);
                } else {
                    a.pop();
                }

            }

        }

        while (!a.isEmpty()) {
            e.add(a.pop());
        }
        String res = "";

        for (int i = 0; i < n; i++) {
            if (!e.contains(i)) {
                res += s.charAt(i);
            }
        }

        return res;

    }
}