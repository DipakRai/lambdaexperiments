package mulshankar13.leetcode.linkedlist;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode listNode5 = new ListNode(5);
		ListNode listNode6 = new ListNode(6);
		ListNode listNode7 = new ListNode(7);
		ListNode listNode8 = new ListNode(8);
		ListNode listNode9 = new ListNode(9);
		listNode5.next = listNode6;// 5->6
		listNode6.next = listNode7;// 6->4
		listNode7.next = listNode8;// 6->4
		listNode8.next = listNode9;// 6->4
		listNode9.next = null;
		System.out.println("Middle Node : "+middleNode(listNode5));
	}

	public static boolean hasCycle(ListNode head) {	
		ListNode slowPointer = null;
		ListNode fastPointer = null;
		boolean flag = false;
		if(null==head) {// list is empty
			return false;
		} else if(null==head.next) {// list has one element
			return false;
		}
		slowPointer=head;
		fastPointer=head;
		while (head!=null) { 
           //3,2,0,-4
            System.out.println("slowPointer:"+slowPointer);
            fastPointer = fastPointer.next.next;
            System.out.println("fastPointer="+fastPointer);
            if (slowPointer == fastPointer) { 
                System.out.println("Found loop"); 
                return true; 
            }
            slowPointer = slowPointer.next;
            head=head.next;
        }       
		return flag;	
	}
	
	public static  ListNode middleNode(ListNode head) {
		System.out.println("middle node list :"+head);
		ListNode slow=head;
		ListNode fast=head;
		if(null==head) return null;// empty list
		if(head.next==null) return head;//one element
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
    }

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		System.out.println("listNode l1 =" + l1.toString());
		System.out.println("listNode l2 =" + l2.toString());
		ListNode sumNode = null;
		// iterate over the list
		// take each node data
		// multiply it by 10
		// sum it to itself
		long sum = 0;
		int n = 1;
		while (l1 != null) {
			sum = sum + l1.val * n;
			n = n * 10;
			l1 = l1.next;
		}
		System.out.println(sum);
		long sum2 = 0;
		n = 1;
		while (l2 != null) {
			sum2 = sum2 + l2.val * n;
			n = n * 10;
			l2 = l2.next;
		}
		System.out.println("" + sum2);
		sum = sum + sum2;
		String numSum = String.valueOf(sum);
		int[] digits = Long.toString(sum).chars().map(c -> c - '0').toArray();
		System.out.println("numSum = " + numSum);
		ListNode[] nodes = new ListNode[numSum.length()];
		for (int i = 0; i < digits.length; i++) {
			n = digits[i];
			System.out.println("n=" + n);
			nodes[i] = new ListNode(n);
			System.out.println("nodes[" + i + "]=" + nodes[i]);
		}

		for (int i = nodes.length - 1; i > 0; i--) {
			nodes[i].next = nodes[i - 1];
		}
		sumNode = nodes[nodes.length - 1];
		System.out.println(sum);
		return sumNode;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
}
