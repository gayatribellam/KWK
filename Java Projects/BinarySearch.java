package HW1;

public class BinarySearch {
	
	  public static void main(String[] args) {
		  
		  
		  Integer[] ints = {2, 4, 6, 8, 10, 12};
	        System.out.println(binarySearch(ints, 6)); 
	        System.out.println(binarySearch(ints, 5)); 
	    
	    }
	
	 public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
	        int l = 0, r = list.length-1;
	        while (l < r) {
	            int mid = (l + r) / 2;
	            if(list[mid].compareTo(key) == 0) {
	                return mid;
	            } else if(list[mid].compareTo(key) < 0) {
	                l = mid + 1;
	            } else {
	                r = mid - 1;
	            }
	        }
	        return -1;
	    }

}
