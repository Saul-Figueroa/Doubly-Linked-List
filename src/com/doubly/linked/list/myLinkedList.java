package com.doubly.linked.list;

class ListNode{
	int val;
	ListNode next;
	ListNode prev;
	ListNode(int val){
		this.val = val;
	}
	
	
}

public class myLinkedList extends DLLAbstract{
	
	int size;
	ListNode head;
	ListNode tail;
	
	public myLinkedList() {
		size=0;
		head = new ListNode(0);
		tail = new ListNode(0);
		head.next = tail;
		tail.prev = head;
		
	}

	@Override
	public int get(int index) {
		ListNode current = head;
		//Use bidirectional search
		if(index + 1 < size - index) {
			for(int i=0; i < index +1; i++) current = current.next;
		}else {
			current = tail;
			for(int i=0; i < size - index; i++) current = current.prev;
		}
		
		return current.val;
	}

	@Override
	public void addAtHead(int val) {
		ListNode pred = head, succ = head.next;
		
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
		size++;
		
	}

	@Override
	public void addAtTail(int val) {
		ListNode pred = tail.prev, succ = tail;
		
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
		size++;
		
	}

	@Override
	public void addAtindex(int index, int val) {
		
		if(index > size) return;
		if(index < 0) index =0;
		
		ListNode pred, succ;
		if(index < size - index) {
			pred = head;
			for(int i =0; i < index; i++) pred = pred.next;
			succ = pred.next;
		}else {
			succ = tail;
			for(int i =0; i < size - index; i++) succ = succ.prev;
			pred = succ.prev;
		}
		
		ListNode toAdd = new ListNode(val);
		toAdd.prev = pred;
		toAdd.next = succ;
		pred.next = toAdd;
		succ.prev = toAdd;
		size++;
		
	}

	@Override
	public void removeAtIndex(int index) {
		if(index < 0 || index >= size) return;
		ListNode pred, succ;
		
		if(index < size - index) {
			pred = head;
			for(int i =0; i < index; i++) pred = pred.next;
			succ = pred.next.next;
		}else {
			succ = tail;
			for(int i=0; i < size - index-1;  i++) succ = succ.prev;
			pred = succ.prev.prev;
			
		}
		pred.next = succ;
		succ.prev = pred;
		size--;
		
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void display() {
		if(head == null) System.out.println("Empty list!");
		ListNode current = head.next;
		while(current.next != null) {
			System.out.println("data: "+current.val);
			current = current.next;
		}
		
	}
	
	

}
