package HW2;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountOccurrenceOfWords {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the name of the Java file");
		Scanner input = new Scanner(System.in);
		String fName = input.next();
		

		Map<String, Integer> map = new HashMap<>();
	

		String data = readFileAsString(fName);		
	
		String[] words = data.split("[ \n\t\r.,;:!?()]");
		
		for (String word: words) {
			String key = word.toLowerCase();

			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		

		
		ArrayList<WordOccurrence> list = new ArrayList<>();
		
		
		for (Map.Entry<String, Integer> entry: map.entrySet())
			list.add(new WordOccurrence(entry.getKey(), entry.getValue()));

	
		Collections.sort(list);

		for (WordOccurrence word : list) {
		    System.out.println(word);
		}
	
	}
	
	public static String readFileAsString(String fileName)throws Exception 
	  { 
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	  } 
}


