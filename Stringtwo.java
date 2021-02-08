import java.util.Scanner;
public class Stringtwo {
	public static void main(String[] args) {
		System.out.println("Enter string for matching");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		boolean isAbc = true;
		if(s.length() != 11) 
			isAbc = false;
		for(int i =0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if((i ==3 && c!= '.') || (i ==7 && c!= '.')) {
				isAbc = false;
			}
			else {
				if(c == '\n') isAbc = false;
			}
			
		}
		System.out.println("isAbc:" + isAbc);
		System.out.println("isAbc:" + s.matches(  "[^\n][^\\n][^\\n]\\.[^\\n][^\\n][^\\n]\\.[^\\n][^\\n][^\\n]"));
		
	}
}
