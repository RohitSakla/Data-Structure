package com.mylearnings.datastructures;

public class LinkedListStructure {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.Node node1 = new LinkedList.Node(10);
		list.append(node1);
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
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
}