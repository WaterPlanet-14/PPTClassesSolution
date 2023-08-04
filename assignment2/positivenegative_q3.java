package assignment2;

import java.util.Scanner;


public class positivenegative_q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
//		if(n>0) 
//			System.out.println("The given number " + n + " is positive.");
//		else if (n<0)
//			System.out.println("The given number " + n + "is negative.");					//if else statement
//		else
//			System.out.println("The number is Zero.");
		
//		int result=Integer.signum(n);  															//Integer signum function for int 
//
//		double result = Math.signum(n);														//Math signum function for double,float
//		if (result == 1.0)
//			System.out.println("It is a positive number.");
//		else if(result == -1.0)
//			System.out.println("It is a negative number.");
//		else
//			System.out.println("The given number is zero.");
//		
		String[] res = {"Positive", "Negative"}; 												//Shift operator
		System.out.println(res [(n >> 31) & 1]); 
	}
}
