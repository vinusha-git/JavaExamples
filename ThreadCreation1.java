package com.javaExamples;

public class ThreadCreation1 extends Thread {
public void run() {
	System.out.println("thread is running");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreation1 t=new ThreadCreation1();
		t.start();

	}

}
