package assignment2;

import java.util.Scanner;

public class vowel_q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char n = sc.next().charAt(0);
		sc.close();
//		if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' )
//			System.out.println("The character entered " + n + " is a vowel.");							//if else
//		else																											//statement
//			System.out.println("The character entered " + n + " is a consonent." ); 
		
		switch(n) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				System.out.println("The character entered " + n + " is a vowel.");						//switch case
				break;
			default:
				System.out.println("The character entered " + n + " is a consonent." ); 
		}
			
	}
}
