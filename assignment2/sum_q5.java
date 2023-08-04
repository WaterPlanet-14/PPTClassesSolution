package assignment2;

import java.util.Scanner;

public class sum_q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		int i=1,sum=0;
		while(i <= n){  //for(int i=1;i<=n;i++)
			sum += i;												//while (for) loop
			i++;
		}
		System.out.println("Sum = " + sum);
		
//		int sum2 = addNumbers(n);
//		System.out.println("Sum = " + sum2);
	}
//	public static int addNumbers(int num) {
//		if (num != 0)
//			return num + addNumbers(num - 1);     			//recursive and function
//		else
//			return num;
//	}
}
