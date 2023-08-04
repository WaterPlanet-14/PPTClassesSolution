package assignment9;

public class sumoffactors_q3 {
	static boolean isPrime(int n){
	   if (n <= 1)
	        return false;
	    if (n <= 3)
	        return true;
	  if (n % 2 == 0 || n % 3 == 0)
	        return false;
	    for (int i = 5;
	             i * i <= n; i = i + 6)
	        if (n % i == 0 ||
	            n % (i + 2) == 0)
	            return false;
	    return true;
	}
	static int SumOfPrimeDivisors(int n){
	    int sum = 0;
	    for (int i = 1; i <= n; i++) 
	        if (n % i == 0)
	            if (isPrime(i))
	                sum += i;
	    return sum;
	}
	public static void main(String args[]){
	    int n = 60;
	    System.out.print("Sum of prime divisors of 60 is " + SumOfPrimeDivisors(n) + "\n");
	}
}
