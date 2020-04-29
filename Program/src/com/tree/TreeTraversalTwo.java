package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.annotation.PostConstruct;

public class TreeTraversalTwo {
	Node root;
	void inorder(Node root)
	{
		Node node=root;
		if(node!=null)
		{
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	void preOrder(Node root)
	{
		Node node=root;
		if(node!=null)
		{
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	void postOrder(Node root)
	{
		Node node=root;
		if(node!=null)
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}
	void preorderStack(Node root)
	{
		Stack<Node>st=new Stack<>();
		Node curr=root;
		if(root==null)
			return;
		st.push(curr);
		while(!st.isEmpty())
		{
	        Node nd=st.peek();
	        System.out.println(nd.data);
	        st.pop();
	        if(nd.right!=null)
	        {
	        	st.push(nd.right);
	        }
	        if(nd.left!=null)
	        {
	        	st.push(nd.left);
	        }
		}
	}
	void inorderStack(Node root)
	{
		Stack<Node>st=new Stack<>();
		if(root==null)
			return;
		Node curr=root;
		while(curr!=null || st.size()>0)
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
	void bfs(Node root)
	{
		Node node=root;
		Queue<Node>queue=new LinkedList();
		queue.add(node);
		while(!queue.isEmpty())
		{
			Node n=queue.remove();
			System.out.println(n.data);
			if(n.left!=null)
			{
				queue.add(n.left);
			}
			if(n.right!=null)
			{
				
			}
		}
	}
   public static void main(String args[])
   {
	   System.out.println("program for understand tree traversal using stack");
       TreeTraversalTwo tree=new TreeTraversalTwo();
       tree.root=new Node(10);
       tree.root.left=new Node(9);
       tree.root.right=new Node(13);
       tree.root.left.left=new Node(8);
       tree.root.right.left=new Node(12);
       tree.root.right.right=new Node(14);
       System.out.println("Inorder traversal");
       tree.inorder(tree.root);
       System.out.println("Preorder Traversal");
       tree.preOrder(tree.root);
       System.out.println("Postorder Traversal");
       tree.postOrder(tree.root);
       System.out.println("Preorder traversal using stack");
       tree.preorderStack(tree.root);
       System.out.println("Inorder traversal using stack");
       tree.inorderStack(tree.root);
   }
}
