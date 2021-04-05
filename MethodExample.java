package com.javaExamples;

public class MethodExample {
	public int add(int a,int b) {
		a=10;
		int c=a+b;
		return c;
		
	}
	public int add(int i,int j,int k) {
		 k =i*j;
		return k;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample methodExample=new MethodExample();
		//call by vale
		int a=10,b=2;
		System.out.println("before addition a value : " + a);
		int result=methodExample.add(a, b);
		System.out.println("after addition a value : " + a);

		System.out.println(result);
		
		//Methodoverloading
		int l=1,m=25,k=1;
		int result1=methodExample.add(l, m,k);
		System.out.println("method overloading example : " + result1);
		

	}
 
}
