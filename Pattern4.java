package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();
		
		for(int i = 1; i <= l; i++) {
			for(int j = 1; j <= b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}


//pattern we want to print - 
//Print a rectangle
//Enter the length - 5
//Enter the breadth - 4
//
//****
//****
//****
//****
//****