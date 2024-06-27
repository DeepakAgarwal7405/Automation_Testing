package com.assignment;
import java.util.Scanner;

//write a program to find the index of an array element
public class FindIndex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an Array:- ");
	int n=sc.nextInt();
	int a[]= new int [n];
	
  for (int i = 0; i <a.length; i++){
		System.out.println("Enter a "+i+" number:");
		a[i] = sc.nextInt();
	
	}

	int find ;
	int index=0;
	
	System.out.println("Array element is : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
		System.out.println();
	
		System.out.println("Enter the array element to find index : ");
		find = sc.nextInt();
	
	for (int i = 0; i < a.length; i++){
		if (a[i]==find)	{
			index = i;
		}
	}
	System.out.println("index number is : "+index);
//	System.out.println("index number is : "+ a[3]);
	
}
}