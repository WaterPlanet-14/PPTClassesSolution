package assignment7;

import java.util.Arrays;

public class ThirdLargestEle_q6 {
	 public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int max = array[size-3];
	      System.out.println("3rd largest element is :"+max);
	 }
}
