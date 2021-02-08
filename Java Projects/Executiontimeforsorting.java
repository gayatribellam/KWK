package HW3;

import java.util.ArrayList;

public class Executiontimeforsorting {

 public static void main(String[] args) {
System.out.print("|Array size    |Selection Sort   Bubble Sort    Merge Sort    Quick Sort    Heap Sort    Radix Sort |");

  print(50000);
  print(100000);
  print(250000);
  print(500000);
  print(1000000);
 }
 
 public static void print(int arraySize) {
  int  swid = 14;
  int[] list = new int[arraySize];
  for (int i = 0; i < list.length; i++) {
   list[i] = (int)(Math.random() * 1000000);
  }
  System.out.print("\n|");
  for (int i = 0; i < 7; i++) {
   for (int j = 0; j < swid; j++) {
    System.out.print("-");
   }
   System.out.print("|");
  }
  
  System.out.printf("\n|%" + swid + "d|", arraySize);
  
  int[] list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  long startTime = System.currentTimeMillis();  
  selectionSort(list2);
  long endTime = System.currentTimeMillis();
  long executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  
  list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  startTime = System.currentTimeMillis();  
  bubbleSort(list2);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  startTime = System.currentTimeMillis();  
  mergeSort(list2);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  startTime = System.currentTimeMillis();  
  quickSort(list2);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  startTime = System.currentTimeMillis();  
  heapSort(list2);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  list2 = new int[arraySize];
  System.arraycopy(list, 0, list2, 0, list.length);  
  startTime = System.currentTimeMillis();  
  radixSort(list2, 1000000);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.printf("%" + swid + "d|", executionTime);
  
  
  
  
 }
 
 public static void selectionSort(int[] list) {
  for (int i = 0; i < list.length - 1; i++) {
   int currentMin = list[i];
   int currentMinIndex = i;

   for (int j = i + 1; j < list.length; j++) {
    if (currentMin > list[j]) {
     currentMin = list[j];
     currentMinIndex = j;
    }
   }
   if (currentMinIndex != i) {
    list[currentMinIndex] = list[i];
    list[i] = currentMin;
   }
  }
 }

 
 
 public static void bubbleSort(int[] list) {
  boolean needNextPass = true;
  for (int k = 1; k < list.length && needNextPass; k++) {
   needNextPass = false;
   for (int i = 0; i < list.length - k; i++) {
    if (list[i] > list[i + 1]) {
     int temp = list[i];
     list[i] = list[i + 1];
     list[i + 1] = temp;
     needNextPass = true; 
    }
   }
  }
 }
 
 
 public static void mergeSort(int[] list) {
  if (list.length > 1) {

   int[] firstHalf = new int[list.length / 2];
   System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
   mergeSort(firstHalf);
   int secondHalfLength = list.length - list.length / 2;
   int[] secondHalf = new int[secondHalfLength];
   System.arraycopy(list, list.length / 2, secondHalf, 0,
     secondHalfLength);
   mergeSort(secondHalf);
   merge(firstHalf, secondHalf, list);
  }
 }
 public static void merge(int[] list1, int[] list2, int[] temp) {
  int current1, current2, current3;
  current1=0; current2=0; current3=0;

  while (current1 < list1.length && current2 < list2.length) {
   if (list1[current1] < list2[current2])
    temp[current3++] = list1[current1++];
   else
    temp[current3++] = list2[current2++];
  }

  while (current1 < list1.length)
   temp[current3++] = list1[current1++];

  while (current2 < list2.length)
   temp[current3++] = list2[current2++];
 }
 
 
 public static void quickSort(int[] list) {
  quickSort(list, 0, list.length - 1);
 }

 private static void quickSort(int[] list, int first, int last) {
  if (last > first) {
   int pivotIndex = partition(list, first, last);
   quickSort(list, first, pivotIndex - 1);
   quickSort(list, pivotIndex + 1, last);
  }
 }


 private static int partition(int[] list, int first, int last) {
  int pivot = list[first]; 
  int low = first + 1; 
  int high = last; 

  while (high > low) {
	  
   while (low <= high && list[low] <= pivot)
    low++;


   while (low <= high && list[high] > pivot)
    high--;


   if (high > low) {
    int temp = list[high];
    list[high] = list[low];
    list[low] = temp;
   }
  }

  while (high > first && list[high] >= pivot)
   high--;

  // Swap pivot with list[high]
  if (pivot > list[high]) {
   list[first] = list[high];
   list[high] = pivot;
   return high;
  } else {
   return first;
  }
 }
 
 
 public static void heapSort(int[] list) {
  Heap<Integer> heap = new Heap<Integer>();

  for (int i = 0; i < list.length; i++)
   heap.add(list[i]);

  for (int i = list.length - 1; i >= 0; i--)
   list[i] = heap.remove();
 }
 
 public static void radixSort(int[] list, int maxOrder) {
	  for (int order = 1; order < maxOrder; order *= 10) {
	   ArrayList<Integer>[] bucket = new ArrayList[10];
	   
	   for (int i = 0; i < bucket.length; i++) {
	    bucket[i] = new java.util.ArrayList<>();
	   }
	   
	   for (int i = 0; i < list.length; i++) {
	    bucket[(list[i] / order) % 10].add(list[i]);
	   }
	   
	   int k = 0;
	   for (int i = 0; i < bucket.length; i++) {
	    if (bucket[i] != null) {
	     for (int j = 0; j < bucket[i].size(); j++)
	      list[k++] = bucket[i].get(j);
	    }
	   }
	  }
 
}
 
}
