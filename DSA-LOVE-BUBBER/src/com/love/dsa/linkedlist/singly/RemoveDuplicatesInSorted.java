package com.love.dsa.linkedlist.singly;

import com.love.dsa.linkedlist.singly.ReverseListInKGroup.Node;

public class RemoveDuplicatesInSorted {

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
	public Node removeDuplicate(Node head) {
		
		if(head==null) {
			return null;
		}
		Node curr=head;
		while(curr!=null) {
			
			if(curr.next!=null && curr.data==curr.next.data) {
				
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		RemoveDuplicatesInSorted ll=new RemoveDuplicatesInSorted();
		ll.addFirst(20);
		ll.addFirst(20);
		ll.addFirst(10);
		Node head=ll.addFirst(10);
		ll.printList(head);
		head=ll.removeDuplicate(head);
		System.out.println("After removing duplicates");
		ll.printList(head);
	}

}
