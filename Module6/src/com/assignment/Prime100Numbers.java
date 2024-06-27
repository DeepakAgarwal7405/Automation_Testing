package com.assignment;

public class Prime100Numbers {
	public static void main(String[] args) {

        int a=1,b,c=0;	//executes until the cond becomes false
        while (a<=100) {
            b=0;

            int i=2;
            while (i<=a/2) {
                
                if (a%i==0) {	//find the reminder and check if it is equal to 0 or not
                b++;			//increment the b variable by 1 if the above cond is true
                break;
                }
            i++;			//increment the i variable by 1
            }				//end of inner while

             if (b==0&&a!=1) {// calculates the sum of prime numbers
                c=c+a;	
            }				//endd of if statement
            a++;			//increment the n vaiable by 1 after completing each iteration
        }				//end of outer while

        System.out.println("the sum of first 100 prime number is "+ c); //print the sum
            
	}

}
