package com.yml.list;

import com.yml.list.*;

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
		//deleting at tail
		public void deleteTail() {
			Node temp = head;
			Node cur = temp;
			if (head == null) {
				System.out.println("Deletion not possible");
				return;
			} while(temp.next != null) {
					cur = temp;
					temp = temp.next;
				}
				System.out.println("Data from the tail is deleted");
				cur.next = null;

}
		//searching the key
		public Node find(int key) {
			Node tempNode = head;
			int count = 0;
			while (tempNode != null) {
				count++;
				if (tempNode.data==key) {
					System.out.println(key + "is at " + count + "th position");
					return tempNode;
				}
				tempNode = tempNode.next;

			}
			return null;
		}
		//insert after the position having key
		public void insertAfter(int key, int data) {
			Node newNode = new Node(data);
			Node temp = find(key);
			Node next = temp.next;
			temp.next = newNode;
			newNode.next = next;
		}
		//deleting specified node
		public void deletenode(int data) {

			Node curNode = head;
			Node prevNode = null;

			while (curNode != null && curNode.data != data) {
				prevNode = curNode;
				curNode = curNode.next;
			}
			prevNode.next = curNode.next;
		}

}