/**
 * 
 */
package arrays.twodimentionalarray;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Rishikesh
 * traverse an array using DFS-depth first search
 * { [1,  2,  3,  4],
 *   [5,  6,  7,  8],
 *   [9,  10, 11, 12],
 *   [13, 14, 15, 16]
 *  }
 *  
 *  up->right->down->left
 */
public class TraverseUsingDFS {
	
	static int directions[][] = {	{-1,0}, //UP
			{0,1}, //Right
			{1,0}, //Down
			{0,-1} //Left
		};

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Consumer<Integer> c = i-> System.out.print(i + " ");
		
		int matrix[][] = {	{1,  2,  3,  4, 5},
							{6,  7,  8,  9, 10},
							{11,  12, 13, 14, 15},
							{16, 17, 18, 19, 20}											
						};
	
		int visited[][] = new int [matrix.length][matrix[0].length];
		//visited[3][3]=-1;
		//System.out.println(visited[3][3]);
		
		//int values[] = new int[matrix.length*matrix[0].length];
		List<Integer> iList = new LinkedList<>();
		
		DFSTraverse(matrix, 0, 0, visited, iList);
		//iList.stream().forEach(System.out::print);
		iList.stream().forEach(c);
		System.out.println("\nTotal elements:" + iList.size());
	}
	
	public static List<Integer> DFSTraverse(int mat[][], int row, int col, int vis[][], List<Integer> list) {
		dfs(mat, row, col, vis, list);
		return list;
	}
	
	public static void dfs(int mat[][], int row, int col, int vis[][], List<Integer> list) {
		if(mat.length < 0) return ;
		
		if(row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || vis[row][col] == -1) return;
		
		int v = mat[row][col];
		list.add(v);
		vis[row][col] = -1;
		
		for(int i = 0; i < directions.length; i++) {
			int curDir[] = directions[i];
			int curRow = row + curDir[0];
			int curCol = col + curDir[1];
			
			dfs(mat, curRow, curCol, vis, list);
		}
	}
}
