//package tree;
import java.util.*;
public class BST{
	public static class Node{
		int data;
		Node left;
		Node right;
		
		
		Node(int data){
			
			this.data=data;
		}
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return ;
			
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public static Node insert(Node root,int val) {
		if(root ==null) {
			root = new Node(val);
			return root;
		}
		
		if(root.data>val) {
			
			root.left = insert(root.left,val);
			
		}
		
		else {
			root.right = insert(root.right,val);
		}
			return root;
	}
	
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
	
	
	public static void printroot2leaf(Node root ,ArrayList <Integer> path) {

		if(root==null) {
			return;
		}
		path.add(root.data);

		if(root.left==null &&  root.right==null) {
			for (int i =0;i<path.size();i++) {
			 System.out.print(path.get(i));
			 
			}
			System.out.println();
		}
		
		printroot2leaf(root.left,path);
		printroot2leaf(root.right,path);
		path.remove(path.size()-1);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		int value[]= {5,1,3,4,2,7};
		Node root = null;	
		
		for(int i =0;i<value.length;i++) {
			root = insert(root,value[i]);
		}
		
		//inorder(root);
		
		
	 //printinrange(root,2,6);
		ArrayList <Integer> path = new ArrayList<>();
	 printroot2leaf(root,path);

	}
	
	
	
}
