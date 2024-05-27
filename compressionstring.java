public class compressionstring {


    public static String compress(String a ){
        String s = "";

        for(int i=0;i<a.length();i++){
            Integer count=1;

            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){

                count++;
                i++;
            }
            s+=a.charAt(i);
            if(count>1){
                s+=count.toString();
            }
            
        }
        return s;
    }
    public static void main(String[] args) {
        
        String a = "aaaabbbbcccaaaaa";

        System.out.println(compress(a));




    }
    
}
