package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;
/*Question24--WAP to find the second largest element in an array*/
public class SecondLargestArray {
	public static void main(String[] args) {
		int T;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an numbers:- ");
		int a []= new int[5];
		for (int i = 0; i < a.length; i++) { //Enter data in array
			a[i]= sc.nextInt();
		}
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++){
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					
					T = a[i];
					a[i]= a[j];
					a[j]= T;
		}
		}
		}
		
		System.out.println("Third second largest number is:: "+a[a.length-2]);
		
		}

}
