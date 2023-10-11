package strings;
public class palindrome {

    public static String reverse(String a) {
        int n = a.length();
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i) == a.charAt(n - 1)) {
                n= n-1;
                
            } 
            else {
            	 //System.out.println(" not pslindrome");
            	 return "notpalindrome";
            }
        }
        return "palindrome";
        
    }

    public static void main(String[] args) {
        String a = "aabbbbaa";
        System.out.println(reverse(a));

    }

}
