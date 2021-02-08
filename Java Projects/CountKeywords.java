package HW2;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the name of the Java file");
		Scanner input = new Scanner(System.in);
		String fName = input.next();
		
		File file = new File(fName);
		if (file.exists()) {
			System.out.println("The number of Java keywords in the file named " + fName + " is " 
			+ numberOfKeyWords(file));
		}
		else {
			System.out.println("Error file can't be found since it doesn't exist");
		}
	}


	public static int numberOfKeyWords(File file) throws Exception {
		
		String[] javaKeywords = {"abstract", "assert", "boolean",
			"break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "enum",
			"extends", "for", "final", "finally", "float", "goto",
			"if", "implements", "import", "instanceof", "int",
			"interface", "long", "native", "new", "package", "private",
			"protected", "public", "return", "short", "static",
			"strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "try", "void", "volatile",
			"while", "true", "false", "null"};

		Set<String> keywordSet = 
			new HashSet<>(Arrays.asList(javaKeywords));
		int keywordCount = 0;

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String word = input.next();
			 if (keywordSet.contains(word)) {
				keywordCount++;
			 }
		}

		return keywordCount;
	}
}
