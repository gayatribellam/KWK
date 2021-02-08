//Gayatri Bellam
//SBU ID: 112809003
//CSE 160.01
//Assignment: Homework 4

import java.util.Scanner;
public class BaseToBase {

	public static void main(String[] args) {
		//Getting user inputs
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter number: ");
		 String number = input.next().toUpperCase();
		 System.out.print("Enter starting base: ");
	     int startbase = input.nextInt();
	     System.out.print("Enter ending base: ");
	     int endbase = input.nextInt();
		
	     
	     int temporary = 0;
	     int powerResult = 1; 
	     int numcount = 0;
	        String tempResult = "";
	        int power = 0; 
	        int a = 0;
	        int tempCount = 0;
	        String finalResult = "";
	     
	     if (startbase < 10) {
	            int num = Integer.parseInt(number);
	            for (int i = 0; i < number.length(); i++) {
	                int first = num % 10;
	                if (power == 0) {
	                    temporary += first;
	                    power++;
	                }
	                else {
	                    for (int j = 0; j<power; j++) {
	                        powerResult = powerResult* startbase;
	                    }
	                    temporary = temporary + (first * powerResult);
	                    powerResult = 1;
	                    power++;
	                }
	                num /= 10;
	            }
	            
	 
	           while (temporary != 0 && endbase !=10) {
	                    int first = temporary % endbase;
	                    if (first < 10) {
	                        tempResult += Integer.toString(first);
	                    }
	                    else {
	                        tempResult += (char)(55+first);
	                    }
	                    temporary /= endbase;
	                }
	                tempCount = tempResult.length();
	            
	        }
	        else if(startbase >=10){
	            numcount = number.length();
	            for (int i = 0; i < numcount; i++) {
	                char f = number.charAt(number.length()-1);
	                if (Character.isAlphabetic(f)) {
	                    a = Character.getNumericValue(f);
	                }
	                else {
	                    a = Character.getNumericValue(f);
	                }
	                if (power == 0) {
	                    temporary += a;
	                    power++;
	                }
	                else {
	                    for (int j = 0; j<power; j++) {
	                        powerResult *= startbase;
	                    }
	                    temporary = temporary + (a * powerResult);
	                    powerResult = 1;
	                    power++;
	                }
	                number = number.substring(0, number.length()-1);
	            }
	          
	                while (temporary != 0) {
	                    int fc = temporary % endbase;
	                    if (fc < 10) {
	                        tempResult += Integer.toString(fc);
	                    }
	                    else {
	                        tempResult += (char)(55+fc);
	                    }
	                    temporary /= endbase;
	                }
	                tempCount = tempResult.length();
	            }
	        
	     
	     if (endbase == 10) {
             finalResult = Integer.toString(temporary);
         }
         
	        for (int i = tempCount - 1; i>=0; i--)
	            finalResult += tempResult.charAt(i) + "";
	        System.out.print("Result: " + finalResult);
	    }	

}
