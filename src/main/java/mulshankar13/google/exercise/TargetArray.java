package mulshankar13.google.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Find two nums in array which add up to the target ezetap interview
 * 
 * @author mulshankar13
 *
 */
public class TargetArray {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines = "";
		int target = 0;
		try {
			lines = br.readLine();
			target = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] strs = lines.trim().split(",");

		Integer arr[] = new Integer[strs.length];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

		List<Integer> list = Arrays.asList(arr);

		for (int i = 0; i < list.size(); i++) {
			numMap.put(list.get(i), i);
		}

		findIfSumExists(arr, target);

	}

	/**
	 * javabrains way
	 * @param arr
	 * @param target
	 */
	public static void findIfSumExists(Integer[] arr, int target) {

		Map<Integer, Integer> visitedMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (visitedMap.containsKey(Math.abs(target - arr[i]))) {
				System.out.println("true");
				System.out.println(arr[i] + "," + arr[visitedMap.get(Math.abs(target - arr[i]))]);
			} else {
				visitedMap.put(arr[i], i);
			}
		}

	}

	/**
	 * thought of a different approach but would still give O(n2)
	 * @param numMap
	 * @param target
	 */
	public static void findIfSumExistsThroughMap(Map numMap, int target) {

		// if (hashmap key - target) IS present as a key in the map
		// found the hit
		// return the key val

		Iterator iterator = numMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> pair = (Entry<Integer, Integer>) iterator.next();
			System.out.println("pair getValue:" + pair.getValue() + " pair getKey:" + pair.getKey());
			if (numMap.keySet().contains(Math.abs(pair.getKey() - target))) {
				System.out.println("found");
				break;
			} else {
				System.out.println("not found");
			}
		}
	}

	/**
	 * original ezetap submitted code
	 * @param numMap
	 * @param target
	 */
	public static void findIfSumExistsInArr(Map numMap, int target) {
		// this works fine
		boolean flag = false;
		int found1 = -1, found2 = -1;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					flag = true;
					found1 = arr[i];
					found2 = arr[j];
					break;
				} else {
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}

		if (flag) {
			System.out.println(flag);
			System.out.println(found1 + "," + found2);
		} else {
			System.out.println(flag);
		}
	}
}
