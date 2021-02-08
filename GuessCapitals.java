package HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuessCapitals {
	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);
		Map<String, String> UScapitals = new HashMap<String, String>();
		String[][] statecaps = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
				{"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
				{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
				{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
				{"Nevada	", "Carson City"}, {"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
				{"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}};

			for (int i = 0; i < statecaps.length; i++) {
				UScapitals.put(statecaps[i][0], statecaps[i][1]);
			}
		
		System.out.print("Please enter a state with the proper capitilization: ");
		String state = input.nextLine();
	
	
		if (UScapitals.get(state) != null) {
			System.out.println( state + "'s capital is " 
				+ UScapitals.get(state) + ".");
		}
		else {
			System.out.println("You didn't enter a US state. Please try again");
		}
	}



}
