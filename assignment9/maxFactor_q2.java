package assignment9;

public class maxFactor_q2 {	
	static long maxPrimeFactors( long val){
		long max_prime = -1;
		while (val % 2 == 0) {
			max_prime = 2;
			val >>= 1;
		}
		for (int i = 3; i <= Math.sqrt(val); i += 2){
			while (val % i == 0){
				max_prime = i;
				val = val / i;
			}
		}
		if (val > 2)
			max_prime = val;
		return max_prime;
	}	
	public static void main(String[] args){
		int val = 151;
		System.out.println("The largest prime factor of 151 is ");
		System.out.println(maxPrimeFactors(val));
		val = 890654;
		System.out.println("The largest prime factor of 890654 is ");
		System.out.println(maxPrimeFactors(val));
	}
}
