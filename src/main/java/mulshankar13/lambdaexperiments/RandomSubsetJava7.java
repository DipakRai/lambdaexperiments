package mulshankar13.lambdaexperiments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * GE Healthcare Interview 19 Jul 2019
 * Generate a random number of subsets from a list of string
 * @author mulshankar13
 *
 */
public class RandomSubsetJava7 {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();

		for (char c = 'a'; c <= 'z'; c++) {
			stringList.add(Character.toString(c));
		}

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		getRandomSubset(stringList, n);

	}

	public static void getRandomSubset (List<String> stringList,int n) {
		
		List<String> subList = new ArrayList<String>();
		Random random = null;
		int count=1;
		for (String val : stringList) {
			random = new Random();
			if(random.nextBoolean()) {
				subList.add(val);
				count++;
			}
			if(count>n) break;
		}
		subList.forEach(s->System.out.print(String.join(",",s)));
	}

}
