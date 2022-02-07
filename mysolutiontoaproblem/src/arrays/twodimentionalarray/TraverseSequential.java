/**
 * 
 */
package arrays.twodimentionalarray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Rishikesh
 * traverse an array sequential
 * {[1,2,3,4],
 *  [5,6,7,8],
 *  [9,10,11,12],
 *  [13,14,15,16]}
 */
public class TraverseSequential {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//one dimensional array sequential traverse
		int m[]= {1,2,3,4,5};
		System.out.println(m[1]); //index 2 array starts from 0
		
		IntStream is = Arrays.stream(m);
		//System.out.println(is.count());		
		//is.forEach(a->System.out.println(a)); //can not perform two operation on a stream
		is.forEach(System.out::println);
		
		//two dimensional array sequential traverse
		int matrix[][]= {	{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16},
							//{17} //array index out of bounds for matrix[4][1]. better {17,0,0,0}
							{17,0,0,0}
						};
		
		System.out.println("2D:" + matrix[4][1]);
		Stream<int[]> tdis = Arrays.stream(matrix);
		//System.out.println(tdis.count());
		
		tdis.forEach(a-> {for(int i=0; i<a.length; i++) {System.out.print(a[i]); System.out.print(" ");}} );
		
		System.out.println("\nAnother way:");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
