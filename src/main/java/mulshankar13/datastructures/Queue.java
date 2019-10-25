/**
 * 
 * Queue implementation in Java
 * @author mulshankar13
 */
package mulshankar13.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue();

		System.out.println(myQueue.poll());
		for (char i = 'a'; i < 'h'; i++) {
			myQueue.add(Character.toString(i));
		}

		System.out.println("Queue:" + String.join(" -> ", myQueue.queue));
		System.out.println(myQueue.poll());

		System.out.println("Queue:" + String.join(" -> ", myQueue.queue));
		System.out.println(myQueue.poll());

		System.out.println("Queue:" + String.join(" -> ", myQueue.queue));
		System.out.println(myQueue.poll());
		
		myQueue.add("m");
		myQueue.add("n");
		myQueue.add("p");
		
		System.out.println("Queue:" + String.join(" -> ", myQueue.queue));
		System.out.println(myQueue.poll());
		System.out.println("Queue:" + String.join(" -> ", myQueue.queue));
		
		

	}
}

class MyQueue {

	// a->b->c->d->e

	int fifo = -1;

	List<String> queue = new ArrayList<String>();

	void add(String item) {
		queue.add(item);
		if (queue.size() == 1) {
			fifo = 0;
		}
	}

	String poll() {
		if (fifo == -1) {
			return "queue is empty";
		}
		return queue.remove(fifo);
	}
}