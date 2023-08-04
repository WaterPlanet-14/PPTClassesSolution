package assignment2;

import java.util.Scanner;

public class leapyear_q8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		sc.close();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
		
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else 		//divisible by 100 but not by 400
					leap = false;
			}																			//brute force
			else
				leap = true;
		}
		else
			leap = false;	
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}

