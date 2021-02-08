package Lab8;
import java.util.Comparator;

public class GenericBubbleSort {
	
	
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
		needNextPass = false;
	
		for (int i = 0; i < list.length - k; i++) {
			if (list[i].compareTo(list[i + 1]) > 0) {
				E temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
				needNextPass = true; 
				}
			}
		}
		
	}

	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;
	
		for (int i = 0; i < list.length - k; i++) {
			if (comparator.compare(list[i],list[i + 1]) > 0) {
				E temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
				needNextPass = true; 
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Integer[] intList = {2,3,2,5,6,1,-2,3,14,12};
		String[] strList = {"bear","giraffe","cat","dog","bird"};
		String[] strList2= {"banana","orange", "apple", "watermelon", "grape"};
		
		bubbleSort(intList);
		System.out.print("Sorted Integer List: ");
		printList(intList);
		
		bubbleSort(strList);
		System.out.print("Sorted String List: ");
		printList(strList);
		
		bubbleSort(strList2,new StringComparator());
		System.out.print("Sorted String List2: ");
		printList(strList2);
	
		
		
		
		
	}
	
	public static void printList(Object[] list) {
		for(int i=0; i <list.length; i++) 
			System.out.print(list[i]+ " ");
		System.out.println();
		
	}
	
class StringComparator implements Comparator<String> {
		public int compare(String a, String b) {
			return a.compareTo(b);
		}

		
	}
	
	
}
	

