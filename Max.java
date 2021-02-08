package HW1;

public class Max {

	    public static void main(String[] args)
	   {
	       
	        Integer[] arr = new Integer[10];
	       
	        //filling array with numbers
	       for (int i = 0; i < arr.length; i++) {
				arr[i] = i+2;
				}
	       
	       System.out.println("Values in the array:");
	       for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ",");
				}
	       
	       
	 

	        System.out.println("");
	        System.out.println("Maximum value in the list is: " + max(arr));
	    }
	    
	 
	    public static <E extends Comparable<E>> E max(E[] list)
		   {
		       
		        E max = list[0];
		      
		      
		        for (int j = 1; j < list.length; j++)
		       {
		         
		            E element = list[j];
		          
		           
		            if (element.compareTo(max) > 0)
		           {
		               
		                max = element;
		            }
		        }

		    
		        return max;
		    }

	
	}
	

