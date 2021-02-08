import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
	System.out.print("Enter a degree in Celsius: ");
	Scanner input = new Scanner(System.in);
	double celsius = input.nextDouble();
	double fahrenheit = 9.0/5 * celsius + 32;
	System.out.println(celsius + " temperature in Celsius is " + fahrenheit + " in Fahrenheit degrees");
		
	}
}
