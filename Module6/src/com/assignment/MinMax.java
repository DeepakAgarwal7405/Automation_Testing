package com.assignment;
import java.util.Scanner;
//max or min value of an array
public class MinMax {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an Array:- ");
	int n=sc.nextInt();
	//int a[]= new int [n];
	int array[]= new int [n];
	
	
  for (int i = 0; i <array.length; i++){
		System.out.println("Enter a "+i+" number:");
		array[i] = sc.nextInt();
	
	}
  
  

  int max = array[0]; // Assume the first element is the maximum initially
  int min = array[0]; // Assume the first element is the minimum initially

  for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
          max = array[i]; // Update maximum value
      }

      if (array[i] < min) {
          min = array[i]; // Update minimum value
      }
    
  }
  
  System.out.println("Maximum value: " + max);
  System.out.println("Minimum value: " + min);

}
}