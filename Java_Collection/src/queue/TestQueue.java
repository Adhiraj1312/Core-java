package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();
		Queue q1 = new ArrayDeque();

		for (char c = 'a'; c <= 'z'; c++) {
			q.offer(c); // offer(); is used to add
		}

		System.out.println("q: " + q);

		while (!q.isEmpty()) {
			q1.offer(q.poll());
		}

		System.out.println("q1: " + q1);
		System.out.println("q: " + q);

		// also there is one more peek(); that is uesd to return the first value

	}

}
