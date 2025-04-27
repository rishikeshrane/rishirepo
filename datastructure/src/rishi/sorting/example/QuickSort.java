/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Rishikesh
 * Quick Sort:
 * 1. Select the pivot element
 * 2. compare it with other elements starting from 0 index
 * 3. if element is less than the pivot swap it
 * 4. if element is greater then the pivot, let it be there
 * 5. do the same thing with other sub arrays/partitions using recursion
 * 6. Trick-- know the partition index, scanIndex, pivot element, 
 * swap element at scan index with partition index if it is less than pivot. swap pivot with partition index element
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int [] a = {2,4,1,9,5,8,6,7,3};
		int [] a = {5,3,1,6,4,2};
		quickSort(a, 0, a.length-1);
		Arrays.stream(a).forEach(System.out::print);
	}
	
	/**
	 * Divide n conquer technique for quick sort
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int a[], int start, int end) {
		
		if(start < end) {
			int partitionIndex = partition(a, start, end);
			quickSort(a, start, partitionIndex-1);
			quickSort(a, partitionIndex+1, end);
		}
		
		return a;
	}
	
	/**
	 * find the partition index and place the pivot on its sorted position
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static int partition(int a[], int start, int end) {
		int pivotElement = a[end];
		int partitionIndex = start;
		int scanIndex = start;
		
		for(; scanIndex < a.length; scanIndex++) {
			if(a[scanIndex] < pivotElement) {
				swap(a, scanIndex, partitionIndex);
				partitionIndex++;
			}
		}
		swap(a, partitionIndex, end);
		
		return partitionIndex;
	}
	
	/**
	 * swap the small element
	 * @param a
	 * @param moveFrom
	 * @param moveTo
	 */
	public static void swap(int a[], int moveFrom, int moveTo) {
		int temp = a[moveFrom];
		a[moveFrom] = a[moveTo];
		a[moveTo] = temp;
	}
}
