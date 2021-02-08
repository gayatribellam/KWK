package HW2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class NonduplicateWords {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
        String fileName = input.next();

        Scanner file = new Scanner(new File(fileName));

        TreeSet<String> words = new TreeSet<String>();

       
        while(file.hasNext()) {
            String word = file.next();
            if(Character.isAlphabetic(word.charAt(0))) {
                words.add(word);
            }
        }

       
      
        System.out.println("Words in ascending order:");
        for(String word: words) {
            System.out.println(word);
        }

   

    }

        


    

}
