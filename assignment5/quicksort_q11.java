package assignment5;

public class quicksort_q11 {
	static int partition (int a[], int start, int end)  {  
		int pivot = a[end];
		int i = (start - 1);  
		for (int j = start; j <= end - 1; j++)   {  
			if (a[j] < pivot) {  
				i++; 
				int t = a[i];  
				a[i] = a[j];  
				a[j] = t;  
			}  
		}  
		int t = a[i+1];  
		a[i+1] = a[end];  
		a[end] = t;  
		return (i + 1);  
	}  
	static void quick(int a[], int start, int end){  
		if (start < end)   {  
			int p = partition(a, start, end); 
			quick(a, start, p - 1);  
			quick(a, p + 1, end);  
		}  
	}  
	static 	void printArr(int a[], int n)  {  
		int i;  
		for (i = 0; i < n; i++)  
			System.out.print(a[i] + " ");  
		System.out.println();
	}  
	public static void main(String args[])  {  
		int a[] = { 24, 9, 29, 14, 19, 27 };  
		int n = a.length;
		System.out.println("Before sorting array elements are - \n");  
		printArr(a, n);  
		quick(a, 0, n - 1);  
		System.out.println("\nAfter sorting array elements are - \n");    
		printArr(a, n);   
	}  
}
