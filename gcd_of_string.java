/*
QUESTION - 

https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/1416162139/?envType=study-plan-v2&envId=leetcode-75

CODE - 
*/
import java.util.Scanner;

class Solution {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0) {
            return "";
        }

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        Solution sol = new Solution();

        String result = sol.gcdOfStrings(str1, str2);
        System.out.println("Greatest common divisor of strings: " + result);
        sc.close();
    }
}
