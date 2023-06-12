package com.love.dsa.linkedlist.singly;


public class Sort012s {

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
	public Node sortByReplacedValue(Node head) {
		
		Node curr=head;
		int zeroCount=0;
		int oneCount=0;
		int twoCount=0;
		while(curr!=null) {
			
			if(curr.data==0)
				zeroCount++;
			if(curr.data==1)
				oneCount++;
			if(curr.data==2)
				twoCount++;
			curr=curr.next;
		}
		curr=head;
		while(curr!=null) {
			
			
			if(zeroCount!=0) {
				curr.data=0;
				zeroCount--;
			}else if(oneCount!=0) {
				curr.data=1;
				oneCount--;
			}else {
				curr.data=2;
				twoCount--;
			}
			
			curr=curr.next;
			
		}
		
		
		return head;
	}
	public static void main(String[] args) {
		Sort012s s=new Sort012s();
		s.addFirst(2);
		
		s.addFirst(1);
		s.addFirst(2);
		s.addFirst(0);
		Node head=s.addFirst(1);
		s.printList(head);
		head=s.sortByReplacedValue(head);
		System.out.println("After sorting: ");
		s.printList(head);
	}

}
