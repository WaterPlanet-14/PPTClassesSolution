package assignment2;

import java.util.Scanner;

public class factorial_q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		int i,fact=1;  
		for(i=1;i<=n;i++)    
			fact=fact*i;    													//for loop
		System.out.println("Factorial of "+ n +" is: "+fact);
		
//		fact = factorial(n);
//		System.out.println("Factorial of "+ n +" is: "+fact);			//recursive
//	}	
//	static int factorial(int n){    
//		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
	}
}
