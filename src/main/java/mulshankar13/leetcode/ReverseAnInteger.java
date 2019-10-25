package mulshankar13.leetcode;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int n = 1534236469;
		System.out.println(reverse(n));
	}

	public static long reverse(int n) {
		long reversed = 0;
		while (n != 0) {			
			reversed = reversed * 10 + n % 10;
			n = n / 10;
			System.out.println(reversed+":reversed");
			System.out.println(reversed > Integer.MAX_VALUE );
			System.out.println(Integer.MAX_VALUE);
			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				return 0;
			}
		}
		return reversed;
	}

}