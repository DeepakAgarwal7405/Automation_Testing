package com.assignment;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int number=sc.nextInt();
		long fact=1;
		
		for(int i=1;i<=number;i++)
		{
			fact*=i;
		}
			System.out.println("Factorial of "+number+" dis:- "+fact);
	}

}
