// package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Countnodes {
	static class node{
		int data;
		node left;
		node right;
		
		
		node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
		
		
		static int inx=-1;
		
		
		public static node build(int nodes[]) {
			
			inx++;
			if(nodes[inx]==-1) {
				return null;
			}
			
			node a =new node(nodes[inx]);
			
			a.left=build(nodes);
			a.right=build(nodes);
			
			
			return a;	
		}
		
		
		
		
		public static void post(node root) {
			if(root ==null) {
				return;
			}
			
			post(root.left);
			post(root.right);
			System.out.println(root.data);
		}
		
		
		
		
		public static void level(node root) {
			if(root==null) {
				return;
			}
			
			Queue<node> a =new LinkedList<>();
			a.add(root);
			a.add(null);
			
			while(!a.isEmpty()) {
			node curr =a.remove();
			if(curr==null) {
				System.out.println();
			
				if(a.isEmpty()) {
					break;
				}
				else {
					a.add(null);
				}
			
			}
			else{
				System.out.print(curr.data);
				
				if(curr.left!=null) {
					a.add(curr.left);
				}
				if(curr.right!=null) {
					a.add(curr.right);
				}
			}
			
			
			}
		
			
		}
		
		
		
		public static int counts(node root) {
			if(root==null) {
				return 0;
			}
			
			int left =counts(root.left);
			int right = counts(root.right);
			
			
			
			return left+right+1;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		
		node root = node.build(nodes);
		
//		System.out.println(root.data);
		
		node.level(root);
		
		int a=node.counts(root);
		System.out.println(a);
		
	}

}
