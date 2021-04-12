package com.javaExamples;

public class InterfaceExampleClass implements ShapeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeInterface inter=new CircleInterfaceClass();
		inter.draw();
	
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceExampleClass");
		
	}

}
