package com.assignment;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String");
		String str1=sc.nextLine();
		System.out.println("Enter a Second String");
		String str2=sc.nextLine();

		
		if (str1.equals(str2)) {
		System.out.println("String are equal");	
		}else {
		System.out.println("String are different");	
		}
		
		
		
	}

}
