package com.assignment;

import java.util.Scanner;

//WAP to demonstrate try catch block.
public class Demonstrate {
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		try 
		{
			System.out.println("Enter a : ");
			a = sc.nextInt();
			
			System.out.println("Enter B : ");
			b = sc.nextInt();
			
			System.out.println("Division"+ (a/b));
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}


			
	}

}
