package mulshankar13.google.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MagicalBinaryString {

	/*
	 * Sample code to perform I/O: Use either of these methods for input
	 */

	public static void main(String[] args) {

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines = "";
		try {
			lines = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] strs = lines.trim().split(",");
		
		HashMap <String,Integer> stringMap = new HashMap<>();
		
		for (String string : strs) {
			if(stringMap.containsKey(string)) {
				stringMap.put(string,stringMap.get(string)+1);
			} else {
				stringMap.put(string,1);
			}
		}
		StringBuilder sbr = new StringBuilder();
		for(int i=0;i<strs.length;i++) {
			sbr.append(strs[i]);
		}
		
		HashMap <String,Integer> stringMap2 = new HashMap<>();
		for(int i=0;i<strs.length/2;i++) {
			String s = sbr.substring(0, i);
			if(stringMap2.containsKey(s)) {
				stringMap2.put(s,stringMap.get(s)+1);
			} else {
				stringMap2.put(s,1);
			}
		}
		
		if(stringMap.get("0")==stringMap.get("1") && stringMap2.get("1")>=stringMap2.get("0")) {
			System.out.println("true");
		}
	}
}
