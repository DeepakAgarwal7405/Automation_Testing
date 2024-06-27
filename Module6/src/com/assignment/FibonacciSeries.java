package com.assignment;

//Write a java Program for create Fibonacci Series.
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Fibonacci Series");
		int t=sc.nextInt();
		int a=0;
		int b=1;
	    System.out.println("Fibonacci Series:- ");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i<=t; i++) {
			int c=(a+b);
			a=b;
			b=c;
		System.out.println(c);	
		}	
	}

}
