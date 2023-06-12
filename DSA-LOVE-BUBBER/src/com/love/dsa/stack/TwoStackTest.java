package com.love.dsa.stack;

public class TwoStackTest {

	public static void main(String[] args) {
		TwoStack twoStack=new TwoStack(5);
		twoStack.push1(1);
		twoStack.push1(2);
		twoStack.push2(1);
		twoStack.push2(2);
		twoStack.push2(3);
		twoStack.printStack1();
		twoStack.printStack2();
	}

}
