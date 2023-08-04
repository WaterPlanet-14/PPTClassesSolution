package assignment3;

public class matrixMultiplication_q3 {
	public static void main(String[] args) {
		int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
		int A[][] = { { 1, 1, 1 },
	                      { 2, 2, 2 },
	                      { 3, 3, 3 },
	                      { 4, 4, 4 } };
		int B[][] = { { 1, 1, 1, 1 },
	                      { 2, 2, 2, 2 },
	                      { 3, 3, 3, 3 } };
		int i, j, k;
		if (row2 != col1) { 
			System.out.println("Multiplication Not Possible");
			return;
		}
	      int C[][] = new int[row1][col2];
	      for (i = 0; i < row1; i++) 
	     	 for (j = 0; j < col2; j++) 
	     		 for (k = 0; k < row2; k++)
	     			 C[i][j] += A[i][k] * B[k][j];
	      System.out.println("Resultant Matrix:");
	      for (i = 0; i < row1; i++) { 
	     	 for (j = 0; j < col2; j++)
	     		 System.out.print(C[i][j] + " ");
	     	 System.out.println(" ");
	      }
	}
}
