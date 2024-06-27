package com.assignment;
/*Assignment_question22
WAP to Copy one array into another*/
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int b[] = new int[5];
		
		System.out.println("Enter Array Element");
		for (int i = 0; i < a.length; i++) { //Enter data in array
			a[i]= sc.nextInt();
		}
		System.out.println("original array");
		//Display
		for (int i = 0; i < a.length; i++)	{
			b[i] = a[i];
			System.out.println(a[i]);
		}
		
		System.out.println("copy array");
		
		for (int i = 0; i < b.length; i++)	{
			System.out.println(b[i]);
		}
	}

}
