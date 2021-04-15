package com.javaExamples;

public class ExceptionHandlingP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=0,k=0;
		try {
		k=i/j;
		}
		catch(Exception exe) {
		System.out.println("cannot divide by zero");
		System.out.println(exe);

	}
		System.out.println(k);


}
}
