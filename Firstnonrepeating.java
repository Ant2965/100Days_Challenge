import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Firstnonrepeating {

    public static void nonrepeat(String a){
        int frq[]= new int[26];

        Queue<Character> ab =new LinkedList<>();

        for(int i=0;i<a.length();i++){
            char ch =a.charAt(i);
            ab.add(ch);
            frq[ch-'a']++;

         while(!ab.isEmpty() && frq[ab.peek()-'a']>1){

                ab.remove();
            }
            if(ab.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(ab.peek());
            }
        } 
    }

    public static void main(String args[]){



        String a ="aabccxb";

        nonrepeat(a);
    }

    
}
