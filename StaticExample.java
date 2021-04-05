package com.javaExamples;

public class StaticExample {
	public static void staticTest() {
		System.out.println("static statement");
	}
	public void nonStaticTest() {
		System.out.println("non-static statement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticTest();
		StaticExample s=new StaticExample();
		s.nonStaticTest();
	}

}
