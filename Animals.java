//Gayatri Bellam
//SBU ID: 112809003
//CSE 160.01
//Assignment: Homework 2
//
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pricePerCat(2541.78,54,25));
	}
	
	public static double pricePerCat(double budget, int dogs, int cats) {
		
		double price = budget /((3*dogs) + (1.0*cats));
		return price;
	}

}
