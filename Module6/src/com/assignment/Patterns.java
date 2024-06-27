package com.assignment;
//Write a java Program to Print pattern Given Below.
public class Patterns {
	public static void main(String[] args) {
		/*pattern1 & Pattern2 are same
		 * 
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
			System.out.print(j);	
			}
			System.out.println();
		}

		/*pattern3
		 * 
		 * 1
		 * 01
		 * 101
		 * 0101
		 * 10101
		 */
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
			if ((i+j)%2==0) {
			System.out.print("1");	
			}
			else {
			System.out.print("0");	
			}
			}
			System.out.println();	
		}

		/*Pattern4
		 *     1
		 *    2 2
		 *   3 3 3
		 *  4 4 4 4
		 * 5 5 5 5 5
		 * 
		 * first convert this pattern into this
		 * 		  *
		 * 		 **
		 * 		***	
		 * 	   ****
		 * 
		 * 
		 * 
		 */
		System.out.println();
		for (int i = 1; i <=4; i++) {
			for (int k =3; k>=i; k--) {
			System.out.print(" ");	
			}
			for (int j =1; j <=i; j++) {
			System.out.print(" "+i);	
			}
			System.out.println();
		}

		/*Pattern5
		 * 
		 *   *
		 *  ***
		 * *****
		 *  ***
		 *   *
		 * 
		 */
		System.out.println();
		for (int i = 1; i <= 3 ; i++){
			for (int k = i; k <=3; k++){
			System.out.print(" ");
			}
			for (int j = 1; j < 2*i; j++){
			System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i >= 1; i--){
			for (int k = 3; k >= i; k--){
			System.out.print(" ");
			}	
			for (int j = 2*i; j > 1; j--){
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
