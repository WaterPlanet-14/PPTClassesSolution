package assignment6;

public class NoOfDigit_q5 {
	 public static void main(String[] args) {
		 int count = 0, num = 0021303452;
//		 while (num != 0) {
//			 num /= 10;										//while loop
//			 ++count;
//		 }
		 
		 for (; num != 0; num /= 10, ++count) {				//for loop
		 }
		 System.out.println("Number of digits: " + count);
	 }
}
