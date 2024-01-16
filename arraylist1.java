//package stack;

public class arraylist1 {

    public static class node{
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
	 public static node head =null;
	public	 static node tail=null;

	
	public static void add(int data) {
		
		node a= new node(data);
		
		if(head==null) {
			head=a;
			tail=a;
		}
		else {
		a.next=head;
		head=a;
		
		}
	}
	
	public static void print(node temp) {
	
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	public static void remove(){
		
	  if(head==null) {
		  System.out.println("ll is empty");
	  }
	 
	  head=head.next;
	  

	}
	
	
public static void main(String[] args) {
		
		add(43);
		add(54);
		add(65);
		add(32);
		
		print(head);
		remove();
		print(head);

		
		
	}




}



