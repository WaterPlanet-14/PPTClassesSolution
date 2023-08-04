package assignment8;

import java.util.Scanner;

public class Average_q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		sc.close();
		double average = calculateAverage(num1, num2, num3);
		System.out.println("The average of the three numbers is: " + average);
	}
	public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}