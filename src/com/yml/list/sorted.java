package com.yml.list;

public class sorted<T> {
private Node head;
	
	private class Node<E extends Comparable<E>>{ 
		
		private Node<E> next;
		private E data;
		
		public Node(E data) {
			this.data = data;
		}
		
	}
	//method to sort in ascending order
	public<E extends Comparable<E>> void add(E data) {
		Node<E> newNode = new Node<E>(data);
		
		if(head == null || head.data.compareTo(data)>0) {
			newNode.next = head;
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null && temp.next.data.compareTo(data)<0 ) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode; 
		}
	}
	//printing the linked list
	public void print() {
		Node temp = head;
		
		System.out.println("SortedLinkedList ");
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
	}
}


