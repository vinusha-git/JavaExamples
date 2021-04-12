package com.javaExamples;

public class ArrayMethodPassing {
	static void min(int ar[]) {
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		if(min>ar[i])
		{
		min=ar[i];
			System.out.println(ar[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {33,3,4,5};
ArrayMethodPassing.min(a);

	}

}
