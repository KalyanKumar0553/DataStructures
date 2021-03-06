package com.src.geeksforgeeks.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	public Node header=null;
	
	//Add a node at the front
	public void addFront(int data){
		Node insertNode=new Node(data);
		if(header==null){
			header=insertNode;
		}else{
			insertNode.setNext(header);
			header=insertNode;
		}
	}
	
	public void display(Node node) {
		StringBuffer result=new StringBuffer();
		Node temp=node;
		while(temp!=null){
			result.append(temp.getData()+",");
			temp=temp.getNext();
		}
		System.out.println(result.substring(0,result.length()-1));
	}
	
	public void reverse() {
		List<Node> result = new ArrayList();
		reverse(header,result);
		if(result.size() > 0 ) {
			header = result.get(0);
		}
	}
	

	private Node reverse(Node currNode,List<Node> result) {
		if(currNode.getNext() == null) {
			result.add(currNode);
			return currNode;
		}
		Node data = reverse(currNode.getNext(),result);
		currNode.setNext(null);
		data.setNext(currNode);
		return currNode;
	}
	
	public void addAfter(int data,int target){
		Node insertNode=new Node(data);
		if(header==null){
			header=insertNode;
		}else{
			boolean targetfound=false;
			Node temp=header,prev=null;
			while(temp!=null){
				if(temp.getData()==target){
					if(temp.getNext()!=null)
						insertNode.setNext(temp.getNext());
					temp.setNext(insertNode);
					targetfound=true;
				}
				prev=temp;
				temp=temp.getNext();
			}
			if(!targetfound){
				System.out.println("Node "+target+" Not found");
			}
		}
	}
	
	public void reverseIterative() {
		Node temp = header;
		Node prev = null;
		while(temp!=null) {
			Node curr = temp;
			temp = temp.getNext();
			curr.setNext(prev);
			prev = curr;
		}
		header = prev;
	}
	
	//Add a node at the end iterative
	public void addEnd(int data){
		if(header==null){
			header=new Node(data);
		}else{
			Node temp=header;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(new Node(data));
		}
	}
	
	
	//Find previous node of the node to be deleted iterative
	public void findPreviousDelete(int data){
		boolean elementfound=false;
		if(header!=null){
			Node temp=header,prev=null;
			while(temp!=null){
				if(temp.getData()==data){
					if(prev==null){
						header=temp.getNext();
						System.out.println("Starting element deleted");	
					}if(temp.getNext()!=null){
						prev.setNext(temp.getNext());
					}else{
						prev.setNext(null);
					}
					elementfound=true;
					System.out.println("Previous node is "+prev.getData());
					break;
				}
				prev=temp;
				temp=temp.getNext();
			}
		}
		if(!elementfound){
			System.out.println("Element not found");
		}
	}
	
	//Move last element to first Iterative
	public void moveLastToFirst(){
		Node temp=header;
		Node prev=null;
		while(temp.getNext()!=null){
			prev=temp;
			temp=temp.getNext();
		}
		prev.setNext(null);
		temp.setNext(header);
		header=temp;
	}
	
	// Free memory for the node to be deleted
	public void free(){
		Runtime.getRuntime().freeMemory();
	}
	
	// Delete a linked list node at the given position
	public void deleteAtPosition(int index){
		Node temp=header,prev=null;
		int currindex=0;
		if(index==0){
			header=header.getNext();
		}else{
			while(temp!=null){
				if(index==currindex){
					prev.setNext(temp.getNext());
					break;
				}
				prev=temp;
				temp=temp.getNext();
				currindex++;
			}
		}
	}
	
	//Find Length of a Linked List
	public void length(){
		Node temp=header;
		int length=0;
		while(temp!=null){
			length++;
			temp=temp.getNext();
		}
		System.out.println("length of list is "+length);
	}
	
	// Search an element in a Linked List 
	public void find(int element){
		Node temp=header;
		int index=1;
		while(temp!=null){
			if(temp.getData()==element){
				System.out.println("element found at "+index);
				break;
			}
			index++;
			temp=temp.getNext();
		}
		if(temp==null){
			System.out.println("element not found");
		}
	}
	// Write a function that modify head pointer of a Linked List
	public void modifyHeader(){
		header=header.getNext();
	}
	// Swap nodes in a linked list without swapping data
	public void swapNodes(){
		
	}

	public String toString() {
		StringBuffer result=new StringBuffer();
		Node temp=header;
		while(temp!=null){
			result.append(temp.getData()+",");
			temp=temp.getNext();
		}
		return result.substring(0,result.length()-1);
	}
}
