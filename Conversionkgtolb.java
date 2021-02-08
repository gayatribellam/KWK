import java.util.Scanner;
public class Conversionkgtolb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilogram = 2.2;
		System.out.println("Kilograms     Pounds");
		for(int i=1; i<=199; i+=2) {
			//System.out.printf("%.2f\n",i,(kilogram*i));
			System.out.printf("%-15d%6.1f\n",i,(kilogram*i));
		}
	

	}

}
