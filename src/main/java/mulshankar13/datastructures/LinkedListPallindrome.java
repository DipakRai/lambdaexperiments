/**
 * LinkedList implementation in Java 
 * Cracking The Coding Interview
 * @author mulshankar13
 */

package mulshankar13.datastructures;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPallindrome {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("m");
		linkedList.add("a");
		linkedList.add("d");
		linkedList.add("n");
		linkedList.add("m");

		System.out.println(
				" isPallindrome = " + ((isPallindrome(linkedList)) ? "TRUE" : "FALSE"));
	}

	private static boolean isPallindrome(LinkedList<String> linkedList) {
		Stack<String> stack = new Stack<String>();
		linkedList.descendingIterator().forEachRemaining(e -> stack.add(e));
		StringBuilder string = new StringBuilder();
		stack.forEach(e -> string.append(e));
		System.out.println("reversed string :" + string);
		StringBuilder stringOriginal = new StringBuilder();
		linkedList.forEach(e -> stringOriginal.append(e));
		System.out.println(" stringOriginal :" + stringOriginal);
		if (stringOriginal.toString().equalsIgnoreCase(string.toString())) {
			return true;
		}
		return false;

	}

}
