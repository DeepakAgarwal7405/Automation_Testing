package com.assignment;
import java.util.Scanner;
//average value of array element
public class AverageArray {
public static void main(String[] args) {
	int a[]= new int [4];
  Scanner sc = new Scanner(System.in);
  
  
  for (int i = 0; i <a.length; i++){
		System.out.println("Enter a "+i+" number:");
		a[i] = sc.nextInt();
	
	}
	int k=0;
	for (int i = 0; i < a.length; i++) {
	k=k+a[i];
	}
	int avg= k/a.length;
	System.out.println("The average value of an array element is:- "+ avg);
	
	
}
}