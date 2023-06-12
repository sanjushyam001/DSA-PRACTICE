package com.love.dsa.linkedlist.singly;

import com.love.dsa.linkedlist.singly.RemoveDuplicatesInSorted.Node;
import java.util.*;
public class LoopDetect {

	Boolean b;
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
	
	public boolean isLoopPresent(Node head) {
		System.out.println("B Value is : "+b);
		if(head==null) return false;
		HashMap<Node,Integer> visited=new HashMap<>();
		
		Node curr=head;
		while(curr!=null) {
			if(visited.containsKey(curr)) 
				return true;
			visited.put(curr, 1);
			curr=curr.next;
		}
		return false;
	}

	public static void main(String[] args) {
		LoopDetect ll=new LoopDetect();
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		Node head=ll.addFirst(10);
		ll.printList(head);
		boolean loopPresent = ll.isLoopPresent(head);
		System.out.println("Is Loop present?? "+loopPresent);
	}

}
