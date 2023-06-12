package com.love.dsa.stack.interview;
import java.util.*;
public class DeleteMiddleElement {

	private static void delete(Stack<Integer> stack,int count,int size) {
	
		if(count==size/2) {
			stack.pop();
			return;
		}
		int number=stack.pop();
		//recursive call
		delete(stack,count+1,size);
		//retutning from recursive call
		stack.push(number);
	}
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(5);stack.push(9);stack.push(12);stack.push(8);stack.push(4);
		int count=0;
		int size=stack.size();
		delete(stack,count,size);
		System.out.println("SIZE: "+stack.size());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
