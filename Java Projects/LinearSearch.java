package HW1;

public class LinearSearch {
	
	public static void main(String[] args) {
        Integer[] list = new Integer[10]; 
        for (int i = 0; i < list.length; i++) {
            list[i] = i;      
        }
        System.out.println(linearSearch(list, 2)); 
        System.out.println(linearSearch(list, 5));
        System.out.println(linearSearch(list, 10));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) { 
                return i;
            }
        }

        return -1; 
    }
}



