package pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}

//Pattern we want to print : 
//	
//Enter the number : 5
//
//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5

