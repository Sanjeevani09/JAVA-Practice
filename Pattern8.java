package pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int col = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				count = count + 1;
				System.out.print(count + " ");
			}
			System.out.println();
		}

	}

}


//Pattern we want to print
//Enter the number of rows you want : 5
//Enter the number of columns you want : 3
//
//123
//456
//789
//10 11 12
//13 14 15