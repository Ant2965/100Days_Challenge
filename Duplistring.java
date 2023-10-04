public class Duplistring {

    public static void dupli(String a, StringBuilder ab, boolean map[], int i) {

        if (i == a.length()) {
            System.out.println(ab);

            return;
        }
        int curr = a.charAt(i) - 'a';
        if (map[curr] == true) {
            dupli(a, ab, map, i + 1);
        } else {
            ab.append(a.charAt(i));
            map[curr] = true;
            dupli(a, ab, map, i + 1);

        }

    }

    public static void main(String args[]) {

        String a = "apppnnnnacollege";
        StringBuilder ab = new StringBuilder();
        boolean map[] = new boolean[26];
        int i = 0;
        dupli(a, ab, map, i);
    }

}
