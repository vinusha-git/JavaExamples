package com.javaExamples;

public class PerformanceTest {
	static String stringTest(){
		String s="hello";
		for(int i=0;i<10000;i++) {
			s=s+"java";
		}
		
		
		return s;
	}
	static StringBuffer stringBufferTest(){
		StringBuffer s1=new StringBuffer("hello");
		for(int i=0;i<10000;i++) {
			s1.append("java");
		}
		
		
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long startTime = System.currentTimeMillis();  
		 stringTest();  
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        stringBufferTest();  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	}

}
