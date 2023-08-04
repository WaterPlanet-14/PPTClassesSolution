package assignment6;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SecondSmallest_q8 {
	 public static void main(String args[]){
		 int arr[] = { 111, 13, 25, 9, 34, 1 };
		 int n = arr.length;
		 Arrays.sort(arr);
		 System.out.println("smallest element is " + arr[0]);				//Sorting
		 System.out.println("second smallest element is " + arr[1]);
		 
		 System.out.println();
		 int smallest = Integer.MAX_VALUE;
		 for (int i = 0; i < n; i++) 
			 if (arr[i] < smallest) 
				 smallest = arr[i];
		 System.out.println("smallest element is: " + smallest);			//Custom Logic
		 int second_smallest = Integer.MAX_VALUE;
		 for (int i = 0; i < n; i++) 
			 if (arr[i] < second_smallest && arr[i] > smallest) 
				 second_smallest = arr[i];
		 System.out.println("second smallest element is: " + second_smallest); 
		 
		 System.out.println();
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 for (int i = 0; i < n; i++) 
			 pq.add(arr[i]);
		 int t = pq.peek(); 															//Priority Queue
		 pq.poll(); 
		 int w = pq.peek();
		 System.out.println("smallest element : " + t);
		 System.out.println("second smallest element : " + w);
	 }
}
