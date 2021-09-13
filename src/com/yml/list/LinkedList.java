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

}