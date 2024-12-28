package pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number you want : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}


//Pattern that we want to print - 
//
//Enter any number you want : 
//5
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 


//Enter any number you want : 
//9
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 
//6 5 4 3 2 1 
//7 6 5 4 3 2 1 
//8 7 6 5 4 3 2 1 
//9 8 7 6 5 4 3 2 1 

