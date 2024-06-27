package com.assignment;
import java.util.ArrayList;

//WAP to update specific array element by given element

public class SpecificArray {
	public static void main(String[] args) {
		ArrayList A= new ArrayList();
		
		A.add("Deepak");
		A.add(1);
		A.add(122.12);
		A.add("$$");
		System.out.println("Before upadating the arraylist " +A);
		
		A.set(0, 1);
		A.set(1, "Deepak");
		A.set(2, "$");
		A.set(3, "5200");
		
		System.out.println("After upadating the arraylist " +A);
	}

}
