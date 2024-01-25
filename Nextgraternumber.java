//package stack;
import java.util.*;
public class Nextgraternumber {
	
	
	public static void large(int ar[],int next[]) {
		Stack<Integer> s =new Stack<>();
		
		int n= ar.length;
		s.push(ar[n-1]);
		next[n-1]= -1;


		for(int i=n-2;i>=0;i--) {
			
			
			while(!s.isEmpty()&&ar[i]>s.peek()) {
				 
				s.pop();	
			}
			
			if(s.isEmpty()) {
				next[i] = -1;
				
			}
			else {
				next[i]=s.peek();
			}
			s.push(ar[i]);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= {6,8,0,1,3};
		
		int next[]=new int[ar.length];
		
		large(ar,next);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(next[i]);
		}
		
		
		
	}

}
