package mulshankar13.leetcode.linkedlist;

public class AddTwoNumbersWithCarry {

	public static void main(String[] args) {
		System.out.println("hey jeeves..");
		
		ListNode listNode = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(3);
//		ListNode listNode4 = new ListNode(7);
		listNode.next=listNode2;
		listNode2.next=listNode3;//2->4->3
		listNode3.next=null;
		//listNode4.next=null;//2->4->3

		ListNode listNode5 = new ListNode(5);
		ListNode listNode6 = new ListNode(6);
		ListNode listNode7 = new ListNode(4);
//		ListNode listNode8 = new ListNode(9);
//		ListNode listNode9 = new ListNode(9);
//		ListNode listNode10 = new ListNode(9);
//		ListNode listNode11 = new ListNode(9);
//		ListNode listNode12 = new ListNode(9);
//		ListNode listNode13 = new ListNode(9);
//		ListNode listNode14 = new ListNode(9);
//		ListNode listNode15 = new ListNode(9);
//		
		listNode5.next=listNode6;//5->6
		listNode6.next=listNode7;//6->4
		listNode7.next=null;
//		listNode7.next=listNode8;//6->4
//		listNode8.next=listNode9;//6->4
//		listNode9.next=listNode10;//6->4
//		listNode10.next=listNode11;//6->4
//		listNode11.next=listNode12;//6->4
//		listNode12.next=listNode13;//6->4
//		listNode13.next=listNode14;//6->4
//		listNode14.next=listNode15;//6->4
//		listNode15.next=null;//6->4
		System.out.println(addTwoNumbers(listNode, listNode5).toString());

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		System.out.println("hey jeeves2..");
		ListNode curr = new ListNode(-1);
		ListNode res=curr;
		System.out.println(curr);
		int sum = 0, carry = 0;

		if (l1 == null) {// if one node is empty the other node is sum
			return l2;
		}

		if (l2 == null) {// if one node is empty the other node is sum
			return l1;
		}

		while (l1 != null || l2 != null || sum>0) {
			
			if (l1 != null) {
				System.out.println("l1.val = "+l1.val);//9
				sum+=l1.val;				
				l1=l1.next;
			}
			
			if (l2 != null) {
				System.out.println("l2.val = "+l2.val);//9
				sum += l2.val;//9
				l2=l2.next;				
			}
			
			System.out.println("sum ="+sum);
			if(sum>=10) {
				sum=sum-10;
				carry=1;
			}
						
			curr.next=new ListNode(sum);			
			System.out.println("bfore next :"+curr);
			sum = carry;
			carry=0;
			curr=curr.next;
		}

		return res.next;
	}

}