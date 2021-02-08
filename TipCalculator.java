import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your subtotal");
		Scanner st = new Scanner(System.in);
		 double subtotal = st.nextDouble();
		 double tip = subtotal * 0.15;
		if(subtotal < 30) {
			
			tip=5;
			System.out.println("");
		}
	
			
		System.out.printf("The tip is (15 percent): $%.2f\n",tip );
		System.out.printf("The total is $%.2f", subtotal+tip);
		
		
		
		
		
	}

}
