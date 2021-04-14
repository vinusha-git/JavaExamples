package com.javaExamples;

public class StringPerformance {
	static StringBuffer stringBufferTest(){
		StringBuffer s1=new StringBuffer("hello");
		for(int i=0;i<10000;i++) {
			s1.append("java");
		}
		
		
		return s1;
	}
	static StringBuilder stringBuilderTest(){
		StringBuilder s1=new StringBuilder("hello");
		for(int i=0;i<10000;i++) {
			s1.append("java");
		}
		
		
		return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		 long startTime = System.currentTimeMillis();  
		 stringBufferTest();  
	        System.out.println("Time taken by Concating with stringBufferTest: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        stringBuilderTest();  
	        System.out.println("Time taken by Concating with  stringBuilderTest: "+(System.currentTimeMillis()-startTime)+"ms");  
	

	}

}
