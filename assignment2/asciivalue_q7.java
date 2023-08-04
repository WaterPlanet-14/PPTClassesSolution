package assignment2;

import java.util.Scanner;

public class asciivalue_q7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to find its ASCII value : ");
		char ch = sc.next().charAt(0);
		sc.close();
		int ascii = ch;
		System.out.println("The ASCII value of " + ch + " is " + ascii);					//brute force
		
//		System.out.println("The ASCII value of " + ch + " is " + (int) ch);				//Type Casting
	}
}
