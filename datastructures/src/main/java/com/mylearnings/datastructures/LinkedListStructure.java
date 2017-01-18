package com.mylearnings.datastructures;

public class LinkedListStructure {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
	}
}

class LinkedList {
	Node head;
	
	public void push(Node node) {
		node.next = head;
		head = node;
	}
	
	public void insertAfter(Node previousNode,Node node){
		node.next = previousNode.next;
		previousNode.next = node;
	}
	
	public void append(Node node) {
		if(head == null) {
			head.next = node;
			return;
		}
		
		Node next = head;
		while(next.next != null) {
			next = next.next;
		}
		
		next.next = node;
		return;
	}
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
}