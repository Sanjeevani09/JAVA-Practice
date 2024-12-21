package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number you want : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for(int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

//Pattern that we want to print - 
//Enter any number you want : 5
//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 

// Enter any number you want : 
// 7
// 1 
// 1 2 1 
// 1 2 3 2 1 
// 1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
// 1 2 3 4 5 6 5 4 3 2 1 
// 1 2 3 4 5 6 7 6 5 4 3 2 1 
