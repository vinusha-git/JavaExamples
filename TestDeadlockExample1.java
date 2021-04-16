package com.javaExamples;

public class TestDeadlockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource1="resource1";
		String resource2="resource2";
		
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1:resource1 locked !!!");
					try {
						Thread.sleep(100);
					}
catch(Exception e) {
	
}
					synchronized (resource2) {  
			            System.out.println("Thread 1: locked resource 2");
				}
				
			}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread2:resource1 locked !!!");
					try {
						Thread.sleep(100);
					}
catch(Exception e) {
	
}
					synchronized (resource2) {  
			            System.out.println("Thread 2: locked resource 2");
				}
				
			}
		}
		
		
		};
		
		t1.start();
		t2.start();
		

	}
}

