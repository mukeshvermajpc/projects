package com.stack;

import java.util.Stack;

//program for convert stack into queue
public class StackToQueue {
	Stack<Integer> st1 = new Stack<>();
    Stack<Integer>st2=new Stack<>();
    void enqueue(int item)
    {
    	while(!st1.isEmpty())
    	{
    	st2.push(st1.pop());	
    	}
    	st1.push(item);
    	while(!st2.isEmpty())
    	{
    		st1.push(st2.pop());
    	}
    	
    }
    int deQueue()
    {
    	if(st1.isEmpty())
    	{
    		System.out.println("queue is empty");
    		return 0;
    	}
    	int x=st1.peek();
    	st1.pop();
    	return x;
    }
    void display()
    {
    	for(Integer a:st1)
    	{
    		System.out.println(a);
    	}
    }
	public static void main(String args[]) {
      StackToQueue obj=new StackToQueue();
      obj.enqueue(10);
      obj.enqueue(20);
      obj.enqueue(23);
      System.out.println("element has been deleted "+obj.deQueue());
      System.out.println("displaying data after deleting");
	  obj.display(); 
	}
}
