package pattern;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % 2 != 0) {
					System.out.print("$");
				}
				else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}




//Pattern we want to print
//Enter the number of lines : 5
//#
//$$
//###
//$$$$
//#####
//$$$$$$