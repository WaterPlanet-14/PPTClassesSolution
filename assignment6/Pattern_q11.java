package assignment6;

import java.util.Scanner;

public class Pattern_q11 {
	public static void main(String[] args) {
		int n, k, l, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of rows : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++){													//A 
			for(k = 1; k <= i; k++)												//A B A 
				System.out.print((char)(k+65-1) + " ");					//A B C B A
			for(l = i-1; l >= 1; l--)												//A B C D C B A 
				System.out.print((char)(l+65-1) + " ");
			System.out.print("\n");
		}
	}
}
