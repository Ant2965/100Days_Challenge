//package trees;
//for the preorder traversal
public class perorder {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static int index = -1;

	public static Node buildtree(int nodes[]){
		index+=1;
		if(nodes[index]== -1) {
			return null;
		}
		
		
		Node a =new Node(nodes[index]);
		a.left=buildtree(nodes);
		a.right=buildtree(nodes);
		
		
		return a;  
		
		
	}
	
	public static void pre(Node root) {
		if(root==null) {
			return;
		}
		pre(root.left);
		pre(root.right);

		System.out.println(root.data);
		
	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root =buildtree(nodes);
		//System.out.print(root.data);
		
		pre(root);
	}
	

}
