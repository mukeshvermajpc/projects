package com.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
	Queue<Integer> qt = new LinkedList<>();

	void push(int num) {
		if (qt.isEmpty()) {
			qt.add(num);
		} else {
			qt.add(num);
			while (qt.element() != num) {
				int item = qt.peek();

				qt.remove();
				qt.add(item);
			}
		}

	}

	void top() {
		System.out.println("top element of stack is " + qt.peek());
	}

	void display() {
		qt.forEach(obj -> System.out.println(obj));
	}

	int pop() {
		int item;
		if (qt.isEmpty()) {
			System.out.println("queue is empty");
		   return 0;
		} else {
			item = qt.poll();
			return item;
		}
	}

	public static void main(String args[]) {
		System.out.println("program for convert queue to stack");
		QueueToStack qobj = new QueueToStack();
		qobj.push(10);
		qobj.push(30);
		qobj.push(9);
		qobj.push(90);
		qobj.push(110);
		qobj.display();
		qobj.top();
		System.out.println("deleted item is:"+qobj.pop());
		qobj.display();
	}
}
