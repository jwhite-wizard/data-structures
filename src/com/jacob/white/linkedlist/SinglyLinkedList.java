package com.jacob.white.linkedlist;


public class SinglyLinkedList<T> {
	private Node head;
	
	public SinglyLinkedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void insert(Node newNode){
		newNode.setNext(head);
		head = newNode;
	}
	
	public Node removeHead(){
		Node headReference = head;
		if(!this.isEmpty()){
			head = head.getNext();
		}else {
			System.out.println("Empty linked list --- Cannot remove head");
		}
		return headReference;
	}
	
	public String toString(){
		StringBuffer stringBuf = new StringBuffer();
		Node node = this.getHead();
		if(node != null){
			while(node.getNext() != null){
				stringBuf.append(node.toString());
				node = node.getNext();
			}
		}
		return stringBuf.toString();
	}
	
	public Node getHead(){
		return head;
	}
}
