import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month(1-12)");
		int month = input.nextInt();
		System.out.print("Enter the year(AD:)");
		int year = input.nextInt();
		switch(month) {
		case 1: System.out.println("January of " + year + " has 31 days"); break;
		case 2: System.out.println("Feb of " + year + " has" + (((year%400 ==0)
				|| (year%4 == 0 & year%100 !=0))?29:28) + "days"); break;
				
		
		
		case 3: System.out.println("March of " + year + "has 31 days"); break;
		case 4: System.out.println("Apr of " + year + " has 30 days"); break;
		case 5: System.out.println("May of " + year + " has 31 days"); break;
		case 6: System.out.println("June of " + year + " has 30 days"); break;
		case 7: System.out.println("July of " + year + " has 31 days"); break;
		case 8: System.out.println("Aug of " + year + " has 31 days"); break;
		case 9: System.out.println("Sep of " + year + " has 30 days"); break;
		case 10: System.out.println("Oct of " + year + " has 31 days"); break;
		case 11: System.out.println("Nov of " + year + " has 30 days"); break;
		case 12: System.out.println("Dec of " + year + " has 31 days"); break;
		}
	}

}
