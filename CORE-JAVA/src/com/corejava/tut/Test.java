package com.corejava.tut;

public class Test {

	
	static int a=m1();
	static int m1() {
		System.out.println("M1()");
		return 10;
	}
//	static int b=m2();
	static int m2() {
		System.out.println("M2()");
		
		return 20;
		
	}
//	public void m3() {
//		m2();
//	}
	public static void main(String[] args) {
		int a=40;
		
		System.out.println("Main()");
		System.out.println("A : "+Test.a);
		System.out.println("B : "+b);
		
	}
	static int b=m2();
}
