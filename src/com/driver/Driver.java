package com.driver;

import com.doubly.linked.list.myLinkedList;

public class Driver {
	
	public static void main(String[] args) {
		
		myLinkedList call = new myLinkedList();
		call.addAtHead(0);
		call.addAtHead(1);
		call.addAtHead(2);
		call.addAtTail(-1);
		call.addAtTail(-2);
		call.addAtindex(1, 10);
		call.addAtindex(6, -10);
		call.removeAtIndex(6);
		call.removeAtIndex(0);
		
		System.out.println("size: "+call.getSize());
		System.out.println("____________________");
		call.display();
	}

}
