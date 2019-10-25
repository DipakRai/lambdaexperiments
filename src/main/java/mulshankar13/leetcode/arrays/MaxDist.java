package mulshankar13.leetcode.arrays;

public class MaxDist {

	public static void main(String[] args) {

		int[] seats = { 1, 0, 1,1};
		System.out.println(maxDistToClosest(seats));
	}

	public static int maxDistToClosest(int[] seats) {
	int max = 0;
    int last = -1;
    int n = seats.length;
    for (int i = 0; i < n; ++i) {
        if (seats[i] == 1) {
            if (last == -1) {
                max = Math.max(max, i);
            } else {
                max = Math.max(max, (i - last) / 2);
            }
            last = i;
        }
    }
    if (last != n - 1) {
        max = Math.max(max, n - 1 - last);
    }
    return max;
    }
}
