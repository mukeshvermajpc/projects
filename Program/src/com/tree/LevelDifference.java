package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelDifference {
	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public Node root;

	public LevelDifference() {
		root = null;
	}

	int differnce() {
		int oddLevel = 0, evenLevel = 0, levelDiff = 0;
		int nodeInLevel = 0;
		int currentLevel = 0;
		Queue<Node> queue = new LinkedList<>();
		if (root == null) {
			System.out.println("tree is empty");
			return 0;
		} else {
			queue.add(root);
			currentLevel++;
			while (queue.size() != 0) {
				nodeInLevel = queue.size();
				while (nodeInLevel > 0) {
					Node current = queue.remove();
					if (currentLevel % 2 == 0)
						evenLevel += current.data;
					else
						oddLevel += current.data;
					if (current.left != null)
						queue.add(current.left);
					if (current.right != null)
						queue.add(current.right);
					nodeInLevel--;
				}
				currentLevel++;
			}
			levelDiff = Math.abs(oddLevel - evenLevel);
		}
		return levelDiff;
	}

	public static void main(String args[]) {
           LevelDifference obj=new LevelDifference();
           obj.root=new Node(1);
           obj.root.left=new Node(2);
           obj.root.right=new Node(3);
           obj.root.left.left=new Node(4);
           obj.root.left.right=new Node(10);
           System.out.println("differenc between node is "+obj.differnce());
	}
}
