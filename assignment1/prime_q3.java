package assignment1;
import java.util.Scanner;
public class prime_q3{
	static String isPrime(int n){
		if (n <= 1)
			return "The given number is not prime.";
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return "The given number is not prime.";
		return "The given number is prime.";
	}
	public static void main(String args[]) {
//		String ch = "n";
		Scanner sc = new Scanner(System.in);
//		do {
			System.out.print("Enter a number to check prime or not : ");
			int n = sc.nextInt();
			System.out.println(isPrime(n));
//			System.out.println("Do you want to check more numbers (Enter Yes/Y to continue) ");
//			ch = sc.next();
//		} while( ((ch == "Y") || (ch == "Yes") || (ch == "y") || (ch == "yes")) == true );
		System.out.println("Program Complete !! ");
		sc.close();
	}
}
