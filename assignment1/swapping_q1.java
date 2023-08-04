package assignment1;
import java.util.Scanner;
public class swapping_q1 { //swapping with a third variable
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Please enter your first number : ");a = sc.nextInt();
		System.out.print("Please enter your second number : ");b = sc.nextInt();
		System.out.println();
		System.out.println("The numbers are a = " + a +" and b = " + b );
		c = a;
		a = b;                 //Swapping numbers
		b = c;
		System.out.println("Swapping the numbers .... ");
		System.out.println("4Now, the numbers are a = " + a +" and b = " + b );
		sc.close();
	}
}
