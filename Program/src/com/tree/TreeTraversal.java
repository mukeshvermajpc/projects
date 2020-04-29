package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	Node root;
	public TreeTraversal() {
		root = null;
	}
	void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
	}

	void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}

	void preorderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	void preorderTraversal() {
		preorderTraversal(root);
	}

	void inorderTraversal() {
		inorderTraversal(root);
	}

	void postorderTraversal() {
		postorderTraversal(root);
	}
     void bfsTree()
     {
    	 Queue<Node>queue=new LinkedList<>();
    	 queue.add(root);
    	 while(!queue.isEmpty())
    	 {
    		 Node node=queue.poll();
    		 System.out.print(node.data+" ");
    		 if(node.left!=null)
    		 {
    			 queue.add(node.left);
    		 }
    		 if(node.right!=null)
    		 {
    			 queue.add(node.right);
    		 }
    	 }
     }
	public static void main(String args[]) {
		TreeTraversal obj = new TreeTraversal();
		obj.root = new Node(10);
		obj.root.left = new Node(12);
		obj.root.right = new Node(14);
		obj.root.left.left = new Node(19);
		obj.root.left.right = new Node(30);
		System.out.println("pre order traversal");
        obj.preorderTraversal();
        System.out.println("\npost order traversal");
        obj.postorderTraversal();
        System.out.println("\ninorder traversal");
        obj.inorderTraversal();
        System.out.println("\ndepth first search");
        obj.bfsTree();
	}
}
