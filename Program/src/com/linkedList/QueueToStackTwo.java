package com.linkedList;
import java.util.LinkedList;
import java.util.Queue;
public class QueueToStackTwo {
	Queue<Integer>queue1=new LinkedList<>();
	Queue<Integer>queue2=new LinkedList<>();
	void push(int item)
	{
		queue2.add(item);
		while(!queue1.isEmpty())
		{
			queue2.add(queue1.peek());
			queue1.remove();
		}
		Queue<Integer>q=queue1;
		queue1=queue2;
		queue2=q;
	}
	int pop()
	{
		if(queue1.isEmpty())
		{
			System.out.println("stack is empty");
			return 0;
		}
		else {
			int n=queue1.remove();
			return n;
		}
	}
	int top()
	{
		int top=queue1.peek();
		return top;
	}
	void display()
	{
		queue1.forEach((obj)->System.out.println(obj));
	}
	public static void main(String args[]) {
		System.out.println("program for convert queue to stack");
		QueueToStackTwo obj=new QueueToStackTwo();
		obj.push(12);
		obj.push(34);
	    System.out.println("objects before deletion");
	    obj.display();
		System.out.println("top element of stack "+obj.top());
	    System.out.println("deleted element is: "+obj.pop());
	    System.out.println("objects after deletion");
	    obj.push(89);
	    obj.push(90);
	    obj.push(45);
	    obj.display();
	}
}
