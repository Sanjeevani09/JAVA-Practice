package pattern;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int col = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= row; i++) {
			if(i % 2 != 0) {  //odd row
				for(int j = 1; j <= col; j++) {
					count = count + 1;
					System.out.print(count + " ");
				}
			}
			else {   //even row
				int temp = count + 1;
				for(int j = count + col ; j >= temp; j--) {
					count = count + 1;
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}


}

//Pattern we want to print
//
//Enter the number of rows : 
//5
//Enter the number of columns : 
//5
//1 2 3 4 5 
//10 9 8 7 6   ---- reverse number at even row
//11 12 13 14 15 
//20 19 18 17 16  ---- reverse number at even row
//21 22 23 24 25 

