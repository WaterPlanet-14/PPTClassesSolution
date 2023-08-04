package assignment1;
import java.util.Scanner;
public class swapping_q2 {  //Swapping without third variable
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Please enter your first number : ");a = sc.nextInt();
		System.out.print("Please enter your second number : ");b = sc.nextInt();
		System.out.println();
		System.out.println("The numbers are a = " + a +" and b = " + b );
		a = a+b;
		b = a-b;                 //Swapping numbers
		a = a-b;
		System.out.println("Swapping the numbers .... ");
		System.out.println("4Now, the numbers are a = " + a +" and b = " + b );
		sc.close();
	}
}