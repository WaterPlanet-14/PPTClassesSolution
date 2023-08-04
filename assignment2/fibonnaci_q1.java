package assignment2;

import java.util.Scanner;

public class fibonnaci_q1 {
	static int fib(int n)	{
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	public static void main(String args[])  {    
		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int n = sc.nextInt();
//		int n1=0,n2=1,n3,i;    
//		System.out.print(n1+" "+n2);    
//		for(i=2;i<n;++i) {    													//For Loop
//			n3=n1+n2;    																			
//			System.out.print(" "+n3);    
//			n1=n2;    
//			n2=n3;    
//		}    
		
//		int j = 1; 
//		int n1=0,n2=1,n3;
//		System.out.println();
//		System.out.print("Enter a number : ");
//		int m = sc.nextInt();
//		System.out.println("Fibonacci Series till " + m + " terms:");					//While loop
//		while (j<= m) {
//			System.out.print(n1 + ", ");	
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;	
//			j++;
//		}	
		
		System.out.println();
		System.out.print("Enter a number : ");
		int o = sc.nextInt();															//Recursive method
		System.out.println(fib(o));											
		sc.close();
	}
}  

