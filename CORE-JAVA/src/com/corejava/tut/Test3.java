package com.corejava.tut;

public class Test3 {

	static {
		System.out.println("SB start");
		main(new String[2]);
		System.out.println("SB end");
	}
//	static int a=m1();
//	static int m1() {
//		System.out.println("m1()");
//		return 10;
//	}
	public static void main(String[] args) {
		System.out.println("MAIN");
	}
//	static {
//		System.out.println("SB");
//	}
}
