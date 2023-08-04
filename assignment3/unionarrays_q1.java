package assignment3;

import java.util.Arrays;
import java.util.HashSet;

public class unionarrays_q1 {
	public static void main(String[] args){
//		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
//		int n= a.length;
//		int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
//		int m = b.length;
//		HashSet<Integer> s = new HashSet<>();
//		for (int i = 0; i < n; i++)													//HashSet 
//			s.add(a[i]);   
//		for (int i = 0; i < m; i++)
//			s.add(b[i]);
//		System.out.print("Number of elements after union operation: " + s.size() + "\n");
//		System.out.println("The union set of both arrays is :" + s.toString());   
		
		System.out.println();
		HashSet<Integer> s1 = new HashSet<>();
		Integer a1[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
		s1.addAll(Arrays.asList(a1));												//Static Initialization
		Integer b1[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
		s1.addAll(Arrays.asList(b1));
		System.out.print("Number of elements after union operation: " + s1.size() + "\n");
		System.out.println("The union set of both arrays is :" + s1.toString()); 
	}
}
