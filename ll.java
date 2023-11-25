//package data_structure;

public class ll {

	public static class node {
		int data;
		node next;

		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static node head = null;;
	public static node tail = null;

	public static void add(int data) {
		node newn = new node(data);

		if (head == null) {
			head = newn;
			tail = newn;
		} else {
			tail.next = newn;
			tail = tail.next;
		}

	}

	public static void middle(int data, int index) {

		node newn = new node(data);

		node temp = head;
		int i = 1;

		while (i < index - 1) {

			temp = temp.next;
			i++;

		}
		newn.next = temp.next;
		temp.next = newn;

		// System.out.println(newn.data);

	}

	public static node reverse(node temp) {
		node prev = null;
		node curr = temp;
		node after = curr.next;

		while (curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = after;
			after = curr.next;

		}

		return prev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(23);
		add(33);
		add(32);
		middle(34, 2);
		node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		node ab = reverse(head);

		temp = ab;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
