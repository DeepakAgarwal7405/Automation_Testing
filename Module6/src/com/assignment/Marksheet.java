package com.assignment;

import java.util.Scanner;
/*Question26--write a java program which will asks the user to enter his/her marks(out of 100).
Defien a method that will display grades according to the marks*/

public class Marksheet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter Totalmarks out of 100");
		int Totalmarks=sc.nextInt();

			if (Totalmarks>90 || Totalmarks==100) {
				System.out.println("Grade=AA !");	
		}	else if (Totalmarks>80 || Totalmarks==90) {
				System.out.println("Grade=AB !");	
		}	else if (Totalmarks>70 || Totalmarks==80) {
				System.out.println("Grade=BB !");
		}	else if (Totalmarks>60 || Totalmarks==70) {
				System.out.println("Grade=BC !");
		}	else if (Totalmarks>50 || Totalmarks==60) {
				System.out.println("Grade=CD !");
		}	else if (Totalmarks>40 || Totalmarks==50) {
			System.out.println("Grade=DD !");
		}	else {
			System.out.println("Fail You Fool");
		}
	}

}
