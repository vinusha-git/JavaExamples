package com.javaExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=8,j,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try {
	j=Integer.parseInt(br.readLine());
	k=i/j;
	System.out.println(k);
	
}

catch (IOException e) {
	// TODO: handle exception
	System.out.println("Enter valid value");
}
catch(Exception e)
{
	System.out.println("unkonown exception");
}
}

}
