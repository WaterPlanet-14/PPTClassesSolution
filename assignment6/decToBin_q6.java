package assignment6;

public class decToBin_q6 {
	public static void main(String args[]){  
		System.out.println(Integer.toBinaryString(10));  			//In Built Function
		 int n = 17;
		 System.out.println("Decimal - " + n);
		 System.out.print("Binary - ");
	      decToBinary(n);
	      System.out.print("Binary - ");
	      decToBinary2(n);
	}
	static void decToBinary(int n){
		int[] binaryNum = new int[1000];
	     int i = 0;
	     while (n > 0) {  
	     	binaryNum[i] = n % 2;
	     	n = n / 2;													//Custom Logic
	     	i++;
	     }
	     for (int j = i - 1; j >= 0; j--)
	     	System.out.print(binaryNum[j]);
	}
	public static void decToBinary2(int n)
	    {
	        // Size of an integer is assumed to be 32 bits
	        for (int i = 31; i >= 0; i--) {
	            int k = n >> i;
	            if ((k & 1) > 0)												//Binary Operator
	                System.out.print("1");
	            else
	                System.out.print("0");
	        }
	    }
}
