//package backtracking;

public class permu {

    public static void per(String a, String news) {
        if (a.length() == 0) {
            System.out.println(news);
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            char curr = a.charAt(i);

            String newa = a.substring(0, i) + a.substring(i + 1);
            per(newa, news + curr);

        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String news = "";

        per(s, "");
    }

}
