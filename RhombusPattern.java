package pattern;

import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number you want : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}


//Pattern we want to print - Rhombus pattern
//Enter any number you want : 5
//* * * * * 
//* * * * * 
// * * * * * 
//  * * * * * 
//   * * * * * 

//rows = 1 to n
//2 loops = one for space and one for column
//space = 1 to row number
//columns = 1 to row number
//elements = row number + col number = even no then print 1 else 0