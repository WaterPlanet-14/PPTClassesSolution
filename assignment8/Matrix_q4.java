package assignment8;
public class Matrix_q4 {
	    private int[][] matrix;
	    private int rows;
	    private int columns;

	    public Matrix_q4(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        matrix = new int[rows][columns];
	    }

	    public int getRows() {
	        return rows;
	    }

	    public int getColumns() {
	        return columns;
	    }

	    public void setElement(int i, int j, int value) {
	        if (i >= 0 && i < rows && j >= 0 && j < columns) {
	            matrix[i][j] = value;
	        } else {
	            System.out.println("Invalid position.");
	        }
	    }

	    public int getElement(int i, int j) {
	        if (i >= 0 && i < rows && j >= 0 && j < columns) {
	            return matrix[i][j];
	        } else {
	            System.out.println("Invalid position.");
	            return 0;
	        }
	    }

	    public void add(Matrix_q4 other) {
	        if (this.rows == other.rows && this.columns == other.columns) {
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < columns; j++) {
	                    matrix[i][j] += other.getElement(i, j);
	                }
	            }
	        } else {
	            System.out.println("Matrices cannot be added.");
	        }
	    }

	    public Matrix_q4 multiply(Matrix_q4 other) {
	        if (this.columns != other.rows) {
	            System.out.println("Matrices cannot be multiplied.");
	            return null;
	        }

	        Matrix_q4 result = new Matrix_q4(this.rows, other.columns);
	        for (int i = 0; i < this.rows; i++) {
	            for (int j = 0; j < other.columns; j++) {
	                for (int k = 0; k < this.columns; k++) {
	                    result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
	                }
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Matrix_q4 matrix1 = new Matrix_q4(2, 3);
	        Matrix_q4 matrix2 = new Matrix_q4(3, 2);

	        // Set elements
	        matrix1.setElement(0, 0, 1);
	        matrix1.setElement(0, 1, 2);
	        matrix1.setElement(0, 2, 3);
	        matrix1.setElement(1, 0, 4);
	        matrix1.setElement(1, 1, 5);
	        matrix1.setElement(1, 2, 6);

	        matrix2.setElement(0, 0, 7);
	        matrix2.setElement(0, 1, 8);
	        matrix2.setElement(1, 0, 9);
	        matrix2.setElement(1, 1, 10);
	        matrix2.setElement(2, 0, 11);
	        matrix2.setElement(2, 1, 12);
	        matrix1.add(matrix2);
	        Matrix_q4 result = matrix1.multiply(matrix2);
	        if (result != null) {
	            System.out.println("Result of multiplication:");
	            for (int i = 0; i < result.rows; i++) {
	                for (int j = 0; j < result.columns; j++) 
	                    System.out.print(result.getElement(i, j) + " ");	                
	                System.out.println();
	            }
	        }
	    }
	}