package com.javaExamples;

public class TryMultipleCatch {

	public static void main(String[] args) {

	int array[]=new int[4];
	int i=1,j=1,k=0;
	try {
		k=i/j;
		for(int n=0;n<=4;n++)
		{
			array[n]=n+1;
		}
		}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException ai) {
		System.out.println("array index out of bound exception");
	}
	catch(Exception e)
	{
		System.out.println("unknown exceptions");
	}
		for(int value:array) {
			System.out.println(value);
		}
		
	}

}
