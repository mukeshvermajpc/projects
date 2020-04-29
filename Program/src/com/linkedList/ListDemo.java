package com.linkedList;
public class ListDemo {
	Node head;
    class Node{
    	int data;
    	Node next;
    	Node(int data)
    	{
    		this.data=data;
    		this.next=null;
    	}
    }
    void insert(int data)
    {
    	Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertAfter(int data)
    {
    	Node newNode=new Node(data);
    	Node temp=head;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    	}
    	temp.next=newNode;
    	newNode.next=null;
    }
    void display(Node head)
    {
    	Node node=head;
    	while(node!=null)
    	{
    		System.out.print(node.data+" ");
    		node=node.next;
    	}
    }
    int listLength(Node head)
    {
    	Node node=head;
    	int count=0;
    	while(node!=null)
    	{
    		node=node.next;
    		count++;
    	}
      return count;	
    }
    int count=0;
    int listRecursion(Node head)
    {
    	Node node=head;
    	if(node!=null)
    	{
    		count++;
    		node=node.next;
    		listRecursion(node);
    	}
    	return count;
    }
    Node reverseList()
    {
    	Node prev=null;
    	Node current=head;
    	Node next=null;
    	while(current!=null)
    	{
    		next=current.next;
    		current.next=prev;
    		prev=current;
    		current=next;
    	}
    	head=prev;
    	return head;
    }
    void displayRecursion(Node head)
    {
    	Node node=head;
    	if(node!=null)
    	{
    		System.out.println(node.data);
    		node=node.next;
    		displayRecursion(node);
    	}
    	else
    	{
    		return;
    	}
    }
    void removeDuplicate(Node head)
    {
    	Node current=head,index=null,temp=null;
    	if(head==null)
    		return;
    	else {
    		while(current!=null)
    		{
    			temp=current;
    			index=current.next;
    			while(index!=null)
    			{
    				if(current.data==index.data)
    				{
    					temp.next=index.next;
    				}
    				else {
    					temp=index;
    				}
    				index=index.next;
    			}
    			current=current.next;
    		}
    	}
    }
    public static void main(String args[])
    {
    	ListDemo obj=new ListDemo();
    	obj.insert(12);
    	obj.insert(23);
    	obj.display(obj.head);
    	System.out.println("\nInsert after a node");
    	obj.insertAfter(34);
    	obj.insertAfter(90);
    	obj.insertAfter(90);
    	obj.insertAfter(34);
    	obj.display(obj.head);
		/*
		 * Node head=obj.reverseList(); System.out.println("\nPrinting reverse list");
		 * obj.display(head);
		 */ 
    	obj.removeDuplicate(obj.head);
    	System.out.println("\nAfter removing duplicate element");
    	obj.display(obj.head);
    	System.out.println("\nlength of list is:"+obj.listLength(obj.head));
        System.out.println("length of list using recursion:"+obj.listRecursion(obj.head));	
        obj.displayRecursion(obj.head);
    }
}
