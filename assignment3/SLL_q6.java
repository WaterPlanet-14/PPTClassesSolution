package assignment3;
public class SLL_q6 {
	Node head;
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
	public int getCount(){
		Node temp = head;
		int count = 0;
		while (temp != null) {								//Length
			count++;
			temp = temp.next;
		}
		return count;
	}
//	public int getCountRec(Node node) {
//		if (node == null)									//RecursiveLen
//			return 0;
//		return 1 + getCountRec(node.next);
//	}
	public static void main(String args[]) {
		SLL_q6 ll = new SLL_q6();
		ll.head = new Node(12);
		ll.head.next = new Node(22);
		ll.head.next.next = new Node(34);
		ll.print();
		int size = ll.getCount();
//		int size2 = ll.getCountRec(ll.head);
		System.out.println("Size : " + size);
	}
}
