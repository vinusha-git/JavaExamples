package com.javaExamples;

abstract class Example1 {
	abstract void bike();
}

class Demo extends Example1
{
	@Override
	void bike() {
		// TODO Auto-generated method stub
		System.out.println("overide method");
		
	}
}

public class AbstractKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d=new Demo();
d.bike();
	}
} 


	


