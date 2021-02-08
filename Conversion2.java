
public class Conversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s %8s    |     %-8s %10s%n",
	            "Kilograms",
	            "Pounds",
	            "Pounds",
	            "Kilograms");
	            
	   int pounds = 20;
	   for (int i = 1; i < 200; i += 2){
	            System.out.printf("%-10d %8.1f    |     %-8d %10.2f%n", 
	            i,
	            i * 2.2,
	            pounds,
	            pounds * 0.4545);
	            pounds += 5;
	            
	        
	            
	}
	   
	  
	}
	
	
}


