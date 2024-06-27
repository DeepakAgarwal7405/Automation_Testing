package com.assignment;

import java.util.Scanner;
//W.A.J.P to check given number is Prime or not?
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt(), n=1;

		for (int i = 2; i < num; i++) {  
		if (num%i==0) {
			n=0;
		}
		}
		if (n==0) {
		System.out.println(num+" not a prime number");	
		}else {
		System.out.println(num+" is a prime number");
		}

		
	}

}
