package com.src.geeksforgeeks.linkedlist;

class DataStructure {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFront(50);
		list.addFront(45);
		list.addFront(40);
		list.addFront(30);
		list.addFront(20);
		list.addFront(10);
		System.out.println(list);
		list.reverse();
		System.out.println(list);
	}
}