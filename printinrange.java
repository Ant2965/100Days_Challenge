public static void printinrange(Node root , int k1 ,int k2) {
		if(root==null) {
			return ;
		}
		
		
		
		if(root.data>=k1  &&  root.data<=k2) {
			printinrange(root.left,k1,k2);
			System.out.print(root.data);
			printinrange(root.right,k1,k2);
		}
		else if(root.data> k1){
			printinrange(root.left,k1,k2);
			
			
		}
		
		else {
				printinrange(root.right,k1,k2);
		}
		
	}