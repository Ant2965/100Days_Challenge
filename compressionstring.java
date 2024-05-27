public class compressionstring {


    public static String compress(String a ){
        // String s = "";
        StringBuilder s=new StringBuilder("");

        for(int i=0;i<a.length();i++){
            Integer count=1;

            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){

                count++;
                i++;
            }
            s.append(a.charAt(i));
            if(count>1){
                s.append(count.toString());
            }
            
        }
        return s.toString();
    }
    public static void main(String[] args) {
        
        String a = "aaaabbbbcccaaaaa";

        System.out.println(compress(a));




    }
    
}
