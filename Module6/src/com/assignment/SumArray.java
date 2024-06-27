package com.assignment;
import java.util.Scanner;
//write a program to sum value of an array
public class SumArray {
public static void main(String[] args) {

	int [] a = new int[5];
	Scanner sc = new Scanner(System.in);
	int k=0;
	
	for (int i = 0; i <a.length; i++){
		System.out.println("Enter a "+i+" number:");
		a[i] = sc.nextInt();
		k=k+a[i]; 
	}
	System.out.println("Sum of array value is : "+k);
}
}