// package tree;

public class inorder {
	
	static class node{
		int data;
		node left;
		node right;
		
		
		node(int data){
			this.data =data;
			this.left=null;
			this.right =null;
		}
		
	}
	
	
	static class binary{
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
		
		public static void inorder(node root) {
			if(root ==null) {
				return;
			}
			
			inorder(root.left);
			System.out.print(root.data);
			inorder(root.right);
		}	
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		binary tree =new binary();		
		node root = tree.build(nodes);
		
		tree.inorder(root);
	}

}
