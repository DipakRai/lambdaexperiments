package mulshankar13.amazontse;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		String meeting = "Mon 01:00-23:00\n" + "Tue 01:00-23:00\n" + "Wed 01:00-23:00\n" + "Thu 01:00-23:00\n"
				+ "Fri 01:00-23:00\n" + "Sat 01:00-23:00\n" + "Sun 01:00-21:00";
		solution(meeting);
	}

	public static int solution(String S) {
		// write your code in Java SE 8
		String[] splitNewLine = S.split("\n");
		List<String> eachDay = new ArrayList<String>(); // eachDay of the week
		for (int i = 0; i < splitNewLine.length; i++) {
			eachDay.add(splitNewLine[i]);
		}
		for (String string : eachDay) {
			System.out.println(string);
		}
		
		// calculate all intra day sleep
		
		List <Long> intraDaySleep = new ArrayList<Long>();
		
		for (String string : eachDay) {
			String [] splitEachDay = string.split("\\s");
			String [] hoursEachDay = splitEachDay[1].split("-");
			long timeDiff = Integer.parseInt(hoursEachDay[1])-Integer.parseInt(hoursEachDay[0]);
			intraDaySleep.add(timeDiff);
			
		}
		
		// calculate max intra day sleep
		
		// calculate all inter day sleep
		
		// calculate max inter day sleep
		
		

		return 0; // return max |intraday,interday| sleep
	}

}
