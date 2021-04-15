package com.javaExamples;

public class ThrowThrowsExample {

	public static void main(String[] args) throws ArithmeticException,Exception{
		// TODO Auto-generated method stub
		int i=2,j=0,k;
		try {
		k=i/j;
		throw new ArithmeticException("please provide correct information");
		}
		catch(ArithmeticException ae) {
			System.out.println("enter valid data");
		}

	}
	

}
