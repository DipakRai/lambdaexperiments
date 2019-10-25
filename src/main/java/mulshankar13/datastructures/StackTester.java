package mulshankar13.datastructures;

import java.util.Stack;

/**
 * Stack implementation with min and complexity O(1)
 * Chapter 3 Stcks and Queues : Cracking The Coding Interview
 * Algo:
 * If we keep track of the minimum at each state, we would be able to easily know
 * the min of the stack through complexity O(1)
 * For this at the push call for the first element the  min of the emoty stack
 * is some random generated MAX value
 * @author mulshankar13
 *
 */

public class StackTester {
	
	public static void main(String[] args) {
		StackWithMin node = new StackWithMin();
		node.push(4);
		node.push(5);
		System.out.println(node.min());
		node.push(6);
		node.push(2);
		System.out.println(node.min());
		node.push(8);
		System.out.println(node.min());
		node.pop();
		System.out.println(node.min());
		node.pop();
		System.out.println(node.min());
		node.push(1);
		System.out.println(node.min());		
	}
}

class StackWithMin extends Stack<NodeWithMin> {

	private static final long serialVersionUID = 2155094067351942497L;
	
	public void push(int value) {
		// every push calculate the new min
		int min = Math.min(value, min());
		super.push(new NodeWithMin(value,min));
	};
	
	public int min() {
		if(this.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return peek().min; // return the min of the top node which is the min of the stack
	}
	
	@Override
	public synchronized NodeWithMin pop() {
		return super.pop();
	}
}

class NodeWithMin {

	Integer value;
	Integer top = -1;
	Integer min;

	public Integer min(Integer value) {
		Integer min = Math.min(value, this.min);
		return min;
	}

	public NodeWithMin(Integer value, Integer min) {
		this.value = value;
		this.min = min;
	}
}