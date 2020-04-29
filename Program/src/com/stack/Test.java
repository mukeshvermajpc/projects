package com.stack;

import java.util.Stack;

public class Test {
   public static void main(String args[])
   {
	   System.out.println("program for understand stack in java");
	   Stack<Integer>st=new Stack<>();
	   st.push(12);
	   st.push(19);
	   st.push(32);
	   st.push(48);
	   System.out.println("deletion of element"+st.peek());
	   System.out.println("top element is: "+st.pop());
	   st.forEach(ob->System.out.println(ob));
	   System.out.println("top element is:"+st.peek());
   }
}
