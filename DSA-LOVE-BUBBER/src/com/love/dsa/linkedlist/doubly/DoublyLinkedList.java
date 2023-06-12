package com.love.dsa.linkedlist.doubly;

public class DoublyLinkedList {

	public static class Node{
		Node next;
		int data;
		Node prev;
		
		public Node(int data) {
			this.next=null;
			this.data=data;
			this.prev=null;
		}
		
	}
	Node head;
	Node tail;
	public void print() {
		Node temp=head;
		while(temp!=null) {
			
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		if(temp==null) {
			System.out.print("NULL");
		}
		System.out.println();
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
	}
	public void addLast1(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
		newNode.prev=curr;
		tail=newNode;
	}
	public void addAtSpecificPosition(int data,int p) {
		Node newNode=new Node(data);
		Node curr=head;
		int count=0;
		while(count<p-1) {
			count++;
			curr=curr.next;
		}
		Node temp=curr.next;
		newNode.prev=curr;
		curr.next=newNode;
		newNode.next=temp;
		temp=curr=null;
		
	}
	public void deleteFirst() {
		
		if(head==null) {
			System.out.println("List is empty!");
			return;
		}
		if(size()==1) {
			head=tail=null;
			return;
		}
		Node temp=head.next;
		temp.prev=null;
		head=temp;
		temp=null;
		
	}
	public void deleteAtSpecificPosition(int p) {
		if(head==null&&tail==null) {
			System.out.println("List is empty!");
		}
		if(size()==1) {
			head=tail=null;
			return;
		}
		Node curr=head;
		int count=0;
		while(count<p-1) {
			count++;
			curr=curr.next;
		}
		Node temp=curr.next.next;
		curr.next=temp;
		if(temp!=null) {
			temp.prev=curr;
			
		}
		temp=null;
		
	}
	public void deleteLast() {
		if(head==null && tail==null) {
			System.out.println("List is empty!");
			return;
		}
		if(size()==1) {
			head=tail=null;
			return;
		}
		Node curr=head;
		Node prev=null;
		
		while(curr.next!=null) {
		
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		tail=prev;
		curr=null;
	}
	public int size() {
		
		if(head==null) {
			return 0;
		}
		Node curr=head;
		int count=0;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.addFirst(10);
		dl.addFirst(05);
		dl.addLast(15);
		dl.addLast(20);
//		dl.addLast1(25);
		dl.print();
		dl.deleteLast();
		dl.print();
		//dl.deleteLast();
		//dl.deleteLast();
//		dl.addAtSpecificPosition(12, 2);
//		dl.print();
//		dl.addAtSpecificPosition(16, 4);
//		dl.print();
//		System.out.println("SIZE: "+dl.size());
//		dl.deleteFirst();
//		dl.print();
//		System.out.println("SIZE: "+dl.size());
//		//dl.deleteFirst();
//		dl.deleteAtSpecificPosition(1);
//		dl.print();
//		System.out.println("SIZE: "+dl.size());
//		dl.deleteAtSpecificPosition(1);
		
//		dl.print();
//		System.out.println("SIZE: "+dl.size());
		
		System.out.println("HEAD => "+dl.head.data+" TAIL => "+dl.tail.data);

	}

}
