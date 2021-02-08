package HW3;

public class minHeap {
	public static void main(String[] args) {
		Integer[] testNums = {-6,-1,-19,20,-20,6,23,31,-8,28,10,12};
		minHeapSort(testNums);
		for (int i = 0; i < testNums.length; i++)
			System.out.print(testNums[i] + " ");
	}


public  static <E extends Comparable<E>> void minHeapSort(E[] list) {

	Heap<E> heap = new Heap<>();

	for (int i = 0; i < list.length; i++) {
		heap.add(list[i]);}
	
	for (int i = list.length - 1; i >= 0; i--) {
		list[i] = heap.remove();}
}


}

