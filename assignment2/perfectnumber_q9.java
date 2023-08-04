package assignment2;

import java.util.Scanner;

public class perfectnumber_q9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		int sum = 1; //1 is a common factor
		for (int i = 2; i < n; i++) 						//brute force				
			if (n % i == 0) 
				sum += i; 
				
//				if (i * i == n)
//					sum += i;							// root n time complexity
//				else
//					sum += i + (n / i);
		
//		int i = 1;											//recursive
//		long sum = isPerfect(n,i);
		
		if (sum == n)
			System.out.println("The given number " + n + " is a perfect number.");
		else
			System.out.println("The given number " + n + " is not a perfect number.");

//	}
//	static long sum = 0;
//	static long isPerfect(long num, int i ){
//		if (i <= num / 2) {
//			if (num % i == 0) 
//				sum = sum + i;								//recursive
//			i++;
//			isPerfect(num, i);
//		}
//		return sum;
	}
}
