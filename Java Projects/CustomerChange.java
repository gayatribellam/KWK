import java.util.Scanner;
public class CustomerChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Price $"); //Actual cost
		double price = input.nextDouble();
		System.out.println("from: $"); //
		double from = input.nextDouble();
		
		double change = from - price;
		int rem = (int)(change*100);
		System.out.println(rem);
		int bill20, bill10, bill5, bill1, qs,ds,ns,ps;
		
		bill20 = rem/2000;
		System.out.println(bill20);
		rem = rem % 2000;
		
		bill10 = rem/1000;
		rem = rem % 1000;
		
		bill5 = rem/500;
		rem = rem % 500;
		
		bill1 = rem/100;
		rem = rem % 100;
		
		qs = rem / 25;
		rem = rem % 25;
		ds = rem / 10;
		rem = rem % 10;
		ns = rem / 5;
		rem = rem % 5;
		ps = rem;
		System.out.printf("Change owed is" + change);
		System.out.println(bill20 + " x $20 bills");
		System.out.println(bill10 + " x $10 bills");
		System.out.println(bill5 + " x $5 bills");
		System.out.println(bill1 + " x $1 bills");
		System.out.println(qs + " x 25c cpins");
		System.out.println(ds + " x 10c cpins");
		System.out.println(ns + " x 5c cpins");
		System.out.println(ps + " x 1c cpins");
		
	}

}
