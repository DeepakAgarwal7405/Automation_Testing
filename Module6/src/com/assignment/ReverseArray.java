package com.assignment;

import java.util.Scanner;
//Question23--WAP to reverse an array of integer values.
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an numbers:- ");
		int a []= new int[5];
		for (int i = 0; i < a.length; i++) { //Enter data in array
			a[i]= sc.nextInt();
		}
		
		System.out.println("Original Array:- ");
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}

		System.out.println("Reverse Array:- ");
		for (int i = a.length-1; i >= 0; i--){
		System.out.println(a[i]);
		}
	}

}
