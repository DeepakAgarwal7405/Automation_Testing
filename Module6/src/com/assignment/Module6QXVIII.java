package com.assignment;

/*Question 18:-
WAP to create one thread by extending Thread class in another
Class.*/
class Assignment18 extends Thread{
public void run() {
	for (int i = 1; i <= 5; i++) {
	System.out.println("First thread is ...."+i);
	try {
	Thread.sleep(2000);
	}
	catch (InterruptedException e){
	e.printStackTrace();
	}
	}
	System.out.println("First thread completed ....");
	}
}

public class Module6QXVIII { 
public static void main(String[] args)
	{
	Assignment18 a18 = new Assignment18();
	a18.start();
		
	for (int i = 1; i <= 5; i++)	{
	System.out.println("Main thread is ...."+i);
	try
	{
	Thread.sleep(2000);
	}
	catch (InterruptedException e){
	e.printStackTrace();
	}
	}
	System.out.println("Main thread is completed .....");
	}
}

