import java.util.Scanner;

public class Stringone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter password with numbers, "
				+ "lower/upper case letters");
		String pass = input.nextLine(); //anything that user enters in one line
		
		boolean valid = true;
		if (pass.length() < 8) 
			valid = false; 
		else {
			boolean contains_digits = false; 
			for(int i = 0; i < pass.length(); i++) 
				if(Character.isDigit(pass.charAt(i))) 
					contains_digits = true;
				
			if(!contains_digits)
				valid = false;
			else {
				boolean lower_case = false;
				for(int i = 0; i < pass.length(); i++)
	    	
					if('a' <= pass.charAt(i) && pass.charAt(i) <='z') 
						lower_case = true;
	    		
				if(!lower_case)
	    			valid=false;
	    	else {
	    		boolean uppercase = false;
	    		for(int i = 0; i < pass.length(); i++)
		    	
		    		if('A' <= pass.charAt(i) && pass.charAt(i) <='Z') 
		    			uppercase = true;
		    		
		    		if(!uppercase)
		    			valid=false;
		    		else
		    			if(!pass.matches(".*[!@#$%^&*()_\\-].*"))
		    					valid = false;
		    			
	    		
	    	
	    	}
	    }

	
		}
		System.out.println("Correctness of password \" " + pass + "\" is" + valid);
		
		}
}
		
		
		
	
	
		
		
	
	

	
	


