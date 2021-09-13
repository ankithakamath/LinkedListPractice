package com.yml.list;

public class LinkedList {

	private Node head;
	
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data =data;
			next=null;
		}
	}
	public boolean add(final int data) {
		boolean isadded = false;
		//56
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			isadded =true;
		}else {
			Node temp = head;
			while (temp.next !=null){
				temp= temp.next;
			}
			temp.next = newNode;
			}
		return isadded;
		}
	//pushing data of linked list
		public void push(int data)
		{
			Node newNode =new Node(data);
			newNode.next = head;
			head = newNode;
		}
		//printing linked list
		public void print() {
			Node temp =head;
			System.out.println("'linked list :");
			while (temp.next!=null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println(temp.data + "-->null");
		}
		//inserting in the front
		public void addhead(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;

}
		//inserting in the end
		public boolean addtail(final int data) {
			boolean isAdded = false;

			Node newNode = new Node(data);

			if (head == null) {
				head = newNode;
				isAdded = true;

			} else {
				Node temp = head;

				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
				isAdded = true;
			}
			return isAdded;
		}


		//inserting at position pos
		public void insertAtpos(int pos,int data) {
			if(pos<1) {
				System.out.println("Invalid pos");
				return;
			}
			if (pos == 1) {
				addhead(data);
			} else {
				int count = 1;
				Node newNode = new Node(data);
				Node cur = head;
				Node prev = null;
				while (count < pos) {
					prev = cur;
					cur = cur.next;
					count++;
				}
				newNode.next = cur;
				prev.next = newNode;
			}
		}
		//deleting at front
		public void deleteHead() {
			Node temp = head;
			if (head == null) {
				System.out.println("No node to delete");
			} else {
				head = head.next;
				temp = null;
			}
		}

}