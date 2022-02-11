/**
 * 
 */
package arrays.twodimentionalarray;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * @author Rishikesh
 * 
 *         traverse using BFS
 * 
 *         int matrix[][] = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13,
 *         14, 15}, {16, 17, 18, 19, 20} };
 *
 */
public class TraverseUsingBFS {

	static int directions[][] = { { -1, 0 }, // up
			{ 0, 1 }, // right
			{ 1, 0 }, // down
			{ 0, -1 } // left
	};

	static Consumer<Integer> con = i -> System.out.print(i + " ");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int visited[][] = new int[matrix.length][matrix[0].length];

		Queue<int[]> queue = new LinkedList<>();
		int c[] = { 2, 2 }; //13 or you can start at 0,0 indices i.e. 1
		queue.add(c);

		List<Integer> bfsList = new LinkedList<Integer>();
		traverseBFS(matrix, queue, bfsList, visited);

		// bfsList.stream().forEach(System.out::print);
		bfsList.stream().forEach(con);

	}

	public static List<Integer> traverseBFS(int mat[][], Queue<int[]> queue, List<Integer> bfsList, int[][] vis) {
		if (mat.length <= 0)
			return null;
		while (!queue.isEmpty()) {
			int a[] = queue.poll();
			int row = a[0];
			int col = a[1];
			// int val = mat[row][col];
			// bfsList.add(val);
			bfs(mat, row, col, queue, bfsList, vis);
		}
		return bfsList;
	}

	public static void bfs(int mat[][], int row, int col, Queue<int[]> queue, List<Integer> bfsList, int[][] vis) {

		if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || vis[row][col] == -1)
			return;
		
		int v = mat[row][col];
		bfsList.add(v);
		vis[row][col] = -1;
		
		for (int i = 0; i < directions.length; i++) {
			int curDir[] = directions[i];
			int curRow = row + curDir[0];
			int curCol = col + curDir[1];
			//System.out.println(curRow + " " + curCol);
			int s[] = { curRow, curCol };
			queue.add(s);			
		}
	}
}
