package mulshankar13.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution to a 2D Array Hourglass problem 
 * from HackerRank Interview Prep Kit
 * @author mulshankar13
 *
 */
public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {

		int sum = 0;
		List<Integer> sumList = new ArrayList<Integer>();
		for (int row = 0; row < arr.length - 2; row++) { // iterate over each row
			for (int col = 0; col < arr.length - 2; col++) { // iterate over the hourglass formed by each col in the row
				sum = 0; //initialize this for every hourglass net value
				for (int counter = col; counter < col + 3; counter++) { // start with the first element of the row
					// iterate over each col in each row
					sum += arr[row][counter]; // calculate the sum for each element as arr(0,0),arr(0,1),arr(0,2)
					if (counter == col + 1) { // handle mid element for hourglass:only one time
						sum += arr[row + 1][counter];
					}
						// iterate over the 3rd row from the first element of the glass hour arr(3,0),arr(3,1),arr(3,2)
						sum += arr[row + 2][counter]; // sum the elements up
					}
					sumList.add(sum);//store it in a list to compare later
				}
		}
		Collections.sort(sumList, Collections.reverseOrder());
		System.out.println(sumList);
		return sumList.get(0);
	}

	public static void main(String[] args) throws IOException {
		int[][] arr = new int[4][4];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;

		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;

		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;

		arr[3][0] = 13;
		arr[3][1] = 14;
		arr[3][2] = 15;
		arr[3][3] = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		int result = hourglassSum(arr);

		System.out.println(" result = " + result);
	}

}
