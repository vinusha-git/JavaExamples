package com.javaExamples;

public class StringOperations {

	public static void main(String[] args) {
		StringBuffer s=new  StringBuffer( "hello");
		StringBuffer s2=s.reverse();
		String s3="welcome";
		if(s3.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
