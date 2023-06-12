package com.love.dsa.stack.interview;
import java.util.*;
public class PushElementAtBotton {


	public static void insertAtBottom(Stack<Integer> stack,int element) {
		
		if(stack.isEmpty()) {
			stack.push(element);
			return;
		}
		int poppedElement=stack.pop();
		
		//recurrsive call 
		insertAtBottom(stack,element);
		//call back
		stack.push(poppedElement);
		
		
	}
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(7);stack.push(1);stack.push(4);stack.push(5);
		
		int element=10;
		insertAtBottom(stack,element);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
