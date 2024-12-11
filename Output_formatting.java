//QUESTION 
// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

// Input Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

// Output Format

// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly  characters.
// The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

// Sample Input

// java 100
// cpp 65
// python 50
// Sample Output

// ================================
// java           100 
// cpp            065 
// python         050 
// ================================
// Explanation

// Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.

//CODE
import java.io.*;
import java.util.*;

public class Output_formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n1 = sc.nextInt();
        String s2 = sc.next();
        int n2 = sc.nextInt();
        String s3 = sc.next();
        int n3 = sc.nextInt();
        
        System.out.println("================================");
    
        System.out.printf("%-15s%03d\n",s1 ,n1);
        System.out.printf("%-15s%03d\n",s2 ,n2);
        System.out.printf("%-15s%03d\n",s3 ,n3);
        
        System.out.println("================================");
        sc.close();
    }
}