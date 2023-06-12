package com.love.dsa.revision.linkedlist.doubly;

public class DoublyLinkedList {

	public static class Node{
		private Node prev;
		private int data;
		private Node next;
		
		public Node(int data) {
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;
	private Node addFirst(int data) {
		
		Node newNode=new Node(data);
		
		if(head==null && tail==null) {
			head=tail=newNode;
			return head;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
		return head;
	}
	public Node addLast(int data) {
		
		Node newNode=new Node(data);
		if(head==null && tail==null) {
			head=tail=newNode;
			return head;
		}
		Node curr=head;
		
		while(curr.next!=null) {
			
			curr=curr.next;
		}
		curr.next=newNode;
		newNode.prev=curr;
		tail=newNode;
		return head;
	}
	private Node insertAt(int p,int data) {
	
		Node newNode=new Node(data);
		int count=0;
		Node prev=null;
		Node curr=head;
	
		while(curr!=null) {
			
			if(count==p) {
				break;
			}
			count++;
			prev=curr;
			curr=curr.next;
		}
		Node next=prev.next;
		prev.next=newNode;
		newNode.prev=prev;
		newNode.next=next;
		return head;
	}
	private void print(Node head) {
		if(head==null&& tail==null) {
			System.out.println("List is empty!");
			return;
		}
		Node curr=head;
		System.out.println("HEAD : "+head.data);
		while(curr!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		
		System.out.print(curr);
		System.out.println("\nTAIL: "+tail.data);
		System.out.println();
	}
	public Node deleteFirst() {
		
		if(head==null && tail==null) {
			System.out.println("List is empty!");
			return null;
		}
		if(head.next!=null)
			head=head.next;
		else
			head=tail=null;
		return head;
	}
	public Node deleteLast(Node head) {
		if(head==null && tail==null) {
			System.out.println("List is empty!");
			return null;
		}
		if(head.next==null) {
			head=tail=null;
			return head;
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
		return head;
	}
	public Node deleteAt(Node head,int position) {
		
		int size=size(head);
		if(head==null && tail==null) {
			System.out.println("Delete at position will not possible ,List is empty!");
			return null;
		}
		if(position<0 || position>size-1) {
			System.out.println("Delete at position operation will not possible ,"
					+" given position "+ position +" should not be less than 0 or greater than "+ (size-1));
			return head;
		}
		if(size==1&&position>0) {
			System.out.println("Delete at position "+position+" will not possible ,List has 1 element only!");
			return head;
		}
		if(size(head)==1&&position==0) {
			head=tail=null;
			return head;
		}
		Node curr=head;
		int count=0;
		Node prev=null;
		
		while(curr.next!=null) {
			
			if(count==position) {
				break;
			}
			count++;
			prev=curr;
			curr=curr.next;
		}
		
		
		Node next=curr.next;
		if(next==null) {
			prev.next=null;
			tail=prev;
			curr=null;
			return head;
		}
		if(prev!=null)
			prev.next=next;
		else {
			head=head.next;
			head.prev=null;
		}
		next.prev=prev;
		curr=null;
		return head;
		
	}
	public int size(Node head) {
		
		if(head==null && tail==null) {
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
		Node head=dl.addFirst(20);
		 head=dl.addFirst(10);
		 head=dl.addFirst(5);
		 head=dl.addLast(25);
		 
		 dl.print(head);
		 head=dl.deleteAt(head, 5);
		 dl.print(head);
//		head=dl.deleteLast(head);
//		dl.print(head);
//		head=dl.deleteLast(head);
//		dl.print(head);
//		head=dl.deleteFirst();
//		dl.print(head);
		
//		Node head=dl.addFirst(10);
//		dl.addLast(30);
//		head=dl.addLast(40);
//		dl.print(head);
//		head=dl.insertAt(1, 15);
//		dl.print(head);
//		head=dl.insertAt(3, 25);
//		dl.print(head);
//		int size=dl.size(head);
//		System.out.println("SIZE: "+size);
//		
//		head=dl.deleteFirst();
//		dl.print(head);
	}

}