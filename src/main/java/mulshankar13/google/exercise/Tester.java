package mulshankar13.google.exercise;

public class Tester {

	public static void main(String[] args) {
		
		int a [][] = {{2, -1, 2, -1}, 
		              {2, -1, 2, -1}, 
		              {-1, -1, -1, -1}, 
		              {-1, -1, -1, -1}};

//		int a[][] = { { 4, 2, 4, 2 }, { 4, -1, 4, 2 }, { 2, -1, 8, 2 }, { 16, -1, 4, -1 } };
		
		for(int i=0;i<=3;i++) {
			System.out.println();
			for(int j=0;j<=3;j++) {
				System.out.print(a[i][j]+" ");
			}
		}

		for (int y = 0; y <= a.length; y++) {
			for (int x = 0; x < 3; x++) {
				if (a[x + 1][y] != -1) {
					if (a[x + 1][y] == a[x][y]) {
						a[x][y] = a[x][y] * 2;
						a[x + 1][y] = -1;
					}
					if (a[x][y] == -1) {
						a[x][y] = a[x + 1][y];
						a[x + 1][y] = -1;
					}
				}
			}
		}
		System.out.println("#############");
		for(int i=0;i<=3;i++) {
			System.out.println();
			for(int j=0;j<=3;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}
}