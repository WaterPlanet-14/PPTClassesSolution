package assignment3;

public class SmalllestLargest_q5 {
	public static void main(String[] args)  {
		int[] arr = { 12 , 21 , 53 , 2 , 14 , 7 , 91 , 36 };
		int n = arr.length;
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < n; i++) {											//brute force
			if (arr[i] < min) 
				min = arr[i];
			else if (arr[i] > max) 
				max = arr[i];  
		}
		System.out.print("Maximum is: " + max);
		System.out.println("\nMinimum is: " + min);
		
//		System.out.println("Maximum is: " + findMax(arr, n));
//		System.out.println("Minimum is: " + findMin(arr, n));
//	}
//	
//	static int findMin(int[] arr, int n)  {
//		int min = arr[0];
//		for (int i = 1; i < n; i++) 
//			min = Math.min(min,arr[i]); 
//		return min;
//	}																		//recursuve method
//	static int findMax(int[] arr, int n)  {
//		int max = arr[0];
//		for (int i = 1; i < n; i++) 
//			max = Math.max(max,arr[i]); 
//		return max;
	}
}
