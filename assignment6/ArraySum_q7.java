package assignment6;

import java.util.Scanner;

public class ArraySum_q7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int arr_size = 0;
		if (sc.hasNextInt()) 
			arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arr_size; i++)	 
			if (sc.hasNextInt()) 
				arr[i] = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		sc.close();
		System.out.println("Sum of all the elements are " + sum);
	}
}
