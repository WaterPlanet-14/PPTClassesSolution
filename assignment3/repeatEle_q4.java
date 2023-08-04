package assignment3;

import java.util.*;

//import java.util.Map.Entry;

public class repeatEle_q4 {
	public static void main(String[] args) {
		int arr[] = { 12, 10, 9, 45, 2, 10, 45 ,12};
//		Arrays.sort(arr);
//		System.out.print(" Repeating elements are ");
//		for (int i = 1; i < arr.length; i++) 												//Less Space
//			if (arr[i] == arr[i - 1]) 
//				System.out.print(" " + arr[i]);
//		System.out.println();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.print(" Repeating elements are ");
		for (int i = 0; i < arr.length; i++)													//HashSet
			if (hs.contains(arr[i])) 
				System.out.print(" " + arr[i]);
			else 
				hs.add(arr[i]);
	}
}
