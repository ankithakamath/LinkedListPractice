package com.yml.list;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList linkedlist = new LinkedList();
linkedlist.add(56);

linkedlist.add(70);
//linkedlist.push(30);
linkedlist.print();

 linkedlist.insertAtpos(2,30);
 linkedlist.print();
 
 
 
 linkedlist.find(30);
 linkedlist.insertAfter(30, 40);
 linkedlist.print();
 
 linkedlist.deletenode(40);
 linkedlist.print();
	}

}
