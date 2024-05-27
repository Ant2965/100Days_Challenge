public class Firstuppercase {

    public static String toup(String a){

        StringBuilder st =new StringBuilder("");

        char ch = Character.toUpperCase(a.charAt(0));

        st.append(ch);

        for(int i =1;i<a.length();i++){
            if(a.charAt(i)==' '&& i<a.length()-1){
                st.append(a.charAt(i));
                i++;
                st.append(Character.toUpperCase(a.charAt(i)));

            }else{
                st.append(a.charAt(i));
            }
        }




        return st.toString();

    }
    public static void main(String[] args) {
        
        String a ="Hello i am antriksh bahri";
        System.out.println(toup(a));


    }
    
}
