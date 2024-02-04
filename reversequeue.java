
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {

	
	public static void reverse(Queue<Integer> q) {
		
		Stack<Integer> rev =new Stack<>();
		
		
		while(!q.isEmpty()) {
			rev.push(q.remove());
		}
		
		
		while(!rev.isEmpty()) {
			q.add(rev.pop());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q =new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		reverse(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();		}
		

	}

}
