package assignment7;

public class UpperLowerTriangle_q7 {
	 public static void printMatrix(int[][] a) {
		 for (int i = 0; i < a.length; i++) {
			 for (int j = 0; j < a[0].length; j++)
				 System.out.print(a[i][j] + " ");
			 System.out.println();
		 }	
	 }	
	 public static void upperTriangularMatrix(int matrix[][]){
		 int row = matrix.length;
		 int col = matrix[0].length;
		 if (row != col) {
			 System.out.println( "Matrix should be a Square Matrix");
			 return;
		 }
		 else {																					//upper triangular form
			 for (int i = 0; i < row; i++) 
				 for (int j = 0; j < col; j++) 
					 if (i > j) 
						 matrix[i][j] = 0;	
			 System.out.println("Upper Triangular Matrix is given by :-");
			 printMatrix(matrix);
		 }
	 }
	 static void lowerTriangularMatrix(int matrix[][]){
		 int row = matrix.length;
		 int col = matrix[0].length;
		 if (row != col) {
			 System.out.println("Matrix should be a Square Matrix");
			 return;
		 }																							//lower triangular form
		 else {	
			 for (int i = 0; i < row; i++) 
				 for (int j = 0; j < col; j++)
					 if (i < j) 
						 matrix[i][j] = 0;
			 System.out.println("Lower Triangular Matrix is given by :-");
			 printMatrix(matrix);
		 }
	 } 
	 public static void main(String[] args){
		 int mat[][] = { { 2, 1, 4 }, { 1, 2, 3 }, { 3, 6, 2 } };
		 upperTriangularMatrix(mat);
		 int mat2[][] = { { 2, 1, 4 }, { 1, 2, 3 }, { 3, 6, 2 } };
		 lowerTriangularMatrix(mat2);
	 }
}
