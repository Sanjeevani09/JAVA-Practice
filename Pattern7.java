package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int m = 1; m <= n; m++){
			for(int o = 1; o <= m; o++) {
				System.out.print(" ");
			}
			for(int p = n - 1; p >= m ; p--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


/*
Pattern we want to print - 

Enter the number of stars : 
5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
     

*/