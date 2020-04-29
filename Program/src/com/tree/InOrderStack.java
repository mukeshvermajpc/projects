package com.tree;

import java.util.Stack;

public class InOrderStack {
	Node root;

	void inorder() {
		if (root == null)
			return;
		Stack<Node> st = new Stack<>();
		Node curr = root;
       while(curr!=null ||st.size()>0)
       {
    	   while(curr!=null)
    	   {
    		   st.push(curr);
    		   curr=curr.left;
    	   }
    	   curr=st.pop();
    	   System.out.println(curr.data);
    	   curr=curr.right;
       }
	}

	public static void main(String args[]) {
       InOrderStack tree=new InOrderStack();
       tree.root=new Node(10);
       tree.root.left=new Node(19);
       tree.root.right=new Node(34);
       tree.root.left.left=new Node(35);
       tree.inorder();
	}
}
