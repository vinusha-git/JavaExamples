package com.javaExamples;


public class FinallyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=2,k=0;
		try {
			k=i/j;
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero Exception");
		}
		
		finally {
			System.out.println("Finally");
		}
	}

}
