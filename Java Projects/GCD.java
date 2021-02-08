package Recursion;
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2");
		int num2 = input.nextInt();
		
		System.out.println("The GCD is " + findGCD(num1,num2));
		
	}
	
	public static int findGCD(int m, int n) {
		if(m%n == 0)
			return n;
		else
			return findGCD(n,m%n);
		
		
		
		
		
	}
}
