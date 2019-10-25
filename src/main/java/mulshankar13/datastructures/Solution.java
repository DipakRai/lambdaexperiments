package mulshankar13.datastructures;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public static String intToBinConvert(int n) {

		return Integer.toBinaryString(n);
	}

	static List<String> returnAllSubStr(String str) {
		List<String> subStrList = new ArrayList<String>();
		String subStr = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				subStr = str.substring(i, j);
				// System.out.println(subStr);
				subStrList.add(subStr);
			}
		}
		return subStrList;
	}

	// Return the even number substrings.
	static String countOddZerosAndOnes(List<String> subStrList) {
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
		return globalCountZeroOdd + " " + globalCountOneOdd;
	}

	public static void main(String args[]) {
		int n = 17;
		String str = intToBinConvert(n);
		System.out.println(" bin =" + str);
		List<String> subStrList = returnAllSubStr(str);
		System.out.println(subStrList.toString());
		System.out.println(countOddZerosAndOnes(subStrList));
	}
}