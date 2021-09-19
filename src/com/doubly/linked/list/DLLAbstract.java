package com.doubly.linked.list;

public abstract class DLLAbstract {
	
	public abstract int get(int index);	
	public abstract void addAtHead(int val);
	public abstract void addAtTail(int val);
	public abstract void addAtindex(int index, int val);
	public abstract void removeAtIndex(int index);
	public abstract int getSize();
	public abstract void display();

}
