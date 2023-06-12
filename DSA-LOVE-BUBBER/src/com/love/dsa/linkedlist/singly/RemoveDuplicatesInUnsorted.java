package com.love.dsa.linkedlist.singly;

import java.util.*;
public class RemoveDuplicatesInUnsorted {

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
	
	//using map
	
public Node removeDuplicateUsingHashMap(Node head) {
		
		if(head==null) {
			return null;
		}
		
		Map<Integer,Integer> visited=new HashMap<>();
		Node curr=head;
		Node prev=null;
		while(curr!=null) {
			
			if(visited.containsKey(curr.data)) {
				
				prev.next=curr.next;
				curr=prev.next;
			}else {
				visited.put(curr.data, 1);
				prev=curr;
				curr=curr.next;
			}
			
		}
		return head;
	}
	public Node removeDuplicate(Node head) {
		
		if(head==null) {
			return null;
		}
		Node curr=head;
		while(curr!=null) {
			
			Node temp=curr.next;
			Node prev=curr;
			while(temp!=null) {
				if(temp.data==curr.data) {
					//temp.next!=null
					prev.next=temp.next;
				}else {
					
					prev=prev.next;
					
				}
				temp=temp.next;
				
			}
			curr=curr.next;
		}
		return head;
	}
	public static void main(String[] args) {
		RemoveDuplicatesInUnsorted ll=new RemoveDuplicatesInUnsorted();
		ll.addFirst(40);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(20);
		ll.addFirst(20);
		ll.addFirst(10);
		Node head=ll.addFirst(30);
		ll.printList(head);
		//head=ll.removeDuplicate(head);
		head=ll.removeDuplicateUsingHashMap(head);
		System.out.println("After removing duplicates");
		ll.printList(head);
	}

}
