package HW2;

import java.util.*;
import java.io.*;

public class Letters {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a text file name: ");
		String fileName = input.next();


		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("The file " + fileName + " does not exist.");
			System.exit(1);
		}

		int vowels = 0; 
		int consonants = 0; 
		Map<String, Integer> map = new HashMap<>();
		map.put("A",0);
		map.put("E",0);
		map.put("I",0);
		map.put("O",0);
		map.put("U",0);
	
		Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
	

		
		
		try ( 
			Scanner inputF = new Scanner(file);
		) {
			while (inputF.hasNext()) {
				String line = inputF.nextLine();
				for (int i = 0; i < line.length(); i++) {
					
					if (set.contains(Character.toUpperCase(line.charAt(i)))) {
						char v = Character.toUpperCase(line.charAt(i));
						//System.out.println(Character.toUpperCase(line.charAt(i)));
					
						vowels++;
					
						incrementValue(map, Character.toString(v));
						
					}
						
					else if (Character.isLetter(line.charAt(i))) {
						consonants++;
					}
						
				}
			}
		}

		
		System.out.println("The file " + fileName + " has " + vowels + 
			" vowels and " + consonants + " consonants.");
		
		for (String key : map.keySet()) {
		
            String value =map.get(key).toString();  
            System.out.println(key + " appears " + value + " times");  
		}

	}
	
	public static<K> void incrementValue(Map<K,Integer> map, K key)
	{
	
		Integer count = map.get(key);

		
		if (count == null) {
			map.put(key, 1);
		}
	
		else {
			map.put(key, count + 1);
		}
	}
}