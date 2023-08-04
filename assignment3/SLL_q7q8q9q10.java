package assignment3;

public class SLL_q7q8q9q10 {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data= d;	
		}
		Node (int data,Node next){
			this.data = data;
			this.next = next;
		}
	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ---> ");
			temp =temp.next;
		}
		System.out.println("End");
	}
	public void DeleteAtIndex(int index) {
		Node temp = head;
		int i=1;
		while ( i < index-1) {
			temp = temp.next;							//DeleteIndex
			i++;
		}
		Node a = temp.next;
		temp.next =a.next;
		a.next = null;
	}
	
	public boolean DeleteValue(int data) {
		Node temp = head;
		if(head.data == data ) {
			head= head.next;
		}													//DeleteValue
		while(temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	public void AddLast(int data) {
		Node newnode= new Node(data);
		Node currnode = head;	
		if (head==null) {
			head=newnode;
			return;													//AddLast
		}
		while(currnode.next != null)
			currnode = currnode.next;
		currnode.next = newnode;
		newnode.next = null;
	}
	
	public void insertAtMid(int x) {
		if (head == null)
			head = new Node(x);
		else {
			Node newNode = new Node(x);
			Node ptr = head;
			int len = 0;
			while (ptr != null) {
				len++;
				ptr = ptr.next;
			}															//InsertAtMid
			int count = ((len % 2) == 0) ? (len / 2) :
				(len + 1) / 2;
			ptr = head;
			while (count > 1) {
				ptr = ptr.next;
				count--;
			}
			newNode.next = ptr.next;
			ptr.next = newNode;
		}
	}
	public void reverse() {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while(temp != null) {							//reverse
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}
	public static void main(String args[]) {
		SLL_q7q8q9q10 ll = new SLL_q7q8q9q10();
//		ll.head = new Node(12);
//		ll.head.next = new Node(22);
//		ll.head.next.next = new Node(34);
		ll.insertAtMid(3);
		ll.AddLast(43);
		ll.AddLast(13);
		ll.AddLast(12);
		ll.print();
		ll.DeleteValue(12);
		ll.print();
		ll.AddLast(61);
		ll.print();
		System.out.println("Inserting at Mid");
		ll.insertAtMid(45);
		ll.print();
		ll.AddLast(64);
		ll.DeleteAtIndex(3);
		ll.print();
		ll.reverse();
		ll.print();
		
	}
}
