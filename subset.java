//package backtracking;

public class subset {
    public static void str(String s, int i, String newstr) {
        if (i == s.length()) {
            System.out.println(newstr);
            return;

        }

        char ch = s.charAt(i);
        str(s, i + 1, newstr + ch);
        str(s, i + 1, newstr);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a = "abc";
        int i;
        str(a, 0, "");
    }

}
