package com.javaExamples;

public class ThisMethod {
	void firstMethod(){
		System.out.println("welcome to firstMethod");
	}
	void secondMethod() {
		System.out.println("welcome to secondMethod");
		firstMethod(); //compiler automatically adds this keyword to this method htis.firstMethod(); 
	}
	
	
	 static class Test{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod tm=new ThisMethod();
		tm.secondMethod();
	}

}
}
