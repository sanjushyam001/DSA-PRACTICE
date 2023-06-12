package com.love.dsa.stack;

import java.util.*;
public class Stack {

	int ar[];
	int size;
	int top;
	
	//Constructor to Initialize the Stack with size 
	public Stack(int size) {
		this.size=size;
		ar=new int[size];
		top=-1;
	}
	//Add element to the top of the Stack
	public void push(int data) {
		
		if(top<size-1) {
			top++;
			ar[top]=data;
			return;
		}
		System.out.println("Stack overflow!");
		
	}
	//remove the element from the top ,and return the top element
	public int pop() {
		int topValue = -1;
		if(!isEmpty()) {
			topValue=ar[top];
			top--;
		}
		return topValue;
	}
	//print the Stack elements
	public void print() {
		if(!isEmpty()) {
			for(int i=top;i>=0;i--) {
				System.out.println(ar[i]+" ");
			}
		}
		System.out.println("Stack is underflow!");
	}
	//SIZE
	public int size() {
		if(!isEmpty()) {
			return top+1;
		}
		return 0;
		
	}
	//PEEK
	public int peek() {
		return isEmpty()?-1:ar[top];
	}
	//IS EMPTY
	public boolean isEmpty() {
		
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	
}
