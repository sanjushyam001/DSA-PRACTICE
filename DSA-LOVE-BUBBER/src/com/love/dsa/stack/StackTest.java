package com.love.dsa.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		stack.print();
		stack.push(1);
		stack.push(2);
		stack.print();
		System.out.println("Size: "+stack.size());
		int poppedElement = stack.pop();
		System.out.println("Popped Elemet is : "+poppedElement);
		stack.print();
		System.out.println("Size: "+stack.size());
		int poppedElement1 = stack.pop();
		System.out.println("Popped Elemet is : "+poppedElement1);
		stack.print();
		System.out.println("Size: "+stack.size());
		int peekedElement = stack.peek();
		System.out.println("Peek Element: "+peekedElement);
		System.out.println("Top value: "+stack.top);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Top value: "+stack.top);
		stack.push(6);
		int peekedElement1 = stack.peek();
		System.out.println("Peek Element: "+peekedElement1);

	}

}
