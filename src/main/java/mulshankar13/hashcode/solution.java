package mulshankar13.hashcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class solution {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			//int n = sc.nextInt();
			String n = sc.next();
			BigInteger nn = new BigInteger(n);
			String str = nn.toString(2);
//			String str = BigInteger.toBinaryString(bi);
			List<String> subStrList = new ArrayList<String>();
			String subString = "";
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j <= str.length(); j++) {
					subString = str.substring(i, j);
					// System.out.println(subStr);
					subStrList.add(subString);
				}
			}
			int globalCountOneOdd = 0;
			int globalCountZeroOdd = 0;
			for (String subStr : subStrList) {
				int zeroCount = 0;
				zeroCount = subStr.length() - subStr.replace("0", "").length();
				int oneCount = 0;
				oneCount = subStr.length() - subStr.replace("1", "").length();
				if (zeroCount % 2 != 0) {
					globalCountZeroOdd++;
				}
				if (oneCount % 2 != 0) {
					globalCountOneOdd++;
				}
			}
			System.out.println(globalCountZeroOdd + " " + globalCountOneOdd);
		}
		sc.close();
	}
}