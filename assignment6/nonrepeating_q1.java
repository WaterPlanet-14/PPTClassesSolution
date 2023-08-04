package assignment6;

public class nonrepeating_q1 {
	 public static void main(String args[]) {
	        String str ="prepin hbugiuy uhyguy wer";
	        boolean flag = true;
	        System.out.print("Non repeating characters are : ");
	        for(char i :str.toCharArray()){												//Using String Function
	            if (str.indexOf(i) == str.lastIndexOf(i)) {
	          	  System.out.print(i+ " ");
	          	  flag = false;
	            }
	        }
	        if(flag)
	     	   System.out.println("There is no non repeating character in input string");    
	 } 
}
