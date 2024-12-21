package pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number you want : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int num = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + n - j;
			}
			System.out.println();
		}
		
		sc.close();
	}

}


//Pattern we want to print - 
//Enter any number you want : 
//1
//2 6 
//3 7 10
//4 8 11 13
//5 9 12 14 15

// Enter any number you want : 
// 10
// 1 
// 2 11 
// 3 12 20 
// 4 13 21 28 
// 5 14 22 29 35 
// 6 15 23 30 36 41 
// 7 16 24 31 37 42 46 
// 8 17 25 32 38 43 47 50 
// 9 18 26 33 39 44 48 51 53 
// 10 19 27 34 40 45 49 52 54 55 