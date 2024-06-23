package com.sunbeam;
//1.  Implement singly circular linked list using tail pointer (no head pointer). 
//    Compare time complexities of all operations
public class List {
	static class Node{
		private int data;
		private Node next;
		 
		public Node(int value)
		{
			data= value;
			next= null;
		}
	}
	private Node tail;
	
	public List() {
		tail= null;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail= newnode;
			tail.next=tail;
		}
		else
		{
			newnode.next = tail.next;
			tail.next=newnode;
			tail=newnode;	
		}		
	}
	
	 public void addFirst(int data) {
		 Node newnode = new Node(data);
		 if(isEmpty()) {
			 tail=newnode;
			 tail.next=tail;
		 } else {
			 newnode.next=tail.next;
			 tail.next=newnode;
		 }
	 }
	
	
	 public void remove(int data) {
		 if(isEmpty())
			 return;
		 Node trav=tail.next;
		 Node prev = null;
		 do {
			 if (trav.data == data) {
				 if(trav== tail) {
					 if(prev != null) {
						 prev.next = tail.next;
						 tail = prev;
					 }
					 else {
						 tail = null;
					 }
				 }
				 else {
					 prev.next = trav.next;
				 }
				 return; 
			 }
			 prev = trav;
			 trav = trav.next;
		 } while(trav != tail.next);
	 }
	public void display() {
		
		 if (isEmpty()) {
	            System.out.println("List is empty");
	            return;
	        }
		 	System.out.print("List : ");
	        Node trav = tail.next;
	        do {
	            System.out.print(trav.data + " ");
	            trav = trav.next;
	        } while (trav != tail.next);
	        System.out.println();
	}
	}

