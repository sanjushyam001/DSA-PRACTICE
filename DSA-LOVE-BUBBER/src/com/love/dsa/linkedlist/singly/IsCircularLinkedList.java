package com.love.dsa.linkedlist.singly;

import com.love.dsa.linkedlist.singly.LinkedList.Node;

public class IsCircularLinkedList {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;

	// ----------- ADD FIRST --------------------------
	public Node addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;

	}

	public void printList(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public boolean isCircular(Node head) {
		if(head==null) 
			return true;
		Node curr=head.next;
		while(curr!=null && curr!=head) {
			curr=curr.next;
		}
		if(curr==head) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		IsCircularLinkedList rl=new IsCircularLinkedList();
		rl.addFirst(40);
		rl.addFirst(30);
		rl.addFirst(20);
		Node head=rl.addFirst(10);
		//Node head=null;
		rl.printList(head);
		if(rl.isCircular(head)) {
			System.out.println("List is circular in nature");
		}else {
			System.out.println("List is not circular in nature");
		}
		
	}

}
