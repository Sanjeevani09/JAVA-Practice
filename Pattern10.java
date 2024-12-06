package pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}


//Pattern we want to print : 
//Enter the number : 7
//
//7 6 5 4 3 2 1 
//7 6 5 4 3 2 
//7 6 5 4 3 
//7 6 5 4 
//7 6 5 
//7 6 
//7 
