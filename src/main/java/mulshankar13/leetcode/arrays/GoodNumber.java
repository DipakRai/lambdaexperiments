package mulshankar13.leetcode.arrays;

import java.util.Scanner;

public class GoodNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(rotatedDigits(N));
		scanner.close();
	}

	public static int rotatedDigits(int N) {
		// 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9
		// rotate to each other,
		int count = 0;
		for (int i = 1; i <= N; i++) {
			switch (i) {
			case 2: {
				count++;
				break;
			}
			case 5: {
				count++;
				break;
			}
			case 6: {
				count++;
				break;
			}
			case 9: {
				count++;
				break;
			}
			}
		}
		return count;
	}

}
