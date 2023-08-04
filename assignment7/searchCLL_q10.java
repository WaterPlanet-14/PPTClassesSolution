package assignment7;
public class searchCLL_q10 {
	public class Node{  
		int data;  
		Node next;  
		public Node(int data ){  
			this.data= data ; 
		}  
	}  
	public Node head = null;  
	public Node tail = null;  
	public void add(int data){   
		Node newNode1 = new Node(data);      
		if(head == null) {        
			head = newNode1;  
			tail = newNode1;  
			newNode1.next = head;  
		}  
		else {     
			tail.next = newNode1;
			tail = newNode1;         
			tail.next = head;  
		}  
	}  
	public void search(int element) {  
		Node current = head;  
		int i = 1;  
		boolean flagon = false;  
		if(head == null) {  
			System.out.println("List is totally Void! So Sad!");  
		}  
		else {  
			do{  
				if(current.data ==  element) {  
					flagon = true;  
					break;  
				}  
				current = current.next;  
				i++;  
			}while(current != head);  
			if(flagon)  
				System.out.println("Element is present in the list with a position tag : " + i);  
			else  
				System.out.println("Element is not present in the list");  
		}  
	}  
	public static void main(String[] args) {  
		searchCLL_q10 cl1 = new searchCLL_q10();            
		cl1.add(1000);  
		cl1.add(5000);  
		cl1.add(3);  
		cl1.add(4);  
		cl1.search(2);  
		cl1.search(5000);  
	}  
}
