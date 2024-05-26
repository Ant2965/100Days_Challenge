public class palistring {

    public static boolean ispali(String a){
        int n=a.length();

        for(int i=0;i<n/2;i++){
            if(a.charAt(i)!=a.charAt(n-i-1)){
                return false;

            }
            // n--;
        }


        return true;

    }
    public static void main(String[] args) {

        String a ="anana";   

        System.out.println(ispali(a));
        
    }
    
}
