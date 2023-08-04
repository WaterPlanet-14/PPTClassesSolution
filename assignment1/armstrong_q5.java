package assignment1;
import java.util.Scanner;
public class armstrong_q5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is an armstrong number : ");
		int n = sc.nextInt();
		int temp = n;
		int p = 0;
		while (n > 0) {
			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}
		if (temp == p) {
			System.out.println("Yes, it is armstrong number.");
		}
		else {
			System.out.println("No, it is not an armstrong number.");
		}
		sc.close();
	}
}
