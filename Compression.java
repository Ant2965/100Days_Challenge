public class Compression {
    public static String comp(String a) {
        String str = "";
        for (int i = 0; i < a.length(); i++) {
            Integer count = 1;
            while (i < a.length() - 1 && a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }
            str += a.charAt(i);
            if (count > 1) {
                str += count.toString();
            }
        }
        return str;

    }

    public static void main(String args[]) {
        String a = "aaaaaaabbbbbbaknaknaaaannnn";
        System.out.println(comp(a));
    }

}
