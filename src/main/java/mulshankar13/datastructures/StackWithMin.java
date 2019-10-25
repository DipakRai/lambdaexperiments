package mulshankar13.datastructures;

public class StackWithMin extends java.util.Stack <StackWithMin>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6927172866962047431L;
	
	public int value;
	public int min;

	public StackWithMin(int v, int min) {
		this.value = v;
		this.min = min;
	}

	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new StackWithMin(value, newMin));
	}

	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}

	public static void main(String[] args) {
		StackWithMin stackObj = new StackWithMin(5, 5);
		System.out.println(stackObj.toString());
		stackObj.push(5);
		stackObj.push(6);
		stackObj.push(3);
		stackObj.push(7);
		System.out.println(stackObj.toString());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
	}
}
