import java.util.Scanner;

public class Stringthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string for matching");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		boolean c = true;
		
		System.out.println("Correct:" + s.matches("[\\d]{5}(-[\\d]{4})?"));
	}

}
