/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(List<Integer> array) {
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process array as indicated
         * in the question. At the end, return the new size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        int n=array.size();
        int i=0,j=1;
        while(i<j && j<n){
            if(array.get(i)>=100){
                while(array.get(j)>=100){
                    j++;
                }
                if(j-i>=2){
                	int c=0;
                    for(int k=i;k<=j;k++){
                        array.remove(k);
                        c+=1;
                    }
                    array.add(j-i,c);
                }
                else{
                    j=j+2;
                    i=j-1;
                }
            }
            else{
                i++;
            }
        }

        return array.size();
    }

    public static void main (String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(num);
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/*
 * You may add any imports here, if you wish, but only from the
 * standard library
 */

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /*
         * Modify this function to process array as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        int count = 0;
        for (int i : array) {
            if (i % 6 == 0 && i >= 6) {
                coun += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}