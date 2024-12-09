package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count = 1;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++, count++) {
				System.out.print(count + " ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}

//Pattern we want to print :
//
//Enter the number : 5
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 