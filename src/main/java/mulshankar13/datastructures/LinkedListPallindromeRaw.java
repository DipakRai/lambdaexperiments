package mulshankar13.datastructures;

public class LinkedListPallindromeRaw {


	public static void isPallindrome(LinkedListNode node3) {

		LinkedListNode reverseNode = reverseNode(node3);
		System.out.println("reverse node ="+reverseNode);
		
	}

	public static LinkedListNode reverseNode(LinkedListNode tail) {
		
		LinkedListNode head=null;
		System.out.println(" tail ="+tail.data);
		LinkedListNode reverseNode=null;
		// 3->2->1->null
		while(tail!=null) {
			reverseNode = new LinkedListNode(tail.data);// 3
			reverseNode.next=head;// head
			System.out.println(" reverseNode ="+reverseNode);
			head=reverseNode;
			tail=tail.next;//2
			System.out.println("head=tail.next ="+head);
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode node1 = new LinkedListNode(1, null);// header node
		LinkedListNode node2 = new LinkedListNode(2, node1); // 2->1->null
		LinkedListNode node3 = new LinkedListNode(3, node2); // 1->2->1->null
		System.out.println(node3);
		isPallindrome(node3);
	}

}


class LinkedListNode {
	
	int data;
	LinkedListNode next;	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public LinkedListNode(int data,LinkedListNode node) {
		this.data = data;
		this.next=node;
	}
	@Override
	public String toString() {
		return "LinkedListNode [data=" + data + ", next=" + next + "]";
	}
}
