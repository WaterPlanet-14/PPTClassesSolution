package assignment7;

public class TempConv_q4 {
	public static void main(String[] args){
		double celsius = 10.0, fahrenheit = 0.0;
		fahrenheit = (celsius * 1.8) + 32;													//celsius to fahrenheit
		System.out.println(" value of temperature in fahrenheit:" + fahrenheit);
		
//		double fahrenheit = 50.0, celsius = 0.0;
		celsius = (fahrenheit - 32) / 1.8;														//fahrenheit to celsius
		System.out.println( "value of temperature in celsius:" + celsius);
	}
}
