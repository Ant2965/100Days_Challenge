// package tree;

public class tree {
	
	static class node{
		int data;
		node left;
		node right;
		
		
		
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
			}
	}

	static class binary{
		static int inx =-1; 
		public static node buildtree(int nodes[]) {
			inx++;
			if(nodes[inx]==-1)
			{
				return null;
			
			}
			
			node a = new node(nodes[inx]);
			
			a.left=buildtree(nodes);
			a.right=buildtree(nodes);
			
			return a;
		}
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary tree =new binary();
		
		System.out.println(tree.buildtree(nodes).data );
		
		
		
		
	}

}
