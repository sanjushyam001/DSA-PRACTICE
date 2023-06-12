package com.love.dsa.stack.interview;

import java.util.*;
public class SortStack {

	public static void sortInsert(Stack<Integer> stack ,int element) {
		
		if(stack.isEmpty() || !stack.isEmpty() && stack.peek()<element ) {
			stack.push(element);
			return;
		}
		int poppedElement=stack.pop();
		sortInsert(stack,element);
		stack.push(poppedElement);
	}
	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int poppedElement=stack.pop();
		sortStack(stack);
		sortInsert(stack,poppedElement);
		
	}
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(5);stack.push(-2);stack.push(9);stack.push(-7);stack.push(3);
		sortStack(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
