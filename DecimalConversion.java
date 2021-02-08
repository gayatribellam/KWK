import java.util.Scanner;
public class DecimalConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter decimal number: ");
		int d = input.nextInt();
		String binary = "";
		int q = d;
		while(q != 0) {
			binary =   (q%2)+ binary;
			q = q /2;
			
		}
		System.out.println("binary is : (" + binary + ")_2");
		
		String octal = "";
		q = d;
		while(q != 0) {
			octal =   (q%8)+ octal;
			q = q /8;
			
		}
		System.out.println("Octal is : (" + octal + ")_8");
		
		String hex = "";
		q = d;
		while(q != 0) {
			int r = q % 16;
			String h = "";
				if (r<10)
					h +=r;
				else 
					h+= (char)(r-10+'A');
			hex =   h + hex;
			q = q /16;
			
		}
		System.out.println("Hex is : (" + hex + ")_H");
		
	}
	
}
