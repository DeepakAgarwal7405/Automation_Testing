package com.assignment;

import java.util.Scanner;
//WAP to demonstrate multiple catch blocks
public class MultipleDemonstrate {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter the value of a : ");
			a = sc.nextInt();
			
			System.out.println("Enter the value of B : ");
			b = sc.nextInt();
			
			c = Integer.parseInt(sc.nextLine());
			System.out.println("Division"+ (a/b));
		}
		
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Arithmetic "+e);
		}
		catch (NumberFormatException e)
		{
			// TODO: handle exception
			System.out.println("Number Format "+e);
		}

	}

}
