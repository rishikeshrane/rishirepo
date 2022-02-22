/**
 * 
 */
package arrays.twodimentionalarray;

/**
 * @author Rishikesh
 *A non-empty array A consisting of N integers is given.

Array A represents a linked list. A list is constructed from this array as follows:

the first node (the head) is located at index 0;
the value of a node located at index K is A[K];
if the value of a node is −1 then it is the last node of the list;
otherwise, the successor of a node located at index K is located at index A[K] (you can assume that A[K] is a valid index, that is 0 ≤ A[K] < N).
 */
public class LinkedListInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = {1,4,-1,3,2};
		int []array = {2,-1,1,0,0,0};
		System.out.println(findLengthOfLinkedList(array));
	}
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int findLengthOfLinkedList(int arr[] ) {
		int[] mat = arr;
		int cnt = 1;
		int index = 0;
		int value = 0;
		
		for(int i=0; i< mat.length; i++) {
			value = mat[index];
			if(value == -1 ) return cnt;
			cnt++;
			index = value;		
		}
		return 0;
	}

}
