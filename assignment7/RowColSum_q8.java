package assignment7;

public class RowColSum_q8 {
	 public static void main(String[] args) {    
		 int rows, cols, sumRow, sumCol;    
		 int a[][] = { {1, 2, 3},    
				 	   {4, 5, 6},    
	                       {7, 8, 9} };    
		 rows = a.length;    
		 cols = a[0].length;  
		 for(int i = 0; i < rows; i++){    
			 sumRow = 0;    
			 for(int j = 0; j < cols; j++)   								//sum of each row
				 sumRow = sumRow + a[i][j];     
			 System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
		 }    
		 for(int i = 0; i < cols; i++){    
			 sumCol = 0;    
			 for(int j = 0; j < rows; j++)								//sum of each column
				 sumCol = sumCol + a[j][i];        
			 System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
		 }    
	 }    
}
