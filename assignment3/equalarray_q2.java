package assignment3;

import java.util.Arrays;

public class equalarray_q2 {
	public static void main(String[] args) {
		int a[] = { 30, 25, 40 };
		int b[] = { 30, 25, 40 };
		boolean result = Arrays.equals(a, b);				//Predefined method
		if (result == true) 
			System.out.println("Two arrays are equal");
		else 
	        System.out.println("Two arrays are not equal");
	   
//		int a1[] = { 10, 30, 12 };
//		int b1[] = { 10, 30, 12 };
//		boolean res = true;
//		if (a1 == null || b1 == null || a1.length != b1.length)
//			res = false;
//		for (int i = 0; i < a1.length; i++)   					//Creating a method
//			if (a1[i] != b1[i]) 
//				res = false;
//		if (res == true) 
//			System.out.println("Arrays are equal");
//		else 
//			System.out.println("Arrays are not equal");
	}
}
