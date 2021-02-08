//(Maximum consecutive increasingly ordered substring) Write a program that prompts the user to enter a string and displays the maximum consecutive increasingly ordered substring. Analyze the time complexity of your program. Here are sample runs:
//Enter a string: abcabcdgabxy
//Result: abcdg
//Enter a string: abcabcdgabmnsxy
//Result: abmnsxy
package Lab7;
import java.util.LinkedList;
import java.util.Scanner;


public class Lab7Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Character> tmp = new LinkedList<>();
		LinkedList<Character> result = new LinkedList<>();
		
		System.out.print("Enter a string:");
		String str = input.nextLine();
		
		for(int i=0; i < str.length(); i++) {
			if(tmp.size()>1) {
				if(tmp.getLast() >= str.charAt(i)) {
					tmp.clear();
				}
				
			}
			tmp.add(str.charAt(i));
			
			if(tmp.size() > result.size()) {
				result.clear();
				result.addAll(tmp);
			}
			
		}
		
		for(Character c:result) {
			System.out.print(c);
		}
		
		if(str=="yes") {
			
		}
		
		
	}
	

}
