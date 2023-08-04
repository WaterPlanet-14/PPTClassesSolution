package assignment2;

import java.util.Scanner;

public class evenodd_q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		
//		if (n%2 == 0)
//			System.out.println("The given number is even");						// if-else
//		else																					// statement
//			System.out.println("The given number is odd");
//		
//		
//		String result = ( n%2 ==0 ) ? "even" : "odd";									//Ternary operator
//		System.out.println("The given number " + n + " is " + result);
//		
//		
//		if (  (n | 1) > n           ||        		 // if n|1 if greater than n then this number is even
//			 (n & 1) == 0      ||        		 //Bitwise AND of any even number by 1 gives 0
//			 (n ^ 1) == n + 1  )		//if number^1 increments by 1 then its even number 
//			System.out.println("The number is even.");																//Bitwise operators				
//		else																													
//			System.out.println("The number is odd.");

		
		if (n != 0) {
			if (Integer.toBinaryString(n).endsWith("0")) 
				System.out.println("The number is even.");													
			else 																						//ends with (least significant digit)
				System.out.println("The number is odd.");	
		}
		else
			System.out.println("The number is zero.");
	}
}
