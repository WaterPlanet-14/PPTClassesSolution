package assignment5;

public class StringToInt_q3 {
	public static void main(String args[]){  
		String s="200";  
		int i=Integer.parseInt(s);  
		System.out.println(i); 
		int decimalExample = Integer.valueOf("20");
		int signedPositiveExample = Integer.valueOf("+20");
		int signedNegativeExample = Integer.valueOf("-20");
		System.out.println(decimalExample);
		System.out.println(signedPositiveExample);
		System.out.println(signedNegativeExample);
	}
}
