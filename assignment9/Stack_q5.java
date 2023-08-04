package assignment9;

public class Stack_q5 {
	private int capacity = 1000;
	private int[] data;
	private int top = -1;
	public Stack_q5() {
		data = new int[capacity];
	}
	public Stack_q5(int size) {
		data = new int[size];
		capacity = size;
	} 
	public boolean isEmpty() {
		return (top == -1);
	}
	public int size() {
		return (top + 1);
	}
	public void print() {
		System.out.print("Stack : ");
		for (int i = top; i > -1; i--) 
			System.out.print(data[i] + " ");
		System.out.println();
	}
	public void push(int value) throws IllegalStateException {
		if (size() == data.length) {
			throw new IllegalStateException("StackOvarflowException"); }
		top++;
		data[top] = value;
	}
	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("StackEmptyException"); }
		int topVal = data[top];
		top--;
		System.out.print("Popped Element : ");
		return topVal;
	}
	public int top() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("StackEmptyException"); }
		return data[top];
	}
	public static void main(String[] args) {
		Stack_q5 s = new Stack_q5();
		s.push(11);
		s.push(26);
		s.push(3);
		s.push(64);
		s.push(23);
		s.push(86);
		s.push(1);
		s.print();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.print();
	}
}