package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}



//pattern we want
//*****
//****
//***
//**
//*



// OUTPUT -
// Enter the number of lines : 
// 5
// *****
// ****
// ***
// **
// *
