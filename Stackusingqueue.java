import java.util.LinkedList;
import java.util.*;
public class Stackusingqueue {

    static class stack{

        static Queue <Integer> a =new LinkedList<>();
        static Queue 
        <Integer> b =new LinkedList<>();



        public static boolean isEmpty(){
            return a.isEmpty() && b.isEmpty();
        }


        public static void push(int data){
            if(!a.isEmpty()){
                a.add(data);
            }
            else{
                b.add(data);
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top =-1;

            if(!a.isEmpty()){
                while(!a.isEmpty()){
                    top =a.remove();
                    if(a.isEmpty()){
                        break;
                    }
                    else{
                        b.add(top);

                    }
                }
                else{
                    while(!b.isEmpty()){
                        top=a.remove();
                        if(b.isEmpty()){
                            break;
                        }
                        else{
                            a.add(top);
                        }
                    }
                }
            }

            return top;

        }

    }
    
} 
