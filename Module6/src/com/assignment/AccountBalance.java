package com.assignment;

/*Question27--W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than
account balance then program will show custom exception otherwise amount will deduct from
account balance.
Account balance is:2000
Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs.
To perform this transaction.*/

import java.util.Scanner;
public class AccountBalance {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Please Enter Withdraw Amount");	
		int amount=sc.nextInt();
		int b=amount-2000;

		if (amount<=2000) {
			System.out.println("Pleas wait while your transaction is being processed");
		}else {
			System.out.println("Sorry insufficient funds, you need more "+b+" \nto perform this transaction");
		}	
			
			
	}

}
