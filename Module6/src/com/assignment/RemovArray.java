package com.assignment;
//WA Java Program to remove the third element from a array list.

import java.util.ArrayList;

public class RemovArray {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		a1.add("Deepak");
		a1.add("Deep");
		a1.add(100);
		a1.add("$%");
		
		System.out.println("Actual Array list is ..\n"+a1);
		
		a1.remove(2);
		System.out.println("Removing the third element from actual array list is .. \n "+a1);	
	}

}
