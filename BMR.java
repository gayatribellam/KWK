//Gayatri Bellam
//SBU ID: 112809003
//CSE 160.01
//Assignment: Homework 2
//
import java.util.Scanner;

public class BMR {

		
	   public static void main(String args[]){
	
		  Scanner read = new Scanner(System.in);
		   double weight;
		   double inches;
		   int age;
		   String gender;
		   System.out.print("Enter the person's weight in pounds : ");
		   weight=read.nextDouble();
		   System.out.print("Enter person's height in inches: ");
		   inches=read.nextDouble();
		   System.out.print("Enter the person's age: ");
		   age=read.nextInt();
		   System.out.print("Enter the person's gender either 'M' or 'F': ");
		   gender=read.next();
		   
		   System.out.println(bmr(weight, inches, age, gender.charAt(0)));
		   
		   System.out.println(bmr(130, 66, 55, 'F'));
		   System.out.println(bmr(130, 66, 55, 'M'));
		   
		   
	

}
	
		   
		   public static double bmr(double pounds, double inches, int age, char gender) {
			double weightconversion = pounds*0.453592;
			double inchesconversion = inches*2.54;
			double bmr=0.0;
			if(gender == 'M') {
				bmr = (10*weightconversion)+(6.25*inchesconversion)-(5*age)+5;
			}
			else if(gender == 'F'){
				bmr = (10*weightconversion)+(6.25*inchesconversion)-(5*age)-161;
			}
			
			
		   
		   return bmr;
		}
		   
}
		
		
