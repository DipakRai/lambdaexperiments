package mulshankar13.arrays;


/**
 * Samsung Dome Problem For A Matrix
 * With starting point at bottom left as (1,1)
 * Similar to rotating the matrix by 90 degress.
 * @author mulshankar13
 *
 */
public class MatrixBottomLeft {

	public static void main(String[] args) {

		int N = 3;
		int M = 4;
		int[][] region = new int[M+1][N+1];
		int count = 1;
		for (int x = M; x >= 1; x--) {
			System.out.println("x="+x);
			for (int y = 1; y <= N; y++) {
				System.out.println("y="+y);
				region[x][y] = count++;
			}
		}
		for (int x = 1; x <= M; x++) {
			for (int y = 1; y <= N; y++) {
				System.out.print(region[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
