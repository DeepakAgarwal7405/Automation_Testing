package com.assignment;
/*Question 17-
WAP to create one thread by implementing Runnable interface in class */

class Assignment17 implements Runnable{

	public void run() {
		for (int i = 1; i <= 5; i++){
			System.out.println("First thread is ...."+i);
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		System.out.println("First thread completed ....");
		}
	}
public class Module6QXVII {
	public static void main(String[] args) {
		Assignment17 a1 = new Assignment17();
		Thread t1 = new Thread(a1);
		t1.start();
				
		for (int i = 1; i <= 5; i++){
		System.out.println("Main thread is ..."+i);
		try {
		Thread.sleep(2000);
		}
		catch (InterruptedException e){
		e.printStackTrace();
		}
		}
		System.out.println("Main thread completed ....");
	}

}
