package assignment4;

public class patterns {
	public static void main(String[] args){
		int n=5;  
		int alphabet = 65;
		for (int i = 0; i <= 5; i++) { 								   	// 	      A 						
			for (int j = 5; j > i; j--)										// 	     B B 
				System.out.print(" ");									// 	   C C C
			for (int k = 0; k <= i; k++) {								// 	  D D D D 
				System.out.print((char) (alphabet) + " ");			//	 E  E  E  E  E 
			}																//	F  F  F  F  F  F 
			alphabet++;
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<n; i++)  {         			
			for(int j=0; j<=i; j++) {							//Right Triangle Star Pattern
				System.out.print("* ");
			}
			System.out.println(); 
		}
		
		System.out.println();
		for (int i=0; i<n; i++) { 
			for (int j = 0 ; j <n-i-1 ; j++) 							
				System.out.print(" ");							//Pyramid Star Pattern
			for (int j=0; j<2*i +1; j++ ) { 
				System.out.print("*");
			} 
			System.out.println();
          } 
	
		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) 							//Left Triangular Star Pattern
				System.out.print("  ");
			for (int j = 0; j <= n - i; j++) 
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) 
				System.out.print(" ");
			for (int j = 1; j < i ; j++) 
				System.out.print(" *");
			System.out.println();								//Diamond Pattern
		}
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) 
				System.out.print(" ");
			for (int j = 1; j < i ; j++) 
				System.out.print(" *");
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 
					System.out.print("* ");						//Hollow Rectangle Pattern
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();	
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) 						//Number increasing Pyramid Pattern
				System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println();	
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) 						//Number decreasing Pyramid Pattern
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println();	
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) 						//Number increasing Pyramid Pattern
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println();	
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) 						//Number decreasing Pyramid Pattern
				System.out.print(j + " ");
			System.out.println();
		}
		
	}
}
