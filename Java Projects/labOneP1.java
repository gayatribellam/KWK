package Labs;

import java.util.Scanner;

public class labOneP1 {


		public static void main(String[] args) { 
	        int[] numbers = new int[10];
	        int num;
	        int count = 0;
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter ten numbers: ");       
	        for(int i = 0; i < 10; i++) {
	        	//getting input
	            num = input.nextInt();
	            boolean dist = true;
	            //check if distinct
	            for(int j = 0; j < count; j++) {
	                if (num == numbers[j]) {
	                    dist = false;
	                    break;
	                }
	            }
	            if (dist == true) {
	            	numbers[count++] = num;
	            }
	        }
	        if(count == 1) {
	        System.out.println("There is " + count + " distinct number:"); }
	        else {
	        	System.out.println("There are " + count + " distinct numbers:");
	        	
	        }
	        for(int i = 0 ; i < count; i++) {
	        	System.out.print(" " + numbers[i]);   
	        }
	    }

	
}

