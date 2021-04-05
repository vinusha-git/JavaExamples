package com.javaExamples;

public class ThisClassInstance {
	
	ThisClassInstance getValues(){
		return this;
		
	}
	void print()
	{
		System.out.println("hello java !!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisClassInstance().getValues().print();
	}

}
