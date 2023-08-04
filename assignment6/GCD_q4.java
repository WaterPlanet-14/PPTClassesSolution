package assignment6;

public class GCD_q4 {
	public static void main(String args[]) {
		int x=24,y=144,gcd=1;
		for(int i=1;i<=x && i<=y ; i++) 
			if(x % i == 0 && y % i == 0)												//for loop
				gcd = i;
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
		
		System.out.println();
		while(x!=y)  {  
			if(x>y)  
				x=x-y;  																	//while loop
			else  
				y=y-x;  
		}  
		System.out.println("GCD of n1 and n2 is: " +y);
		System.out.println("GCD of x and y is: " +findGCD(168,42));
	}
	static int findGCD(int a, int b) {   
		if (b == 0)   
			return a;     															//recursive loop
		return findGCD(b, a % b);   
	}   
}
