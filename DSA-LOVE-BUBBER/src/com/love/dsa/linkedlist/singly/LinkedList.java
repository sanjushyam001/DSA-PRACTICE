package com.love.dsa.linkedlist.singly;

public class LinkedList {

	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	Node tail;
	
	//----------- ADD FIRST --------------------------
	public void addFirst(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
		
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
		
	}
	public void printList() {
	
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void insertAtPosition(int data,int position) {
		//add at the begining
		if(position==1) {
			addFirst(data);
			return;
		}
		int count=1;
		Node temp=head;
		while(count<position-1) {
			temp=temp.next;
			count++;
		}
		if(temp.next==null) {
			addLast(data);
			return;
		}
		Node newNode=new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void deleteNode(int position) {
		
		if(position==1) {
			head=head.next;
			return;
		}else {
			
			int count=1;
			
			Node curr=head;
			Node prev=null;
			while(count<position) {
				
				prev=curr;
				curr=curr.next;
				count++;
			}
			if(curr.next==null) {
				prev.next=null;
				tail=prev;
				return;
			}
			prev.next=curr.next;
			curr=null;
					
		}
		
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
		Node temp=head;
		head=temp.next;
		temp=null;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("List is empty!");
			return;
		}
		if(size()==1) {
			head=tail=null;
			return;
		}
		System.out.println("Delete Last..");
		Node curr=head;
		Node prev=null;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		tail=prev;
		prev.next=null;
		
	}
	public int size() {
	
		Node curr=head;
		int count=0;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	private  void reverse() {
		
		if(head==null || head.next==null) {
			return;
		}
		Node curr=head;
		Node prev=null;
		Node forward=null;
		while(curr!=null) {
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		tail=head;
		head=prev;
	}
	public void recursiveReverse() {
		Node curr=head;
		Node prev=null;
		reverse1(head,curr,prev);
	}
	public void reverse1(Node head,Node curr,Node prev) {
		
		if(curr==null) {
//			tail=head;
			head=prev;
			return;
		}
		Node forward=curr.next;
		reverse1(head,forward,curr);
		curr.next=prev;
	}
	public void middleNode() {
		
		int l=size()/2+1;
		int count=0;
		Node curr=head;
		while(count<l-1) {
			count++;
			curr=curr.next;
		}
		System.out.println("Middle Node is : "+curr.data);
	}
	// ------------- middle node -2 -----------------
	
	public void middleNode2() {
		if(head==null) {
			System.out.println("List is empty!");
			return;
		}
		if(head.next==null) {
			System.out.println(head.data);
			return;
		}
		Node slow=head;
		Node fast=head.next;
		while(fast!=null) {
			
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
			}
			slow=slow.next;
		}
		System.out.println("Middle node is: "+slow.data);
	}
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		//ll.addLast(70);
//		ll.insertAtPosition(25,3);
//		ll.insertAtPosition(45,6);
//		ll.insertAtPosition(5,1);
//		ll.deleteNode(4);
//		ll.deleteNode(6);
		
//		System.out.println("SIZE: "+ll.size());
//		ll.printList();
//		ll.deleteLast();
		//ll.deleteFirst();
//		System.out.println("SIZE: "+ll.size());
//		ll.printList();
//		ll.deleteFirst();
		System.out.println("SIZE: "+ll.size());
		ll.printList();
		//ll.reverse();
		//ll.recursiveReverse();
//		System.out.println("AFTER REVERSE: ");
//		ll.printList();
//		System.out.println("SIZE: "+ll.size());
//		ll.printList();
//		
		ll.middleNode();
		System.out.println("HEAD : "+ll.head.data+" TAIL : "+ll.tail.data);
	}
	

}
