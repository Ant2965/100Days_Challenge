package stack;
import java.util.*;

public class greatestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num[] = {6,8,0,1,3};
			Stack <Integer> a = new Stack<>();
			int nextgr[] =new int[num.length];
				
			int n= num.length;
			
			nextgr[n-1]=-1;
			
			a.push(num[n-1]);    
			
			for(int i=n-2;i>=0;i--) {
				int curr = a.peek();
				
				while(!a.isEmpty( ) && curr<num[i]) {
					a.pop();
					
				}
				if(a.isEmpty()) {
				nextgr[i]=-1;
				}
				else {
					nextgr[i]=a.peek();
				}
				a.push(num[i]);
				
				
			}
			for(int i=0;i<num.length;i++) {
			
			System.out.println(nextgr[i]);
			
	}

}
}
