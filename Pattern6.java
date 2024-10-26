package pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum number of stars : ");
		int n = sc.nextInt();
		
		//Above triangle
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Below triangle
		for(int k = 1 ; k <= n; k++) {
			for(int m = n - 1; m >= k; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}
}


/*
Pattern we want to print
Enter the maximum number of stars : 
6
*
**
***
****
*****
******
*****
****
***
**
*

  */
