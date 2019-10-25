package mulshankar13.leetcode.linkedlist;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		
		ListNode slowPointer =null;		
		ListNode fastPointer=null;
		boolean flag=false;
		while(null!=head) {
			slowPointer=head.next;
			fastPointer=head.next.next;
			if(slowPointer==fastPointer) {
				flag=true;
			}
			head=fastPointer;
		}
		return flag;
	}
}

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
