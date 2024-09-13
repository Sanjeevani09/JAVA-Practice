package pattern;
import java.util.*;
public class pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			for(int j = n; j> i; j--) {
				System.out.print(" ");
			}
			for(int s = 1; s<=i; s++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}


// pattern we want to print
//     *
//    **
//   ***
//  ****
// *****