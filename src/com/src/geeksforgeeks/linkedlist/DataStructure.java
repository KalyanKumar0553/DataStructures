package com.src.geeksforgeeks.linkedlist;

class DataStructure {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFront(7);
		System.out.println(list1);
		LinkedList list2 = new LinkedList();
		list2.addFront(5);
		System.out.println(list2);
		System.out.println(getSum(list1,list2));
	}

	private static int getSum(LinkedList list1, LinkedList list2) {
		Node currFirst = list1.header;
		Node currSecond = list2.header;
		int sum1=0 , sum2=0;
		while(true) {
			if(currFirst == null && currSecond == null) {
				break;
			}
			if(currFirst!= null) {
				int val = currFirst.getData();
				sum1 = (sum1 * 10) + val;
				currFirst = currFirst.getNext();
			}
			if(currSecond!=null) {
				int val = currSecond.getData();
				sum2 = (sum2 * 10) + val;
				currSecond = currSecond.getNext();
			}
		}
		return sum1+sum2;
	}
}