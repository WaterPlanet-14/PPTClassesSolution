package assignment8;

import java.util.Scanner;

public class Area_q3 {
	private double length;
	private double breadth;
	public Area_q3(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double calculateArea() {
		return length * breadth;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle:");
		double breadth = sc.nextDouble();
		sc.close();
		Area_q3 rectangle = new Area_q3(length, breadth);
		double area = rectangle.calculateArea();
		System.out.println("The area of the rectangle is: " + area);
	}
}
