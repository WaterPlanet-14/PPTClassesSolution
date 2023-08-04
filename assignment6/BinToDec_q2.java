package assignment6;

public class BinToDec_q2 {
	public static void main(String args[]){  
		String binaryString="1010";  
		int decimal=Integer.parseInt(binaryString,2);                  					//In Built Function
		System.out.println("Decimal of 10101 is: "+decimal);  
		System.out.println("Decimal of 10101 is: "+getDecimal(10101));  
		System.out.println("Decimal of 11111 is: "+getDecimal(11111)); 
	}
	public static int getDecimal(int binary){  
		    int decimal = 0;  
		    int n = 0;  
		    while(true){  
		      if(binary == 0){  
		        break;  															//Custom Logic
		      } else {  
		          int temp = binary%10;  
		          decimal += temp*Math.pow(2, n);  
		          binary = binary/10;  
		          n++;  
		       }  
		    }  
		    return decimal;  
		} 
}
