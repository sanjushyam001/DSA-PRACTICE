package com.love.dsa.linkedlist.singly;

import com.love.dsa.linkedlist.singly.LinkedList.Node;

public class ReverseListInKGroup {

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
	
	public Node kReverse(Node head,int k) {
		
		if(head==null) 
			return null;
		
		Node curr=head;
		Node prev=null;
		Node forward=null;
		int count=0;
		while(curr!=null && count<k) {
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
			count++;
		}
		
		if(forward!=null) {
			head.next=kReverse(forward,k);
		}
		return prev;
	}

	public static void main(String[] args) {

		ReverseListInKGroup rl=new ReverseListInKGroup();
		rl.addFirst(40);
		rl.addFirst(30);
		rl.addFirst(20);
		Node head=rl.addFirst(10);
		//rl.printList(head);
		Node reverseHead=rl.kReverse(head, 2);
		rl.printList(reverseHead);
	}

}
