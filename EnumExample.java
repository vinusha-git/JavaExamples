package com.javaExamples;

class EnumExampleClass {

	   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	   FreshJuiceSize size;

}

public class EnumExample {

	   public static void main(String args[]) {
		   EnumExampleClass juice = new EnumExampleClass();
	      juice.size = EnumExampleClass.FreshJuiceSize.MEDIUM ;
	      System.out.println("Size: " + juice.size);
	   }
	}