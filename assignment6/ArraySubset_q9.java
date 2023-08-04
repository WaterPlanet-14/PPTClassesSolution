package assignment6;

import java.util.HashSet;

public class ArraySubset_q9 {
	public static void main(String args[]) {
	      int array1[] = { 33, 51, 5, 31, 9, 4, 3 };
	      int array2[] = { 51, 9, 33, 3 };
	      int x = array1.length;
	      int y = array2.length;
	      if (subset(array1, array2, x, y)) 
	         System.out.print("array 2 is a subset of array 1");
	      else 
	         System.out.print("array 2 is not a subset of array 1");	 
	      System.out.println();
	      if (subset2(array1, array2, x, y)) 
		         System.out.print("array 2 is a subset of array 1");
		      else 
		         System.out.print("array 2 is not a subset of array 1");	      
	   }
	
	   static boolean subset(int array1[], int array2[], int x, int y) {
	      int i, j = 0;
	      for (i = 0; i < y; i++) {
	         for (j = 0; j < x; j++)
	            if (array2[i] == array1[j])										//using for loops
	               break;     
	         if (j == x)
	            return false;
	      }
	      return true;
	   }
	   
	   static boolean subset2(int arr1[], int arr2[], int x, int y) {
		   HashSet<Integer> hashset = new HashSet<>();
		   for (int i = 0; i < x; i++) {
			   if (!hashset.contains(arr1[i]))
				   hashset.add(arr1[i]);								//HashSet
		   }
		   for (int i = 0; i < y; i++) 
		         if (!hashset.contains(arr2[i]))
		     	    return false;  
		   return true;
	   }
}
