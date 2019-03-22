package myJavaProject;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] grid = { { 1, 2, 3, 4 }, { 11, 22, 33 }, { 111, 222 } };

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
