package com.corejava.tut;

public class Test2 {

	static int a;
	static void m1(int a) {
		a=Test2.a;
		System.out.println("A: "+a);
	}
	public static void main(String[] args) {
		System.out.println("A: "+a);
		m1(50);
		System.out.println("A: "+a);

	}

}
