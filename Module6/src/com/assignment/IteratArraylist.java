package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to iterate through all elements in an array list.
public class IteratArraylist {
	public static void main(String[] args) {
		ArrayList ia=new ArrayList();
		
		System.out.println("Default value is: "+ia);
		System.out.println("Default size is: "+ia.size());
		
		ia.add("Deepak");
		ia.add(23.56f);
		ia.add('D');
		ia.add("Student");
		ia.add(new Integer(20));
		
		System.out.println("Now value is: "+ia);
		System.out.println("Now size is: "+ia.size());
		Iterator i1=ia.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
